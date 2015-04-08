package co.kr.abiyo.api;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.dao.PartnerDAO;
import co.kr.abiyo.vo.PartnerVO;

@Controller
@RequestMapping(value = "/partner")
public class PartnerController {	
	private static Logger logger = Logger.getLogger(PartnerController.class);
	
	@Autowired
	PartnerDAO partnerDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody PartnerVO getPartner(){
		return partnerDAO.getPartner();
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/{partnerId}")
	public @ResponseBody PartnerVO getPartnerInfo(@PathVariable String partnerId){
		return partnerDAO.getPartner();
	}
}


