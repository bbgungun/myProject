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
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.maven.core.domain.Models;
import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.service.ModelsService;
import com.ssm.maven.core.utils.JSONUtil;

@Controller
@RequestMapping("models")
public class ModelsControoler {
	@Autowired
	private ModelsService ms;

	@RequestMapping(value = "/find.do", method = RequestMethod.GET)
	public @ResponseBody String find(Models models, Model model) {
		List<Models> modellist;
		modellist = ms.findAll();
		return JSONUtil.objectToString(modellist);
//		model.addAttribute("item", list);
//		return "welcome";
	}

//	@RequestMapping(value = "/find.do", method = RequestMethod.POST)
//	public String findById(Integer id, Model model) {
//		
//		Models models = ms.findById(id);
//		
//		model.addAttribute("models", models);
//		return "welcome";
//	}

}
