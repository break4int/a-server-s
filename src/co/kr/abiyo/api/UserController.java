package co.kr.abiyo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.kr.abiyo.api.common.BaseController;
import co.kr.abiyo.dao.UserDAO;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

	@Autowired
	UserDAO	userDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public ModelAndView userTest() {
		return super.result(userDAO.userTest());
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ModelAndView reflectUser() {

		return super.result(userDAO.reflectUser());
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{userId}/ticket")
	public ModelAndView getUser(@PathVariable String userId) {

		return super.result(userDAO.getUser());
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{userId}")
	public ModelAndView updateUser(@PathVariable String userId) {

		return super.result(userDAO.updateUser());
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
	public ModelAndView removeUser(@PathVariable String userId) {

		return super.result(userDAO.removeUser());
	}

}
