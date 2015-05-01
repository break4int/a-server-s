package co.kr.abiyo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.api.common.BaseController;
import co.kr.abiyo.dao.UserDAO;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

	@Autowired
	UserDAO	userDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public @ResponseBody Object userTest() {
		return userDAO.userTest();
	}

	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Object reflectUser() {

		return userDAO.reflectUser();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public @ResponseBody Object getUser(@PathVariable String userId) {

		return userDAO.getUser();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{userId}")
	public @ResponseBody Object updateUser(@PathVariable String userId) {

		return userDAO.updateUser();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
	public @ResponseBody Object removeUser(@PathVariable String userId) {

		return userDAO.removeUser();
	}

}
