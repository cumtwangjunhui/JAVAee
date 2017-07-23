package jieguo;


import org.junit.Test;

public class UserJUnit extends BaseTest{
	@Autowired
 	@Qualifier("userService")
 	private UserService userService;
	@Test
		public void testRegister() {
			User user = userService.login("123","123");
			System.out.println(user);
		}
}
