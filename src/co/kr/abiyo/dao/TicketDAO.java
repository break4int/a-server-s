package co.kr.abiyo.dao;

import org.springframework.stereotype.Repository;

import co.kr.abiyo.vo.TicketVO;

@Repository
public class TicketDAO extends CommonDAO {

	public Object ticketTest() {
		return getSession().selectList("co.kr.abiyo.TicketDAO.ticketTest");
	}
	
	public Object getTicketInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object useTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object cancelTicket() {
		// TODO Auto-generated method stub
		return null;
	}

}
