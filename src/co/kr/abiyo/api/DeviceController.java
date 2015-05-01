package co.kr.abiyo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.api.common.BaseController;
import co.kr.abiyo.dao.DeviceDAO;

@Controller
@RequestMapping(value = "/device")
public class DeviceController extends BaseController {

	@Autowired
	DeviceDAO	deviceDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public @ResponseBody Object deviceTest() {
		return deviceDAO.getDevices();
	}
}
