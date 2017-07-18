package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.fkit.domain.Book;
import org.fkit.domain.Lisi;
import org.fkit.domain.Order;
import org.fkit.service.BookService;
import org.fkit.service.LisiService;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HistoryController {
	 
		@Autowired
		@Qualifier("lisiService")
		private LisiService lisiService;
		@Autowired
		@Qualifier("orderService")
		private OrderService orderService;
		
		@Autowired
		@Qualifier("bookService")
		private BookService bookService;
		@RequestMapping(value="/lisi")
		public String lisi(Model model){
			// 获得所有图书集合
					List<Lisi> lisi_list=lisiService.getAll();
					model.addAttribute("lisi_list",lisi_list);
					//返回收藏的页面
			return "history";
}
		@SuppressWarnings("null")
		@RequestMapping(value="/buy")
		public String buy(HttpServletRequest request,Model model){
			String book_id = request.getParameter("book_id");
			int book_id_ = Integer.parseInt(book_id);
			Book book=bookService.find(book_id_);
			model.addAttribute("bookname", book.getBookname());
			model.addAttribute("bookimg", book.getBookimage());
			model.addAttribute("number", book.getBooknomber());
			model.addAttribute("intro", book.getBookintro());
			model.addAttribute("price", book.getBookprice());
			Order order=orderService.findOrder(book_id_);
			model.addAttribute("book_id", order.getBook_id());
			Lisi lisi=lisiService.findLisi(book_id_);			
			if (lisi == null) {
			lisiService.saveLisi(book_id_);	
			
			}else {			
				System.out.println("加入历史订单");				
			}	
			orderService.removeOrder(book_id_);
			return "pingjia";
			
		}
		
		//评价
		@RequestMapping(value="/comment")
		public String orderping(Model model,HttpServletRequest request) {
			String book_id_ = request.getParameter("book_id");
			int book_id = Integer.parseInt(book_id_);
			String wuliu=request.getParameter("tra");
			String ziliang=request.getParameter("pro");
			String fuwu=request.getParameter("ser");
			System.out.print("王俊辉i");
			System.out.print(fuwu);
			System.out.println(ziliang);
			System.out.println(wuliu);
			System.out.print(book_id);
			lisiService.pingjia(wuliu, ziliang, fuwu, book_id);
			return "order";
			
		}
}