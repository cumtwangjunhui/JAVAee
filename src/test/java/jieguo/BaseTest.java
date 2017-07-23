package jieguo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/WEB-INF/applicationContext.xml","classpath:/WEB-INF/springmvc-config.xml"})
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

}
