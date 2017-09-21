package com.ssm.maven.core.service;

import java.util.List;

import com.ssm.maven.core.domain.Models;

public interface ModelsService {
	public List<Models> findAll();
	public Models findById(Integer id);
	public Integer findMidByabId(Integer abId);
}
