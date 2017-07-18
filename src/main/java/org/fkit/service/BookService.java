package org.fkit.service;

import java.util.List;

import org.fkit.domain.Book;


public interface BookService {
	/**
	 * 查找所有图书
	 * @param booktype 
	 * @return 文艺Book对象集合
	 * */
	//遍历文艺书的集合
	List<Book> wygetAll(String booktype);
	/**
	 * 查找所有图书
	 * @param booktype 
	 * @return 科技Book对象集合
	 * */
	//遍历科技书的集合
	List<Book> kjgetAll(String booktype);
  //遍历经管书的集合
    List<Book> jggetAll(String booktype);
//遍历生活书的集合
	List<Book> shgetAll(String booktype);
	List<Book> getAll();
	Book removeBook(int id);
    Book find(int id);
	Book bookadd(String bookimage,String bookname,  String booknomber, String booktype, String bookintro,
			String bookprice, int bookcount);
	
	
}
