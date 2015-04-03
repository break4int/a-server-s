package co.kr.abiyo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.vo.UserVO;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping(method = RequestMethod.GET, value = "/test" )
	public @ResponseBody UserVO test(){
		UserVO userVo = new UserVO();
		userVo.setUserId("userId");
		userVo.setUserEmail("userEmail");
		userVo.setPassword("password");
		userVo.setPhoneNumber("phoneNumber");
		userVo.setUserName("userName");
		
		return userVo;
	}
	
}
