package co.kr.abiyo.api.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

public class BaseController {
	protected Logger	logger	= LoggerFactory.getLogger(BaseController.class);

	// JacksonJsonView 사용할 것
	protected ModelAndView result(Object o) {
		ResultMessageMapper mapper = new ResultMessageMapper();
		String code = Constants.RESULT_CODE_SUCCESS;
		
		ModelAndView mav = new ModelAndView("jsonView");
		mav.addObject("code", code);
		mav.addObject("message", mapper.getMessage(code));
		mav.addObject("result", o);

		return mav;
	}
	
	protected ModelAndView result(String code, Object o) {
		ResultMessageMapper mapper = new ResultMessageMapper();
		
		ModelAndView mav = new ModelAndView("jsonView");
		mav.addObject("code", code);
		mav.addObject("message", mapper.getMessage(code));
		mav.addObject("result", o);

		return mav;
	}
	

}
