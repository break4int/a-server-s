package co.kr.abiyo.api.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import co.kr.abiyo.dao.DeviceDAO;
import co.kr.abiyo.vo.DeviceVO;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	private static Logger	logger	= LoggerFactory.getLogger(LoginInterceptor.class);
	
	@Autowired
	DeviceDAO deviceDAO;
	
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) {
		logger.info("interceptor ==================================>");
		
		String authType = request.getHeader("x-auth-type");
		String authToken = request.getHeader("x-auth-token");
/*		String authType = "fingerprint";
		String authToken = "067e6162-3b6f-4ae2-a171-2470b63dff00";*/
		if(authType == null || authToken == null) {
			//response.sendRedirect("error");
			return false;
		}
		
		if(authType.equals("fingerprint")) {
			checkDeviceInfo(authToken);
		}	
		
		return true;
	}
	
	private void checkDeviceInfo(String fingerPrint) {
		DeviceVO vo = (DeviceVO) deviceDAO.getDevice(fingerPrint);
		//check user_id

		if(vo == null) {
			vo = new DeviceVO();
			vo.setFingerPrint(fingerPrint);
			
			vo.setUserId(0);
			deviceDAO.setDevice(vo);
		}
	}
}