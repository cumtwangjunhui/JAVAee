package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.fkit.domain.Order;
import org.fkit.service.CartService;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class OrderController {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	//我的订单
	@RequestMapping(value="/order")
	public String order(Model model){
	        // 获得所有图书集合
			List<Order> order_list = orderService.getAll();
			// 将图书集合添加到model当中		
			model.addAttribute("order_list", order_list);
			// 跳转到order页面
			return "order";
			}
	
	//删除订单的东西
		@RequestMapping(value="/removeorder")
		public String removeorder(Model model,HttpServletRequest request){
			String book_id = request.getParameter("book_id");
			int book_id_ = Integer.parseInt(book_id);
			orderService.removeOrder(book_id_);
			List<Order> order_list = orderService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("order_list", order_list);
			// 跳转到order页面
			return "order";
			}
		//添加订单
		@RequestMapping(value = "/saveorder")
		public String saveorder(HttpServletRequest request,Model model){
			String book_id = request.getParameter("book_id");
			int book_id_ = Integer.parseInt(book_id);
			Order order=orderService.findOrder(book_id_);
			if (order == null) {
				orderService.saveOrder(book_id_);				
			}else {			
				orderService.addOrder(book_id_);				
			}
			cartService.removeCart(book_id_);
			List<Order> order_list = orderService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("order_list", order_list);
			// 跳转到cart页面
			return "order";
		}
}
