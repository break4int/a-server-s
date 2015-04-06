package co.kr.abiyo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonDAO {
	
	@Autowired
	private SqlSession session;

	protected SqlSession getSession(){
		return session;
	}
}
