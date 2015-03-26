package co.kr.abiyo;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	private static Logger logger = Logger.getLogger(TestController.class);
	@RequestMapping(method=RequestMethod.GET, value="/test")
	@ResponseBody
	public String test()throws Exception{
		logger.info("TEST=======================================>");
		return "success!!";
	}
}
