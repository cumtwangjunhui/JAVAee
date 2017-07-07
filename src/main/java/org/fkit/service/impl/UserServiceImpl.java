package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String loginnumber, String password) {
		return userMapper.findWithLoginnameAndPassword(loginnumber, password);
	}
	@Override
	public User register(String username, String loginnumber, String password, String phone, String address) {
		User user=new User();
		user.setUsername(username);
		user.setLoginnumber(loginnumber);
		user.setPassword(password);
		user.setPhone(phone);
		user.setAddress(address);
		userMapper.saveUser(user);
		return user;
	}
	@Override
	public User find(String loginnumber, String phone) {
		// TODO Auto-generated method stub
		 return userMapper.findPassword(loginnumber, phone);
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		System.out.print("nihao");
		return userMapper.findAll();
	}
	

}
