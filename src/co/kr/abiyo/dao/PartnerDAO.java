package co.kr.abiyo.dao;

import org.springframework.stereotype.Repository;

import co.kr.abiyo.vo.PartnerVO;
import co.kr.abiyo.vo.UserVO;

@Repository
public class PartnerDAO extends CommonDAO {


	public Object partnerTest() {
		return getSession().selectList("co.kr.abiyo.PartnerDAO.partnerTest");
	}
	
	public Object getPartner(String partnerId) {
		return getSession().selectList("co.kr.abiyo.PartnerDAO.getPartner", partnerId);
	}


}
