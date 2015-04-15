package co.kr.abiyo.api;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.dao.TicketDAO;
import co.kr.abiyo.vo.TicketVO;

@Controller
@RequestMapping(value = "/ticket")
public class TicketControll {
	private static Logger logger = Logger.getLogger(TicketControll.class);
	
	@Autowired
	TicketDAO ticketDAO;
	
	@RequestMapping(method = RequestMethod.GET, value ="/test")
	public @ResponseBody Object ticketTest(){
		return ticketDAO.ticketTest();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Object getTicketInfo(){
		return ticketDAO.getTicketInfo();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/{ticketId}/use")
	public @ResponseBody Object useTicket(@PathVariable String ticketId){
		return ticketDAO.useTicket();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/{ticketId}/cancel")
	public @ResponseBody Object cancelTicket(@PathVariable String ticketId){
		return ticketDAO.cancelTicket();
	}
}
