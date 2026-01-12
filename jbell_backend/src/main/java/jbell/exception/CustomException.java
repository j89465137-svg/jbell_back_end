package jbell.exception;

import lombok.Getter;

@Getter
public class CustomException extends BaseException {
	
	private static final long serialVersionUID = 1L;

	public CustomException(ErrorCode errorCode) {
		// TODO Auto-generated constructor stub
		super(errorCode);
	}
}
