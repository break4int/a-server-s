package co.kr.abiyo.dao.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import co.kr.abiyo.dao.DeviceDAO;
import co.kr.abiyo.vo.DeviceVO;

public class UserDAOTest extends AbstractApplicationContextTest{
	
	@Before
	public void setUp() {
	 System.out.println("test");
	}
	@Test
	public void getDeviceTest() throws Exception {
		DeviceDAO deviceDAO = new DeviceDAO();
		DeviceVO vo = (DeviceVO) deviceDAO.getDevice("067e6162-3b6f-4ae2-a171-2470b63dff00");
		//DeviceVO vo = (DeviceVO) deviceDAO.getDevices();
		assertEquals("1", vo.getDeviceId());
	}
}
