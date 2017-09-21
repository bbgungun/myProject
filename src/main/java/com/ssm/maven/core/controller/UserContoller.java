package com.ssm.maven.core.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.maven.core.domain.AlumniBookifo;
import com.ssm.maven.core.domain.Userifo;
import com.ssm.maven.core.service.AlumniBookService;
import com.ssm.maven.core.service.UserifoService;

@Controller
@RequestMapping("user")
public class UserContoller {

	/*
	 * public void addUser(Userifo user) throws Exception;//注册 public Userifo
	 * findByUserNameAndPassword(String userName,String userPassword) throws
	 * Exception;//登陆 public void updateById(Userifo user) throws
	 * Exception;//修改个人资料 public void deleteById(Integer id) throws
	 * Exception;//删除用户
	 */

	@Autowired
	private UserifoService uis;
	@Autowired
	private AlumniBookService abs;

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String register(Userifo user, String userPassword, Model model)
			throws Exception {
		System.out.println(user.getUserName());
		if (!uis.findByUserNameAndPassword(user.getUserName(),
				user.getUserPassword()).isEmpty()) {
			model.addAttribute("message", "该姓名已被注册！请重新注册！");
			return "register";
		}
		uis.addUser(user);
		return "login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(String userName, String userPassword, Model model,HttpServletResponse res)
			throws Exception {
		List<Userifo> userlist = uis.findByUserNameAndPassword(userName,
				userPassword);
		if (userlist.size() == 0) {
			model.addAttribute("message", "账号或密码错误！");
			return "login";
		} else {
			Cookie c = new Cookie("userid", String.valueOf(userlist.get(0).getUserId()));
			res.addCookie(c);
			return "forward:/user/welcome.do";
		}
	}

	@RequestMapping(value = "/info.do", method = RequestMethod.POST)
	public String update(String userId, String userAccount,
			String userRealname, String userSex, String userBirth,
			String userEducation, String userEmail, String userTel,
			String userQq, String userAddress, String userDescriptoin,
			Model model) {
		System.out.println(userBirth);
		Userifo user = new Userifo();
		
		user.setUserId(Integer.valueOf(userId));
		user.setUserAccount(userAccount);
		user.setUserAddress(userAddress);
		user.setUserEducation(userEducation);
		user.setUserEmail(userEmail);
		user.setUserQq(userQq);
		user.setUserSex(userSex);
		user.setUserTel(userTel);
		user.setUserDescriptoin(userDescriptoin);
		user.setUserRealname(userRealname);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse(userBirth);
			System.out.println(date);
			user.setUserBirth(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user.toString());
		 try {
			uis.updateById(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Userifo user1 = uis.findUserById(Integer.parseInt(userId));
		 model.addAttribute("user", user1);
		return "welcome";
	}

	
	@RequestMapping(value = "/welcome.do", method = RequestMethod.GET)
	public String update(HttpServletRequest req, Model model){
		Integer userid = null;
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			if("userid".equals(cookie.getName())){
				userid = Integer.parseInt(cookie.getValue());
			}
		}
		Userifo findUserById = uis.findUserById(userid);
		model.addAttribute("user", findUserById);
		List<AlumniBookifo> abbooklist = abs.findAllByUserId(userid);
		if(abbooklist.size()>0)
			model.addAttribute("books", abbooklist);
		return "welcome";
	}
	
	@RequestMapping(value = "/welcome1.do", method = RequestMethod.GET)
	public String update1(@RequestParam("userid")String userid1, Model model){
		Integer userid = Integer.valueOf(userid1);
		Userifo findUserById = uis.findUserById(userid);
		model.addAttribute("user", findUserById);
		List<AlumniBookifo> abbooklist = abs.findAllByUserId(userid);
		if(abbooklist.size()>0)
			model.addAttribute("books", abbooklist);
		return "welcome";
	}
}
