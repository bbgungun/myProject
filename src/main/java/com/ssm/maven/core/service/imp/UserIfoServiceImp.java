package com.ssm.maven.core.service.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.maven.core.utils.UserException;
import com.ssm.maven.core.domain.Userifo;
import com.ssm.maven.core.domain.UserifoExample;
import com.ssm.maven.core.domain.UserifoExample.Criteria;
import com.ssm.maven.core.mapper.UserifoMapper;
import com.ssm.maven.core.service.UserifoService;
@Service
public class UserIfoServiceImp implements UserifoService{
	@Autowired
	private UserifoMapper uim;
	
	public void setUim(UserifoMapper uim) {
		this.uim = uim;
	}

	@Override
	public void addUser(Userifo user) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName());
		UserifoExample example = new UserifoExample();
		example.createCriteria().andUserNameEqualTo(user.getUserName());
		List<Userifo> selectByExample = uim.selectByExample(example);
		if (selectByExample.isEmpty()) {
			uim.insertSelective(user);
		}else{
			throw  new UserException("该用户已存在");
		}
	}


	@Override
	public List<Userifo> findByUserNameAndPassword(String userName,
			String userPassword) throws Exception {
		// TODO Auto-generated method stub
		UserifoExample example = new UserifoExample();
		example.or().andUserNameEqualTo(userName).andUserPasswordEqualTo(userPassword);
		return uim.selectByExample(example);
	}

	@Override
	public void updateById(Userifo user) throws Exception {
		// TODO Auto-generated method stub
		//UserifoExample example = new UserifoExample();
		uim.updateByPrimaryKeySelective(user);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		uim.deleteByPrimaryKey(id);
	}

	@Override
	public Userifo findUserById(Integer id) {
		// TODO Auto-generated method stub
		Userifo User = uim.selectByPrimaryKey(id);
		return User;
	}

}
