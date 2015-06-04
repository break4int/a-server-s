package co.kr.abiyo.api.common;


public class Constants {
	static final String RESULT_CODE_SUCCESS = "0000";
	
	static final String RESULT_CODE_ERROR_NOT_LOGIN = "1001";
	static final String RESULT_CODE_ERROR_NOT_MATCH_FINGERPRINT = "1002";
	static final String RESULT_CODE_ERROR_NOT_MATCH_USER = "1003";
	
	static final String RESULT_CODE_ERROR_INVALID_PARAMETER = "2001";
	static final String RESULT_CODE_ERROR_MISSING_PARAMETER = "2002";
	
	static final String RESULT_CODE_ERROR_DB = "3000";
	
	static final String RESULT_CODE_ERROR_SYSTEM = "4000";
	
	public static enum Message {
		RESULT_MESSAGE_SUCCESS,
		RESULT_MESSAGE_ERROR_NOT_LOGIN,
		RESULT_MESSAGE_ERROR_NOT_MATCH_FINGERPRINT,
		RESULT_MESSAGE_ERROR_NOT_MATCH_USER,
		RESULT_MESSAGE_ERROR_INVALID_PARAMETER,
		RESULT_MESSAGE_ERROR_MISSING_PARAMETER,
		RESULT_MESSAGE_ERROR_DB,
		RESULT_MESSAGE_ERROR_SYSTEM, 
	};
	
}

