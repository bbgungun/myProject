package com.ssm.maven.core.service.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.maven.core.domain.AlumniBookifo;
import com.ssm.maven.core.domain.AlumniBookifoExample;
import com.ssm.maven.core.domain.Models;
import com.ssm.maven.core.mapper.AlumniBookifoMapper;
import com.ssm.maven.core.mapper.ModelsMapper;
import com.ssm.maven.core.service.AlumniBookService;
@Service
public class AlumniBookServiceImp implements AlumniBookService{
	@Autowired
	private AlumniBookifoMapper abm;
	@Autowired
	private ModelsMapper mm;
	
	public void setAbm(AlumniBookifoMapper abm) {
		this.abm = abm;
	}

	@Override
	public void addBookByUserId(Integer id, AlumniBookifo book,Integer modelsId) {
		// TODO Auto-generated method stub
		abm.insertSelective(book);
		abm.linkUA(book.getAbId(),id);
		abm.linkAM(book.getAbId(),modelsId);
	}

	@Override
	public List<AlumniBookifo> findAllByUserId(Integer id) {
		// TODO Auto-generated method stub
		ArrayList<Integer> abIdList=(ArrayList)abm.selectByUserId(id);
		List<AlumniBookifo> booklist = new LinkedList<AlumniBookifo>();
		for (Integer abId : abIdList) {
			AlumniBookifo book=abm.selectByPrimaryKey(abId);
			List<Models> getmodels = mm.selectByAbId(abId);
			Models models = null;
			if(getmodels.size()>0)
				models = getmodels.get(0);
			book.setModels(models);
			booklist.add(book);
		}
		
		return booklist;
	}

	@Override
	public AlumniBookifo findByBookId(Integer id) {
		// TODO Auto-generated method stub
		AlumniBookifo value = abm.selectByPrimaryKey(id);
		return value;
	}

	@Override
	public void updateByBookId(AlumniBookifo book) {
		// TODO Auto-generated method stub
		abm.updateByPrimaryKeySelective(book);	
	}

	@Override
	public void deleteByBookId(Integer id) {
		// TODO Auto-generated method stub
		abm.deleteByPrimaryKey(id);
	}

}
