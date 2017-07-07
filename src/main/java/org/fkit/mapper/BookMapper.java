package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Book;
import org.fkit.domain.Cart;
import org.fkit.domain.User;

public interface BookMapper {
	/**
	 * 查询所有图书
	 * 
	 * @return 文艺图书对象集合
	 */
	//查询所有文艺书的集合
	@Select("select * from book where booktype=#{booktype}")
	List<Book> wyfindAll(@Param("booktype") String booktype);
	
	
	@Select("select * from book where id=#{id}")
	@Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "bookimage", property = "bookimage"),
			@Result(column = "booknomber", property = "booknomber"), @Result(column = "booktype", property = "booktype"),
			@Result(column = "bookname", property = "bookname"),
			@Result(column = "bookintro", property = "bookintro"), @Result(column = "bookprice", property = "bookprice"),
			@Result(column = "bookcount", property = "bookcount"),@Result(column = "remark", property = "bookimage")})
	List<Book> selectByBookId(int id);
	/**
	 * 查询所有图书
	 * 
	 * @return 科技图书对象集合
	 */
	//查询所有科技书的集合
	@Select("select * from book  where booktype=#{booktype}")
	List<Book> kjfindAll(@Param("booktype") String booktype);
	/**
	 * 查询所有图书
	 * 
	 * @return 经管图书对象集合
	 */
	
	
	//查询所有经管书的集合
	@Select("select * from book where booktype=#{booktype}")
	List<Book>jgfindAll(@Param("booktype") String booktype);
    
    
  
    
    //查询所有生活书的集合
	@Select("select * from book where booktype=#{booktype}")
	List<Book> shfindAll(@Param("booktype") String booktype);
	//遍历所有书籍
	 @Select("select * from book")
	 List<Book> findAll();
	 //下架
	 
	    @Delete("delete from book where book_id=#{book_id}") 
	    Book removeBook(int book_id);
	    // 
	    @Select("select * from book where book_id=#{book_id}")
	  		@Results({ @Result(id = true, column = "id", property = "id"),
	  				@Result(column = "book_id", property = "book", many = @Many(select = "org.fkit.mapper.BookMapper.selectByBookId", fetchType = FetchType.LAZY)),				
	  				 @Result(column = "book_id", property = "book_id") })
	  		Book findWithId(@Param("book_id") int book_id);


		
}