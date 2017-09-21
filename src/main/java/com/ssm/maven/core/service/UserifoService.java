package com.ssm.maven.core.service;



import java.util.List;

import com.ssm.maven.core.domain.Userifo;

public interface UserifoService {
	public void addUser(Userifo user) throws Exception;//注册
	public List<Userifo> findByUserNameAndPassword(String userName,String userPassword) throws Exception;//登陆
	public Userifo findUserById(Integer id);
	public void updateById(Userifo user) throws Exception;//修改个人资料
	public void deleteById(Integer id) throws Exception;//删除用户
}
