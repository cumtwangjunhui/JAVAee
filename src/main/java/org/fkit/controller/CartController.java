package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.domain.User;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.SessionScope;

@Controller
public class CartController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	
	@RequestMapping(value = "/cart")
	public String cart(Model model) {
		
		// 获得所有图书集合
		List<Cart> cart_list = cartService.getAll();
		// 将图书集合添加到model当中
		
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	
	}
	
	@RequestMapping(value = "/save")
	public String save(HttpServletRequest request,Model model) {
		String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		Cart cart=cartService.findCart(book_id_);
		if (cart == null) {
			cartService.saveCart(book_id_);
		}else {			
			cartService.addCart(book_id_);	
		}
		List<Cart> cart_list = cartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	//清空购物车
	@RequestMapping(value = "/clear")
	public String clear(Model model) {
		cartService.clearCart();
		List<Cart> cart_list = cartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";

	}
	//从购物车里减少数量
	@RequestMapping(value="/reduce")
	public String reduce(Model model,HttpServletRequest request){
		String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		cartService.reduceCart(book_id_);
		List<Cart> cart_list = cartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	//取消购物车的东西
	@RequestMapping(value="/remove")
	public String remove(Model model,HttpServletRequest request){
		String book_id = request.getParameter("book_id");
		int book_id_ = Integer.parseInt(book_id);
		cartService.removeCart(book_id_);
		List<Cart> cart_list = cartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	
	
	

}
