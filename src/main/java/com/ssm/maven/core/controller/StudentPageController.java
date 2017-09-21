package com.ssm.maven.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.domain.Teacherpageifo;
import com.ssm.maven.core.service.StudentpageifoService;

@Controller
@RequestMapping("student")
public class StudentPageController {

	@Autowired
	private StudentpageifoService spi;

	@RequestMapping(value = "/add.do", method = RequestMethod.GET)
	public String add(@RequestParam("id") String bookid) {
		Studentpageifo student = new Studentpageifo();
		student.setpName("");
		Integer bookid1 = Integer.valueOf(bookid);
		spi.addStuPageByBookId(bookid1, student);
		return "forward:/book/pagefind.do?bookid1=" + bookid1;
	}

	@RequestMapping(value = "/ofindAll.do", method = RequestMethod.GET)
	public String findAll(Model model) {
		List<Studentpageifo> list = new ArrayList<Studentpageifo>();
		list = spi.findAll();
		model.addAttribute("list1", list);
		return "Book";
	}

	@RequestMapping(value = "/findAll.do ", method = RequestMethod.GET)
	public String findAll1(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model) {
		PageHelper.startPage(pn, 8);
		List<Studentpageifo> list = spi.findAll();
		PageInfo<Studentpageifo> page = new PageInfo<Studentpageifo>(list, 1);
		List<Studentpageifo> list1 = page.getList();
		model.addAttribute("page", page);
		model.addAttribute("list", list1);
		return "classmates";
	}

	@RequestMapping(value = "/delet.do", method = RequestMethod.GET)
	public String delete(@RequestParam("pid") String pid,
			@RequestParam("id") String bookid) {
		Integer pid1 = Integer.valueOf(pid);
		Integer bookid1 = Integer.valueOf(bookid);
		spi.deleteById(pid1);
		return "forward:/book/pagefind.do?bookid1=" + bookid1;
	}

	@RequestMapping(value = "/findByName.do")
	public String findByName(String findByName, Model model) throws Exception {
		List<Studentpageifo> list = new ArrayList<Studentpageifo>();
		list = spi.findsPageByName(findByName);
		model.addAttribute("list", list);
		return "classmates";

	}

	@RequestMapping(value = "/fillstudent.do", method = RequestMethod.POST)
	public String fill(Studentpageifo student) {
		System.out.println(student);
		spi.fillStuPage(student);
		return "ok";

	}
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete1(@RequestParam("id") String pid) {
		Integer pid1 = Integer.valueOf(pid);
		spi.deleteById(pid1);
		return "forward:/student/findAll.do";
	}
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Studentpageifo student) {
		System.out.println(student);
		spi.updateById(student);
		return "forward:/student/findAll.do";
	}
	
}
