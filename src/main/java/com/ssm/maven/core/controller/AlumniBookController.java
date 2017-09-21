package com.ssm.maven.core.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.maven.core.domain.AlumniBookifo;
import com.ssm.maven.core.domain.Models;
import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.domain.Teacherpageifo;
import com.ssm.maven.core.service.AlumniBookService;
import com.ssm.maven.core.service.ModelsService;
import com.ssm.maven.core.service.StudentpageifoService;
import com.ssm.maven.core.service.TeacherpageifoService;

@Controller
@RequestMapping("book")
public class AlumniBookController {
	
	/*
	public void addBookByUserId(Integer id,AlumniBookifo book);
	public List<AlumniBookifo> findAllByUserId(Integer id);
	public AlumniBookifo findByBookId(Integer id);
	public void updateByBookId(AlumniBookifo book);
	public void deleteByBookId(Integer id);
	 */
	@Autowired
	private AlumniBookService abs;
	
	@Autowired
	private StudentpageifoService spis;
	
	@Autowired
	private TeacherpageifoService tpis;
	@Autowired
	private ModelsService ms;
	
	@RequestMapping(value = "/add.do", method = RequestMethod.GET)
	public String add(AlumniBookifo alumnibook, String userId, String modelsId, Model model) {
		byte[] bytes;
		try {
			bytes = alumnibook.getAbDescription().getBytes("ISO-8859-1");
			alumnibook.setAbDescription(new String(bytes,"UTF-8"));
			bytes = alumnibook.getAbName().getBytes("ISO-8859-1");
			alumnibook.setAbName(new String(bytes,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		abs.addBookByUserId(Integer.valueOf(userId), alumnibook,Integer.valueOf(modelsId));
		List<AlumniBookifo> list = abs.findAllByUserId(Integer.valueOf(userId));
		//System.out.println(list);
		if(list.size()>0)
		model.addAttribute("books", list);
		return "forward:/user/welcome1.do?userid=" + userId;
	}

	@RequestMapping(value = "/delete.do", method = RequestMethod.POST)
	public String delete(Integer bookid) {
		abs.deleteByBookId(bookid);
		return "forward:/bookfind";
	}

	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public String update(AlumniBookifo book) {
		abs.updateByBookId(book);
		return "forward:/bookfind";
	}

	@RequestMapping(value = "/userfind.do", method = RequestMethod.POST)
	public String userfind(Integer userid, Model model) {
		List<AlumniBookifo> list = new ArrayList<AlumniBookifo>();
		list = abs.findAllByUserId(userid);
		model.addAttribute("item", list);
		return "welcome";
	}

	@RequestMapping(value = "/bookfind.do", method = RequestMethod.POST)
	public String bookfind(Integer id, Model model) {
		AlumniBookifo book = abs.findByBookId(id);
		model.addAttribute("book", book);
		return "welcome";
	}
	
	@RequestMapping(value="/pagefind.do",method=RequestMethod.GET)
	public String pagefind(@RequestParam("id")Integer abId,HttpServletRequest request,Model model){
		List<Studentpageifo> list = new ArrayList<Studentpageifo>();
		list = spis.findPageByBookId(abId);
		model.addAttribute("list", list);
		System.out.println("///////////"+list.toString());
		List<Teacherpageifo> list1 = new ArrayList<Teacherpageifo>();
		list1 = tpis.findPageByBookId(abId);
		model.addAttribute("list1", list1);
		System.out.println("************************"+list1.toString());
		Integer mid = ms.findMidByabId(abId);
		Models models = ms.findById(mid);
		model.addAttribute("models", models);
		model.addAttribute("abId", abId);
		return "Book";
	}

	
	@RequestMapping(value="/pagefind1.do",method=RequestMethod.GET)
	public String pagefind1(@RequestParam("idd")String abId1,Model model){
		System.out.println(abId1);
		Integer abId = Integer.parseInt(abId1);
		List<Studentpageifo> list = new ArrayList<Studentpageifo>();
		list = spis.findPageByBookId(abId);
		for(Studentpageifo student:list){
			System.out.println(student.toString());
		}
		model.addAttribute("list", list);
		System.out.println("///////////"+list.toString());
		List<Teacherpageifo> list1 = new ArrayList<Teacherpageifo>();
		list1 = tpis.findPageByBookId(abId);
		model.addAttribute("list1", list1);
		Integer mid = ms.findMidByabId(abId);
		System.out.println("************************"+list1.toString());
		Models models = ms.findById(mid);
		model.addAttribute("models", models);
		model.addAttribute("abId", abId);
		return "Book";
	}
}
