package com.ssm.maven.core.controller;

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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.domain.Teacherpageifo;
import com.ssm.maven.core.service.TeacherpageifoService;

@Controller
@RequestMapping("teacher")
public class TeacherPageController {
	/*
	 * public void addTeaPageByBookId(Integer id ,Teacherpageifo tp); public
	 * Teacherpageifo findtPageById(Integer pid); public Teacherpageifo
	 * findtPageByName(String pname) throws Exception; public
	 * List<Teacherpageifo> findAll(); public void fillTeaPage(Teacherpageifo
	 * teaPage); public void deleteById(Integer pid);;
	 */
	@Autowired
	private TeacherpageifoService tpi;

	@RequestMapping(value = "/add.do", method = RequestMethod.GET)
	public String add(@RequestParam("id") String bookid) {
		Teacherpageifo teacher = new Teacherpageifo();
		teacher.settName("");
		Integer bookid1 = Integer.valueOf(bookid);
		tpi.addTeaPageByBookId(bookid1, teacher);
		return "forward:/book/pagefind.do?bookid1=" + bookid1;
	}

	@RequestMapping(value = "/delet.do", method = RequestMethod.GET)
	public String delete(@RequestParam("pid")String pid,@RequestParam("id")String bookid) {
		Integer pid1 = Integer.valueOf(pid);
		Integer bookid1 = Integer.valueOf(bookid);
		tpi.deleteById(pid1);
		return "forward:/book/pagefind.do?bookid1=" + bookid1;
	}

	@RequestMapping(value = "/find.do", method = RequestMethod.GET)
	public String find(Integer pid, Model model) {
		Teacherpageifo teacher = tpi.findtPageById(pid);
		model.addAttribute("teacher", teacher);
		return "forward:/findAll";
	}

	@RequestMapping(value = "/teacher.do", method = RequestMethod.GET)
	public String findTeascherAll(String findByName, Model model)
			throws Exception {
		List<Teacherpageifo> list = new ArrayList<Teacherpageifo>();
		list = tpi.findtPageByName(findByName);
		model.addAttribute("item", list);
		return "teachers";
	}

	@RequestMapping(value = "/findAll.do", method = RequestMethod.GET)
	public String findAll(Model model) {
		List<Teacherpageifo> list = new ArrayList<Teacherpageifo>();
		list = tpi.findAll();
		model.addAttribute("list1", list);
		return "Book";
	}

	@RequestMapping(value = "/ofindAll.do ", method = RequestMethod.GET)
	public String findAll1(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
	Model model) {
		PageHelper.startPage(pn, 8);
		List<Teacherpageifo> list = tpi.findAll();
		PageInfo<Teacherpageifo> page = new PageInfo<Teacherpageifo>(list, 1);
		List<Teacherpageifo> list1 = page.getList();
		model.addAttribute("page", page);
		model.addAttribute("list", list1);
		return "teachers";
	}
	@RequestMapping(value = "/fillsteacher.do", method = RequestMethod.POST)
	public String fill(Teacherpageifo teacher) {
		tpi.fillTeaPage(teacher);
		return "ok";

	}
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete1(@RequestParam("id") String tid) {
		Integer tid1= Integer.valueOf(tid);
		tpi.deleteById(tid1);
		return "forward:/teacher/ofindAll.do";
	}
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Teacherpageifo teacher) {
		tpi.updateById(teacher);
		return "forward:/teacher/ofindAll.do";
	}
	

}
