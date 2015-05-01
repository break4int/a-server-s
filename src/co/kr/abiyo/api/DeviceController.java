package co.kr.abiyo.api;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.api.common.BaseController;
import co.kr.abiyo.dao.DeviceDAO;
import co.kr.abiyo.dao.UserDAO;
import co.kr.abiyo.vo.DeviceVO;
import co.kr.abiyo.vo.UserVO;

@Controller
@RequestMapping(value = "/device")
public class DeviceController extends BaseController {

	@Autowired
	private DeviceDAO	deviceDAO;

	@Autowired
	private UserDAO		userDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public @ResponseBody Object deviceTest() {
		return deviceDAO.getDevices();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fingerprint")
	public @ResponseBody Object getFingerPrint() {

		// TODO 이미 인증정보가 헤더에 있는 사용자인지 체크 할것!!

		String userId = userDAO.addUser(new UserVO());
		String fingerprint = null;

		while (true) {
			try {
				fingerprint = UUID.randomUUID().toString();
				deviceDAO.setDevice(new DeviceVO(null, Integer.parseInt(userId), fingerprint, null, null));
				break;
			} catch (DuplicateKeyException e) {
				// retry
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}

		return fingerprint;
	}
}
