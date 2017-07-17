package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.fkit.domain.Cart;
import org.fkit.domain.Collect;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollectController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;

	@RequestMapping(value="/collect")
	public String collect(Model model){
		// 获得所有图书集合
				List<Collect> collect_list=collectService.getAll();
				model.addAttribute("collect_list",collect_list);
				//返回收藏的页面
		return "collect";
		
	}
	//全部清空
		@RequestMapping(value = "/clearcollect")
		public String clearcollect(Model model) {
			collectService.clearCollect();
			List<Collect> collect_list = collectService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("collect_list", collect_list);
			// 跳转到collect页面
			return "collect";
}
	//添加收藏
		@RequestMapping(value = "/savecollect")
		public String savecollect(HttpServletRequest request,Model model) {
			String book_id = request.getParameter("book_id");
			int book_id_ = Integer.parseInt(book_id);
			Collect collect=collectService.findCollect(book_id_);
			if(collect==null){
				collectService.saveCollect(book_id_);	
			}else{
				String collectmessage="本商品已经添加收藏夹";
				System.out.println(collectmessage);
			}
			List<Collect> collect_list = collectService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("collect_list", collect_list);
			// 跳转到collect页面
			return "collect";
}
		//取消收藏
		@RequestMapping(value="/removecollect")
		public String removecollect(Model model,HttpServletRequest request){
			String book_id = request.getParameter("book_id");
			int book_id_ = Integer.parseInt(book_id);
			collectService.removeCollect(book_id_);
			List<Collect> collect_list = collectService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("collect_list", collect_list);
			// 跳转到collect页面
			return "collect";
		}
}