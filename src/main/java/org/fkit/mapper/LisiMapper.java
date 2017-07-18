package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;

import org.fkit.domain.Lisi;

public interface LisiMapper {
	//遍历书籍
    @Select("select * from lisi")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "book_id", property = "book", many = @Many(select = "org.fkit.mapper.BookMapper.selectByBookId", fetchType = FetchType.LAZY)),		
	    @Result(column = "book_id", property = "book_id")})
	List<Lisi> findAll();
    
    //通过ID寻找书
    @Select("select * from lisi where book_id=#{book_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "book_id", property = "book", many = @Many(select = "org.fkit.mapper.BookMapper.selectByBookId", fetchType = FetchType.LAZY)),				
			 @Result(column = "book_id", property = "book_id") })
	Lisi findWithId(@Param("book_id") int book_id);
   //进行加入历史订单
    @Insert("insert into lisi(book_id) values(#{book_id})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveLisi(Lisi lisi);
    //评价
    @Update("update lisi set wuliu=#{wuliu},ziliang=#{ziliang},fuwu=#{fuwu} where book_id=#{book_id}")
	int ping(Lisi lisi);

}
