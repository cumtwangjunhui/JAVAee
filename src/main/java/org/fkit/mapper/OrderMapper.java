package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Order;

public interface OrderMapper {
    
	@Select("select * from `order`")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "book_id", property = "book", many = @Many(select = "org.fkit.mapper.BookMapper.selectByBookId", fetchType = FetchType.LAZY)),		
		@Result(column = "count", property = "count"), @Result(column = "book_id", property = "book_id")})
	List<Order> findAll();
	//加入订单 
    @Insert("insert into `order`(book_id,count,state) values(#{book_id},#{count},#{state})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveOrder(Order order);
  //通过ID寻找书
    @Select("select * from `order` where book_id=#{book_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "book_id", property = "book", many = @Many(select = "org.fkit.mapper.BookMapper.selectByBookId", fetchType = FetchType.LAZY)),				
			@Result(column = "count", property = "count"), @Result(column = "book_id", property = "book_id") })
	Order findWithId(@Param("book_id") int book_id);
  //增加书籍数量
    @Update("update `order` set count=count+1 where book_id=#{book_id}")
	void addOrder(Order order);
    //删除商品
    @Delete("delete from `order` where book_id=#{book_id}")
	void removeOrder(Order order);
    //更改书籍状态
    @Update("update `order` set state=#{state} where book_id=#{book_id}")
    void updateorder(Order order);
    
}
