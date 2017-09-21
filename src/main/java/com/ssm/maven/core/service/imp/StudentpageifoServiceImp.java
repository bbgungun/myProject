 package com.ssm.maven.core.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.domain.StudentpageifoExample;
import com.ssm.maven.core.domain.UserifoExample;
import com.ssm.maven.core.mapper.StudentpageifoMapper;
import com.ssm.maven.core.service.StudentpageifoService;
import com.ssm.maven.core.utils.StuException;
import com.ssm.maven.core.utils.UserException;
@Service
public class StudentpageifoServiceImp implements StudentpageifoService{
	@Autowired
	private StudentpageifoMapper spm;
	
	public void setSpm(StudentpageifoMapper spm) {
		this.spm = spm;
	}

	@Override
	public void addStuPageByBookId(Integer id ,Studentpageifo sp) {
		// TODO Auto-generated method stub
		spm.insertSelective(sp);
		spm.linkAS(sp.getpId(),id);
	}

	@Override
	public Studentpageifo findsPageById(Integer pid) {
		// TODO Auto-generated method stub
		Studentpageifo StuPage = spm.selectByPrimaryKey(pid);
		return StuPage;
	}

	@Override
	public void fillStuPage(Studentpageifo stuPage) {
		// TODO Auto-generated method stub
		spm.updateByPrimaryKeySelective(stuPage);
	}

	@Override
	public void deleteById(Integer pid) {
		// TODO Auto-generated method stub
		spm.deleteByPrimaryKey(pid);
	}

	@Override
	public List<Studentpageifo> findsPageByName(String pname) throws Exception{
		// TODO Auto-generated method stub
		StudentpageifoExample example = new StudentpageifoExample();
		example.createCriteria().andPAddressEqualTo(pname);
		List<Studentpageifo> StuPage = spm.selectByExample(example);
		if (!StuPage.isEmpty()) {
			return StuPage;		
		} else {
			throw  new StuException("查询失败!");
		}
	}

	@Override
	public List<Studentpageifo> findAll() {
		// TODO Auto-generated method stub
		StudentpageifoExample example = new StudentpageifoExample();
		List<Studentpageifo> StuPage = spm.selectByExample(example);
		return StuPage;
	}

	@Override
	public List<Studentpageifo> findPageByBookId(Integer abId) {
		// TODO Auto-generated method stub
		List<Integer> spIdlist =spm.selectPidByabId(abId);
		List<Studentpageifo> splist=new ArrayList<Studentpageifo>();
		for (Integer i : spIdlist) {
			if(i != null){
				Studentpageifo stupage = spm.selectByPrimaryKey(i);
				splist.add(stupage);
			}
		}
		System.out.println(splist);
		return splist;
	}

	@Override
	public void updateById(Studentpageifo stuPage) {
		// TODO Auto-generated method stub
		spm.updateByPrimaryKeySelective(stuPage);
	}

}
