package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Book;
import org.fkit.domain.Cart;
import org.fkit.mapper.BookMapper;
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
		public Book removeBook(int book_id) {
			// TODO Auto-generated method stub
			return bookMapper.removeBook(book_id);
			
		}
	
	
	
}
