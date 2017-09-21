package com.ssm.maven.core.service;

import java.util.List;

import com.ssm.maven.core.domain.Studentpageifo;

public interface StudentpageifoService {
	public void addStuPageByBookId(Integer id ,Studentpageifo sp);
	public Studentpageifo findsPageById(Integer pid);
	public List<Studentpageifo> findPageByBookId(Integer abId);
	public List<Studentpageifo> findsPageByName(String pname) throws Exception;
	public List<Studentpageifo> findAll();
	public void fillStuPage(Studentpageifo stuPage);
	public void updateById(Studentpageifo stuPage);
	public void deleteById(Integer pid);
	
}
