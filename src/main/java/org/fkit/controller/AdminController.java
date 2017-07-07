package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	@RequestMapping(value = "/admin")
	public String adminlogin(Model model) {	
		return "adminlogin";
	}
	
	@RequestMapping(value="adminlogin")
	public ModelAndView adminlogin(@RequestParam("adminloginnumber") String aln,
			                 @RequestParam("adminpassword") String ap,Model model,ModelAndView mv,HttpSession session){
		//判断用户登录
		if(aln.equals("admin")&&ap.equals("admin")){
			mv.setViewName("manage");
		}else{
			mv.addObject("messages", "登录名或密码错误，请重新输入!");
			mv.setViewName("adminlogin");
		}
		return mv;
		
	}
	

}
