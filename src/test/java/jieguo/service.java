package jieguo;

import static org.junit.Assert.assertTrue;

import org.fkit.domain.Book;
import org.fkit.domain.Cart;

import org.junit.Test;

public class service {


	    @Test 
	    public void test2() {
	    	Book book=new Book();
	    	 book.setBookprice("10");
	}

	    
	       @Test 
	       public void test3(){
	    	   
	    	   Cart cart=new Cart();
	    	   cart.setBook_id(10);
	       }


}
