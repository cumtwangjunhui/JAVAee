package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Cart;
import org.fkit.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from user where loginnumber=#{loginnumber} and password=#{password}")
	 User findWithLoginnameAndPassword(@Param("loginnumber") String loginnumber, @Param("password") String password);

	 @Insert("insert into user(username,loginnumber,password,phone,address,email) values(#{username},#{loginnumber},#{password},#{phone},#{address},#{email})")
	 @Options(useGeneratedKeys = true, keyProperty = "id")
	 int saveUser(User user);
	 
	 @Select("select * from user where id=#{id}")
		@Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "username", property = "username"),
				@Result(column = "loginnumber", property = "loginnumber"), @Result(column = "password", property = "password"),
				@Result(column = "phone", property = "phone"),@Result(column = "address", property = "address"),
				 })
		List<User> selectByUserId(int id);
	 //找回密码
	 @Select("select * from user where loginnumber=#{loginnumber} and phone=#{phone}")
	 User findPassword(@Param("loginnumber") String loginnumber, @Param("phone") String phone);
	 //遍历用户
	 @Select("select * from user")
	 List<User> findAll();
	 //删除用户
	 @Delete("delete from user where id=#{id}")
		void removeUser(User user);
    //用id找用户
	 @Select("select * from user where id=#{id}")
		@Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "username", property = "username"),
				@Result(column = "loginnumber", property = "loginnumber"), @Result(column = "password", property = "password"),
				@Result(column = "phone", property = "phone"),@Result(column = "address", property = "address"),
				 })
	 User findWithId(@Param("id") int id);
	 //修改密码
	 @Update("update user set password=#{newpwd} where loginnumber=#{loginnumber} and password=#{password}")
	 int updatemima(User user);
}

