package co.kr.abiyo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.dao.DeviceDAO;

@Controller
@RequestMapping(value = "/device")
public class DeviceController {
	private static Logger	logger	= LoggerFactory.getLogger(DeviceController.class);

	@Autowired
	DeviceDAO				deviceDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public @ResponseBody Object deviceTest() {
		return deviceDAO.getDevices();
	}
}
