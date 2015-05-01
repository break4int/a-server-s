package co.kr.abiyo.vo;

import java.sql.Timestamp;

public class DeviceVO {
	private Integer		deviceId;
	private Integer		userId;
	private String		fingerprint;
	private Timestamp	regDate;
	private Timestamp	updDate;

	public DeviceVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeviceVO(Integer deviceId, Integer userId, String fingerprint, Timestamp regDate, Timestamp updDate) {
		super();
		this.deviceId = deviceId;
		this.userId = userId;
		this.fingerprint = fingerprint;
		this.regDate = regDate;
		this.updDate = updDate;
	}

	public Integer getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public Timestamp getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Timestamp updDate) {
		this.updDate = updDate;
	}

}
