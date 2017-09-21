package com.ssm.maven.core.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.maven.core.domain.Models;
import com.ssm.maven.core.domain.ModelsExample;
import com.ssm.maven.core.domain.UserifoExample;
import com.ssm.maven.core.mapper.ModelsMapper;
import com.ssm.maven.core.service.ModelsService;
@Service
public class ModelsServiceImp implements ModelsService{
	@Autowired
	private ModelsMapper mm;
	
	public void setMm(ModelsMapper mm) {
		this.mm = mm;
	}

	@Override
	public List<Models> findAll() {
		// TODO Auto-generated method stub
		ModelsExample example = new ModelsExample();
		return mm.selectByExample(example);
	}

	@Override
	public Models findById(Integer id) {
		// TODO Auto-generated method stub
		Models models = mm.selectByPrimaryKey(id);
		return models;
	}

	@Override
	public Integer findMidByabId(Integer abId) {
		// TODO Auto-generated method stub
		List<Models> Mlist = mm.selectByAbId(abId);
		Models models = null;
		if(Mlist.size()>0)
			models = Mlist.get(0);
		return models.getModelsId();
	}
	
}
