package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Book;
import org.fkit.domain.Cart;
import org.fkit.domain.User;
import org.fkit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class BookController {
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	/**
	 * 处理href请求
	 * */
	// 获得所有文艺类图书集合
	@RequestMapping(value="/wenyibook")
	 public String wenyibook(Model model){
		// 获得所有图书集合
		String booktype="wybook";
		List<Book> wybook_list = bookService.wygetAll(booktype);
		// 将图书集合添加到model当中
		model.addAttribute("wybook_list", wybook_list);
		// 跳转到wenyibook页面
		return "wenyibook";
	}
	
	// 获得所有科技类图书集合
		@RequestMapping(value="/kejibook")
		public String kejibook(Model model){
			String booktype="kjbook";
			List<Book> kjbook_list=bookService.kjgetAll(booktype); 
			// 将图书集合添加到model当中
			model.addAttribute("kjbook_list", kjbook_list);
			// 跳转到kejibook页面
			return "kejibook";
		}
		

		/**
		 * 处理href请求
		 * */
		// 获得所有经管类图书集合
		@RequestMapping(value="/jingguanbook")
		 public String jingguanbook(Model model){
			// 获得所有图书集合
			String booktype="jgbook";
			List<Book> jgbook_list = bookService.jggetAll(booktype);
			// 将图书集合添加到model当中
			model.addAttribute("jgbook_list", jgbook_list);
			// 跳转到经管book页面
			return "jingguanbook";
		}
		
		/**
		 * 处理href请求
		 * */
		// 获得所有生活类图书集合
		@RequestMapping(value="/shenghuobook")
		 public String shenghuobook(Model model){
			// 获得所有图书集合
			String booktype="shbook";
			List<Book> shbook_list = bookService.shgetAll(booktype);
			// 将图书集合添加到model当中
			model.addAttribute("shbook_list", shbook_list);
			// 跳转到经管book页面
			return "shenghuobook";
		}
		//遍历书籍
		 @RequestMapping(value = "/jieguobooks")
			public String jieguobooks(Model model) {
				
				// 获得所有图书集合
				List<Book> book_list = bookService.getAll();
				// 将图书集合添加到model当中
				
				model.addAttribute("book_list", book_list);
				// 跳转到good页面
				return "good";
			
			}
		 
		//下架
			@RequestMapping(value="/removebook")
			public String removebook(Model model,HttpServletRequest request){
				String book_id = request.getParameter("book_id");
				int book_id_ = Integer.parseInt(book_id);
				
				bookService.removeBook(book_id_);
				
				List<Book> book_list = bookService.getAll();
				// 将图书集合添加到model当中
				model.addAttribute("book_list", book_list);
				// 跳转到good页面
				return "good";
	}

			@RequestMapping(value = "/bookadd",method = RequestMethod.POST)

			public ModelAndView bookadd(String bookimage,String bookname,String booknomber,String booktype,String bookintro,String bookprice,int bookcount,ModelAndView mv, HttpSession session) {
				// 根据输入的登录名和密码向数据库中添加新的用户信息,完成注册
				Book book = bookService.bookadd(bookimage,bookname,booknomber,booktype,bookintro,bookprice,bookcount);
				// 注册成功，将user对象设置到HttpSession作用范围域
				session.setAttribute("book", book);
				// 转发到login请求
				mv.setViewName("bookadd");
				return mv;
			}

}