package com.ssm.maven.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.maven.core.service.AlumniBookService;
import com.ssm.maven.core.service.ModelsService;
import com.ssm.maven.core.service.StudentpageifoService;
import com.ssm.maven.core.service.TeacherpageifoService;
import com.ssm.maven.core.utils.MailUtils;

@Controller
@RequestMapping("email")
public class SendEmailController {
	@Autowired
	private StudentpageifoService spis;
	@Autowired
	private TeacherpageifoService tpis;
	@Autowired
	private AlumniBookService abs;
	@Autowired
	private ModelsService ms;
	
	@RequestMapping(value="/sendto.do", method=RequestMethod.GET)
	public String send(@RequestParam("pid")String pid,@RequestParam("type")String type,String address,String name,@RequestParam("id")String booki){
		String ip = "127.0.0.1";
		String port = "8080";
		String email = null;
		
		
		if("teacher".equals(type)){
			email = "http://" + ip +":"+ port + "/a/email/getteacherform.do?pid=" + pid;
		
		
		}else if("student".equals(type)){
			email = "http://" + ip +":"+ port + "/a/email/getstudentform.do?pid=" +pid;
		}
		
		MailUtils.sendMail(address,email,name);
		
		System.out.println("------------"+booki);
		return "forward:/book/pagefind1.do?idd=" + booki;
	}
	
	@RequestMapping(value="/getteacherform.do",method=RequestMethod.GET)
	public String getteacherform(@RequestParam("pid")String pid,Model model){
		Integer pid1 = Integer.valueOf(pid);
		model.addAttribute("pid", pid1);
		return "fillteacher";
		}
	@RequestMapping(value="/getstudentform.do",method=RequestMethod.GET)
	public String getstudentform(@RequestParam("pid")String pid,Model model){
		Integer pid1 = Integer.valueOf(pid);
		model.addAttribute("pid", pid1);
		return "fillstudent";
		}

}
