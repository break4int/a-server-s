package co.kr.abiyo.dao;

import org.springframework.stereotype.Repository;

import co.kr.abiyo.vo.UserVO;

@Repository
public class UserDAO extends CommonDAO {

	public String addUser(UserVO userVO) {

		getSession().insert("co.kr.abiyo.UserDAO.addUser", userVO);
		return userVO.getUserId();
	}

	public Object userTest() {
		return getSession().<UserVO> selectList("co.kr.abiyo.UserDAO.userTest");
	}

	public Object reflectUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object updateUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
