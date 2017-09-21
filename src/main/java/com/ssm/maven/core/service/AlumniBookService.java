package com.ssm.maven.core.service;

import java.util.List;



import com.ssm.maven.core.domain.AlumniBookifo;

public interface AlumniBookService {
	public void addBookByUserId(Integer id,AlumniBookifo book,Integer modelsId);
	public List<AlumniBookifo> findAllByUserId(Integer id);
	public AlumniBookifo findByBookId(Integer id);
	
	public void updateByBookId(AlumniBookifo book);
	public void deleteByBookId(Integer id);
}
