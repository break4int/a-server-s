package co.kr.abiyo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.kr.abiyo.api.common.BaseController;
import co.kr.abiyo.dao.TicketDAO;
import co.kr.abiyo.vo.TicketVO;

@Controller
@RequestMapping(value = "/ticket")
public class TicketControll extends BaseController {

	@Autowired
	TicketDAO	ticketDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public ModelAndView ticketTest() {
		return super.result(ticketDAO.ticketTest());
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{ticketId}")
	public ModelAndView getTicketInfo(@PathVariable String ticketId) {
		return super.result(ticketDAO.getTicketInfo(ticketId));
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{ticketId}/use")
	public ModelAndView useTicket(@PathVariable String ticketId) {
		return super.result(ticketDAO.useTicket(ticketId));
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{ticketId}/cancel")
	public ModelAndView cancelTicket(@PathVariable String ticketId) {
		return super.result(ticketDAO.cancelTicket(ticketId));
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView putTicket(@RequestBody TicketVO ticketVO) {
		return super.result(ticketDAO.putTicket(ticketVO));
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{ticketType}/call")
	public ModelAndView callTicketType(@PathVariable String ticketType) {
		return super.result(ticketDAO.callTicketType(ticketType));
	}
}
