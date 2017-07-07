package org.fkit.domain;

public class Book {
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookimage=" + bookimage + ", booknomber=" + booknomber + ", bookname=" + bookname
				+ ", booktype=" + booktype + ", bookintro=" + bookintro + ", bookprice=" + bookprice + ", bookcount="
				+ bookcount + "]";
	}
	private Integer id;
	private String bookimage;
    private String booknomber;
    private String bookname;
    private String booktype;
    private String bookintro;
    private String bookprice;
    private int bookcount;
    public String getBookprice() {
		return bookprice;
	}
	public void setBookprice(String bookprice) {
		this.bookprice = bookprice;
	}
	
	public String getImage() {
		return bookimage;
	}
	public void setImage(String image) {
		this.bookimage = image;
	}
	public String getBooknomber() {
		return booknomber;
	}
	public void setBooknomber(String booknomber) {
		this.booknomber = booknomber;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookintro() {
		return bookintro;
	}
	public void setBookintro(String bookintro) {
		this.bookintro = bookintro;
	}
	public String getBookimage() {
		return bookimage;
	}
	public void setBookimage(String bookimage) {
		this.bookimage = bookimage;
	}
	public int getBookcount() {
		return bookcount;
	}
	public void setBookcount(int bookcount) {
		this.bookcount = bookcount;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	
}
