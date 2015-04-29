package co.kr.abiyo.dao;

import org.springframework.stereotype.Repository;

import co.kr.abiyo.vo.DeviceVO;

@Repository
public class DeviceDAO extends CommonDAO{	
	public Object getDevices() {
		System.out.println("sqlSession ====>" + getSession());
		return getSession().selectList("co.kr.abiyo.DeviceDAO.getDevices");
	}
	
	public Object getDevice(String fingerPrint) {
		System.out.println("sqlSession ====>" + getSession());
		return getSession().selectOne("co.kr.abiyo.DeviceDAO.getDevice", fingerPrint);
	}

	public void setDevice(DeviceVO vo) {
		getSession().insert("co.kr.abiyo.DeviceDAO.insertDevice", vo);
		// TODO Auto-generated method stub
		
	}

}
