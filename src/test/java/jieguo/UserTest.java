package org.fkit.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class UserControllerTest extends BaseTest{

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	 @Before
	 public void setUp() throws Exception {
	  System.out.println("wjh");
	 
	 }
		@Test
		public void testRegister() {
			User user = userService.register("test", "12345","12","18272946435","wjh","223488");
			System.out.println("	wwn");
		}

	 @After
	 public void tearDown() throws Exception {
	  System.out.println("whhh");
	 }
	 
	 public class UserControllerTest {

	 	@Autowired
	 	@Qualifier("userService")
	 	private UserService userService;
	 	 @Before
	 	 public void setUp() throws Exception {
	 	  System.out.println("wjh");
	 	 
	 	 }
	 		@Test
	 		public void testRegister() {
	 			User user = userService.register("test", "12345","12","18272946435","wjh","223488");
	 			System.out.println("	wwn");
	 		}

	 	 @After
	 	 public void tearDown() throws Exception {
	 	  System.out.println("whhh");
	 	 }


	 }


}
