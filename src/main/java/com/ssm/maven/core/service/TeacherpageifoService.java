package com.ssm.maven.core.service;

import java.util.List;



import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.domain.Teacherpageifo;

public interface TeacherpageifoService {
	public void addTeaPageByBookId(Integer id ,Teacherpageifo tp);
	public Teacherpageifo findtPageById(Integer pid);
	public List<Teacherpageifo> findtPageByName(String pname) throws Exception;
	public List<Teacherpageifo> findAll();
	public List<Teacherpageifo> findPageByBookId(Integer abId);
	public void fillTeaPage(Teacherpageifo teaPage);
	public void updateById(Teacherpageifo teaPage);
	public void deleteById(Integer pid);
}
