package com.ssm.maven.core.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.domain.StudentpageifoExample;
import com.ssm.maven.core.domain.Teacherpageifo;
import com.ssm.maven.core.domain.TeacherpageifoExample;
import com.ssm.maven.core.mapper.TeacherpageifoMapper;
import com.ssm.maven.core.service.TeacherpageifoService;
import com.ssm.maven.core.utils.TeaException;
@Service
public class TeacherpageifoServiceImp implements TeacherpageifoService{
	@Autowired
	private TeacherpageifoMapper tpm;
	
	public void setTpm(TeacherpageifoMapper tpm) {
		this.tpm = tpm;
	}

	@Override
	public void addTeaPageByBookId(Integer id, Teacherpageifo tp) {
		// TODO Auto-generated method stub
		tpm.insertSelective(tp);
		tpm.linkAT(tp.getTeacherpageifoId(),id);
	}

	@Override
	public Teacherpageifo findtPageById(Integer pid) {
		// TODO Auto-generated method stub
		Teacherpageifo teaPage = tpm.selectByPrimaryKey(pid);
		return teaPage;
	}

	@Override
	public void fillTeaPage(Teacherpageifo teaPage) {
		// TODO Auto-generated method stub
		tpm.updateByPrimaryKeySelective(teaPage);
	}

	@Override
	public void deleteById(Integer pid) {
		// TODO Auto-generated method stub
		tpm.deleteByPrimaryKey(pid);
	}

	@Override
	public List<Teacherpageifo> findtPageByName(String pname) throws Exception {
		// TODO Auto-generated method stub
		TeacherpageifoExample example = new TeacherpageifoExample();
		example.createCriteria().andAddressEqualTo(pname);
		List<Teacherpageifo> TeaPage = tpm.selectByExample(example);
		if (!TeaPage.isEmpty()) {
			return TeaPage;		
		} else {
			throw  new TeaException("查询失败!");
		}
	}

	@Override
	public List<Teacherpageifo> findAll() {
		// TODO Auto-generated method stub
		TeacherpageifoExample example = new TeacherpageifoExample();
		List<Teacherpageifo> TeaPage = tpm.selectByExample(example);
		return TeaPage;
	}

	@Override
	public List<Teacherpageifo> findPageByBookId(Integer abId) {
		// TODO Auto-generated method stub
		List<Integer> tpIdlist =tpm.selectPidByabId(abId);
		List<Teacherpageifo> tplist=new ArrayList<Teacherpageifo>();
		for (Integer i : tpIdlist) {
			if(i != null){
				Teacherpageifo teapage = tpm.selectByPrimaryKey(i);
				tplist.add(teapage);
			}
		}
		System.out.println(tplist);
		return tplist;
	}

	@Override
	public void updateById(Teacherpageifo teaPage) {
		// TODO Auto-generated method stub
		tpm.updateByPrimaryKeySelective(teaPage);
	}

}
