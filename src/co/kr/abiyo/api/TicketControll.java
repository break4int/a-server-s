package co.kr.abiyo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.abiyo.dao.TicketDAO;
import co.kr.abiyo.vo.TicketVO;

@Controller
@RequestMapping(value = "/ticket")
public class TicketControll {
	private static Logger	logger	= LoggerFactory.getLogger(TicketControll.class);

	@Autowired
	TicketDAO				ticketDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public @ResponseBody Object ticketTest() {
		return ticketDAO.ticketTest();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{ticketId}")
	public @ResponseBody Object getTicketInfo(@PathVariable String ticketId) {
		return ticketDAO.getTicketInfo(ticketId);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{ticketId}/use")
	public @ResponseBody Object useTicket(@PathVariable String ticketId) {
		return ticketDAO.useTicket(ticketId);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{ticketId}/cancel")
	public @ResponseBody Object cancelTicket(@PathVariable String ticketId) {
		return ticketDAO.cancelTicket(ticketId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Object putTicket(@RequestBody TicketVO ticketVO) {
		return ticketDAO.putTicket(ticketVO);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{ticketType}/call")
	public @ResponseBody Object callTicketType(@PathVariable String ticketType) {
		return ticketDAO.callTicketType(ticketType);
	}
}
