package co.kr.abiyo.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller

public class MainController {
	private static Logger logger = Logger.getLogger(MainController.class);

	@RequestMapping(method = RequestMethod.GET, value="/main.do")
	public String mainPage(){
		logger.info("called main page!");
		return "main";
	}
}
