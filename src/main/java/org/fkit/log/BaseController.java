package org.fkit.log;
import javax.servlet.http.HttpServletRequest;  

import org.springframework.web.context.request.RequestContextHolder;  
import org.springframework.web.context.request.ServletRequestAttributes;  
import org.springframework.web.servlet.ModelAndView;  
  

  
import org.fkit.*;
public class BaseController {
	  protected Logger logger = Logger.getLogger(this.getClass());  
	  
	    private static final long serialVersionUID = 6357869213649815390L;  
	      
	  
	      
	    /** 
	     * 得到分页列表的信息  
	     */  
	      
	      
	    public static void logBefore(Logger logger, String interfaceName){  
	        logger.info("");  
	        logger.info("start");  
	        logger.info(interfaceName);  
	    }  
	      
	    public static void logAfter(Logger logger){  
	        logger.info("end");  
	        logger.info("");  
	    }  
	      
}
