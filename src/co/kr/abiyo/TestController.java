package co.kr.abiyo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.dao.UserDAO;

@Controller
public class TestController {
	private static Logger logger = Logger.getLogger(TestController.class);
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(method=RequestMethod.GET, value="/test")
	@ResponseBody
	public Object test()throws Exception{
		logger.info("TEST=======================================>");
		return userDAO.getTest();
	}
}
