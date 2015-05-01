package co.kr.abiyo.api.common;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import co.kr.abiyo.dao.DeviceDAO;
import co.kr.abiyo.dao.UserDAO;
import co.kr.abiyo.vo.DeviceVO;
import co.kr.abiyo.vo.UserVO;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	private static Logger	logger	= LoggerFactory.getLogger(LoginInterceptor.class);

	@Autowired
	private UserDAO			userDAO;
	@Autowired
	private DeviceDAO		deviceDAO;

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		logger.info("interceptor ==================================>");

		String authType = request.getHeader("x-auth-type");
		String authToken = request.getHeader("x-auth-token");
		/*
		 * String authType = "fingerprint"; String authToken =
		 * "067e6162-3b6f-4ae2-a171-2470b63dff00";
		 */

		// 사용자 단말 (a-app)
		if ("fingerprint".equalsIgnoreCase(authType)) {

			// 미가입자 가입처리
			if (StringUtils.isBlank(authToken)) {

				// 자동가입 프로세스
				String userId = userDAO.addUser(new UserVO());

				while (true) {
					try {
						authToken = UUID.randomUUID().toString();
						deviceDAO.setDevice(new DeviceVO(null, Integer.parseInt(userId), authToken, null, null));
						break;
					} catch (DuplicateKeyException e) {
						// retry
					} catch (Exception e) {
						e.printStackTrace();
						break;
					}
				}
			}

			// // 공통 인증처리
			// device = getDevice(authToken);
			// user = getUser(device.userId);
			// if (user != null) {
			// session.add('user', 'user')
			// }
			// // 인증실패는 에러처리
			// else {
			// // response.sendRedirect("error");
			// return false;
			// }

		}
		// Partner 단말 (a-ticket)
		else if ("partner".equalsIgnoreCase(authType)) {

		}
		// Error 처리
		else {
			return false;
		}

		return true;
	}

	private void checkDeviceInfo(String fingerPrint) {
		DeviceVO vo = (DeviceVO) deviceDAO.getDevice(fingerPrint);
		// check user_id

		if (vo == null) {
			vo = new DeviceVO();
			vo.setFingerprint(fingerPrint);

			vo.setUserId(0);
			deviceDAO.setDevice(vo);
		}
	}
}