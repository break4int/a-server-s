package co.kr.abiyo.api.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

public class BaseController {
	protected Logger	logger	= LoggerFactory.getLogger(BaseController.class);

	// JacksonJsonView 사용할 것
	protected ModelAndView result(Object o) {
		ModelAndView mav = new ModelAndView("jsonView");
		mav.addObject("code", "A_0000");
		mav.addObject("message", "OK");
		mav.addObject("result", o);

		return mav;
	}
}
