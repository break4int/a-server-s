package co.kr.abiyo.dao;

import org.springframework.stereotype.Repository;

import co.kr.abiyo.vo.UserVO;

@Repository
public class UserDAO extends CommonDAO {

	public Object getTest() {
		return getSession().<UserVO>selectList("co.kr.abiyo.UserDAO.getMembers");
	}

	public UserVO reflectUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserVO getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserVO updateUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserVO removeUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
