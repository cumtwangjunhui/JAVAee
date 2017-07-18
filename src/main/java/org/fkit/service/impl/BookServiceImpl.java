package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Book;
import org.fkit.domain.Cart;
import org.fkit.domain.User;
import org.fkit.mapper.BookMapper;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("bookService")
public class BookServiceImpl implements BookService{
	/**
	 * 自动注入BookMapper
	 * */
	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private OrderMapper orderMapper;
	@Transactional(readOnly=true)	
	//查文艺书
	@Override
	public List<Book> wygetAll(String booktype) {
		// TODO Auto-generated method stub
		return bookMapper.wyfindAll(booktype);
	}
	//科技类图书
	@Transactional(readOnly=true)
	@Override
	public List<Book> kjgetAll(String booktype) {
		// TODO Auto-generated method stub
		return bookMapper.kjfindAll(booktype);
	}
	//经管类图书
	@Transactional(readOnly=true)
	@Override
	public List<Book> jggetAll(String booktype) {
		// TODO Auto-generated method stub
		return bookMapper.jgfindAll(booktype);
	}
	//生活类图书
		@Transactional(readOnly=true)
		@Override
		public List<Book> shgetAll(String booktype) {
			// TODO Auto-generated method stub
			return bookMapper.shfindAll(booktype);
		}
		@Override
		public List<Book> getAll() {
			// TODO Auto-generated method stub
			return bookMapper.findAll();
		}
		@Override
		public Book removeBook(int id) {
			// TODO Auto-generated method stub
			Book book = bookMapper.findWithId(id);
			bookMapper.removeBook(book);
			return book;
			
		}
	
		@Override
		public Book bookadd(String bookimage,String bookname,String booknomber,String booktype,String bookintro,String bookprice,int bookcount) {
			// TODO Auto-generated method stub
			Book book=new Book();
			book.setBookname(bookname);
			book.setBookimage(bookimage);
			book.setBooknomber(booknomber);
			book.setBooktype(booktype);
			book.setBookintro(bookintro);
			book.setBookprice(bookprice);
			book.setBookcount(bookcount);
			bookMapper.saveBook(book);
			return book; 
			
			
		}
		@Override
		public Book find(int id) {
			// TODO Auto-generated method stub
			return bookMapper.findWithId(id);
		}
	
		
	
	
}
