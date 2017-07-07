package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/userlogin")
	 public ModelAndView userlogin(
			 String loginnumber,String password,
			 ModelAndView mv,
			 HttpSession session,HttpServletRequest request){
		// 根据登录名和密码查找用户，判断用户登录

		User user = userService.login(loginnumber, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到mainshop请求
			mv.setViewName("mainshop");
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("login");
		}
		
		return mv;
	}
	
	 @RequestMapping(value = "/enroll",method = RequestMethod.POST)

		public ModelAndView register(String username, String loginnumber,String password,String phone,String address,ModelAndView mv, HttpSession session) {
			// 根据输入的登录名和密码向数据库中添加新的用户信息,完成注册
			User user = userService.register(username, loginnumber,password,phone,address);
			// 注册成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到login请求
			mv.setViewName("login");
			return mv;
		}
	 //通过账号以及手机号来找回密码
	 @RequestMapping(value="/find",method = RequestMethod.POST)
	 public ModelAndView findpassword(String loginnumber,String phone,ModelAndView mv, HttpSession session){
		 User user=userService.find(loginnumber, phone);
		 if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
				session.setAttribute("user", user);
				System.out.println(user.getPassword());
				// 转发到findpassword请求
				mv.setViewName("findpassword");
		 }else{
				// 验证失败，设置失败提示信息，并跳转到找回密码页面
				mv.addObject("message", "账户名或者电话错误，请重新输入!");
				mv.setViewName("findpassword");
			}
			return mv;
		 
		 
	 }
	 //遍历用户
	 @RequestMapping(value = "/users")
		public String users(Model model) {
			
			// 获得所有图书集合
			List<User> user_list = userService.getAll();
			// 将图书集合添加到model当中
			
			model.addAttribute("user_list", user_list);
			// 跳转到cart页面
			return "users";
		
		}
}
