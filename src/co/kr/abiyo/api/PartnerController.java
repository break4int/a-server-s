package co.kr.abiyo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.dao.PartnerDAO;

@Controller
@RequestMapping(value = "/partner")
public class PartnerController {
	private static Logger	logger	= LoggerFactory.getLogger(PartnerController.class);

	@Autowired
	PartnerDAO				partnerDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public @ResponseBody Object partnerTest() {
		return partnerDAO.partnerTest();
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Object getPartner() {
		return partnerDAO.getPartner();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{partnerId}")
	public @ResponseBody Object getPartnerInfo(@PathVariable String partnerId) {
		return partnerDAO.getPartner();
	}
}
