package co.kr.abiyo.vo;

public class DeviceVO {
	private int deviceId;
	private int userId;
	String fingerPrint;
	String regDate;
	String updDate;
	
	public DeviceVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public DeviceVO(int deviceId, int userId, String fingerPrint,
			String regDate, String updDate) {
		super();
		this.deviceId = deviceId;
		this.userId = userId;
		this.fingerPrint = fingerPrint;
		this.regDate = regDate;
		this.updDate = updDate;
	}

	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFingerPrint() {
		return fingerPrint;
	}
	public void setFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUpdDate() {
		return updDate;
	}
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}
	
	
}
