package org.fkit.service;

import java.util.List;
import org.fkit.domain.User;

/**
 * User服务层接口
 * */
public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(String loginnumber,String password);
	User register(String username,String loginnumber,String password,String phone,String address,String email);
	User find(String loginnumber,String email);
	User update(String loginnumber,String password,String newpwd);
	User removeUser(int id);
	List<User> getAll();
}
