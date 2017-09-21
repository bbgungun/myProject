package com.ssm.maven.core.utils;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.maven.core.service.imp.AlumniBookServiceImp;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration()
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:spring-mvc.xml"})
public class TestPageHelper {
	
	@Autowired
	WebApplicationContext context;
	MockMvc mockmvc;
	@Before
    public void InitMockMvc(){
    	mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
	
	
	
	
	@Test
    public void test() throws Exception {
		MvcResult result = mockmvc.perform(MockMvcRequestBuilders.get("/teacher/ofindAll.do").param("pn", "1")).andReturn();
       MockHttpServletRequest request = result.getRequest();
      PageInfo pi =(PageInfo) request.getAttribute("pageInfo");
      
      System.out.println(pi);
		
    }
}