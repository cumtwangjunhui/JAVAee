package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
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
   public ModelAndView admindoderupdate(Model model,HttpServletRequest request,ModelAndView mv){
	   String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		String mess="亲，您所订购的商品已发货";
		String email="2237963162@qq.com";
		orderService.update(book_id_);
		Order order=orderService.findOrder(book_id_);
		
		if(order!=null){	
			StringBuffer url = new StringBuffer();
			StringBuilder builder = new StringBuilder();
			// 正文
			builder.append(
					"<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /></head><body>");
			url.append("<font color='red'>" + order + "</font>");
			builder.append("<br/><br/>");
			builder.append("<div>" + mess + "</div>");
			builder.append("</body></html>");
			SimpleEmail sendemail = new SimpleEmail();
			sendemail.setHostName("smtp.163.com");// 指定要使用的邮件服务器
			sendemail.setAuthentication("wjh1997_07_18@163.com", "wjh09153760");// 使用163的邮件服务器需提供在163已注册的用户名、密码
			sendemail.setCharset("UTF-8");
			try {
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("wjh1997_07_18@163.com");
				sendemail.setSubject("物流发货通知");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			} catch (EmailException e) {
				e.printStackTrace();
			}
			List<Order> order_list = orderService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("order_list", order_list);
			mv.setViewName("adminorder");	

//			response.getWriter().println("你的密码为已成功发送到邮箱");	
//			mv.setViewName("login");
		}else{
//					response.getWriter().println("获取密码失败");
			System.out.println("物流状态已发送");
		}
	    return mv;
	}
		
	
	
	   
   }
	
	


