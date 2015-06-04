package co.kr.abiyo.api.common;

import org.springframework.beans.factory.annotation.Autowired;

public class ResultMessageMapper {
	@Autowired
	private MessageUtil messageUtil;
	
	public ResultMessageMapper() {
		super();
	}

	public String getMessage(String code) {
		String message = "";
		switch(code) {
			case Constants.RESULT_CODE_SUCCESS :
				//message = messageUtil.getMessage("RESULT_MESSAGE_SUCCESS");
				//message = messageUtil.getMessage("RESULT_MESSAGE_ERROR_NOT_LOGIN");
		}
		
		return message;
	}
}
