package org.fkit.domain;

import java.util.List;

public class Cart {
	private int id;
	private List<Book> book;
	private int count;
	private int book_id;
	private int user_id;
	

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
	@Override
	public String toString() {
		return "Cart [id=" + id + ", book=" + book + ", count=" + count + ", book_id=" + book_id + ", user_id="
				+ user_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
}
