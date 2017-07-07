package org.fkit.domain;

import java.util.List;

public class Collect {
	private int id;
	private List<Book> book;
	private int book_id;
	private int user_id;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "collect [id=" + id + ", book=" + book + ", book_id=" + book_id + ", user_id=" + user_id + "]";
	}
	public void setId(int id) {
		this.id = id;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	

}
