package co.kr.abiyo.dao;

import org.springframework.stereotype.Repository;

import co.kr.abiyo.vo.TicketVO;

@Repository
public class TicketDAO extends CommonDAO {

	public Object ticketTest() {
		return getSession().selectList("co.kr.abiyo.TicketDAO.ticketTest");
	}
	
	public Object getTicketInfo(String ticketId) {
		return getSession().selectList("co.kr.abiyo.TicketDAO.getTicketInfo", ticketId);
	}

	public Object useTicket(String ticketId) {
		return getSession().update("co.kr.abiyo.TicketDAO.useTicket", ticketId);
	}

	public Object cancelTicket(String ticketId) {
		return getSession().delete("co.kr.abiyo.TicketDAO.cancelTicket", ticketId);
	}

}
