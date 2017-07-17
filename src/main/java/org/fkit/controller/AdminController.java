package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Book;
import org.fkit.domain.Cart;
import org.fkit.domain.Order;
import org.fkit.service.BookService;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	
	@RequestMapping(value = "/admin")
	public String adminlogin(Model model) {	
		return "adminlogin";
	}
	//管理员
	@RequestMapping(value="adminlogin")
	public ModelAndView adminlogin(@RequestParam("adminloginnumber") String aln,
			                 @RequestParam("adminpassword") String ap,Model model,ModelAndView mv,HttpSession session){
		//判断用户登录
		if(aln.equals("admin")&&ap.equals("admin")){
			
			List<Book> book_list = bookService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("book_list", book_list);
			
			mv.setViewName("shoper");
		}else{
			mv.addObject("messages", "登录名或密码错误，请重新输入!");
			mv.setViewName("adminlogin");
		}
		return mv;
		
	}
	@RequestMapping(value="/adminorder")
	public String adminorder(Model model){
		 // 获得所有图书集合
		List<Order> order_list = orderService.getAll();
		// 将图书集合添加到model当中		
		model.addAttribute("order_list", order_list);
		// 跳转到adminorder页面
		return "adminorder";
		
	}
	@RequestMapping(value="adminremoveorder")
	public String adminremoveorder(Model model,HttpServletRequest request){
		
		String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		orderService.removeOrder(book_id_);
		List<Order> order_list = orderService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到adminorder页面
		return "adminorder";
	}
   @RequestMapping(value="admindoderupdate")
   public String admindoderupdate(Model model,HttpServletRequest request){
	   String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		orderService.update(book_id_);
		List<Order> order_list = orderService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到adminorder页面
	return "adminorder";
	   
   }
	
	

}
