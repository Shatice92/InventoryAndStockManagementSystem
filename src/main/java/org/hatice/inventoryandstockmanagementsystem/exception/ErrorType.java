package org.hatice.inventoryandstockmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {
	USER_NOTFOUND(1001, "User not found", HttpStatus.BAD_REQUEST), VALIDATION_ERROR(400,
	                                                                                "Validation Error,invalid " +
			                                                                                "parameters...",
	                                                                                HttpStatus.BAD_REQUEST),
	INTERNAL_SERVER_ERROR(500, "Server Error, Please Try Again", HttpStatus.INTERNAL_SERVER_ERROR), INVALID_TOKEN(4001
			, "Invalid Token", HttpStatus.BAD_REQUEST), INVALID_USERNAME_OR_PASSWORD(3001, "Username" + "/Password " +
			"Error...", HttpStatus.BAD_REQUEST), PASSWORD_MISMATCH(3000, "Password doesnt match repassword.." + ".",
	                                                               HttpStatus.BAD_REQUEST);
	
	
	int code;
	String message;
	HttpStatus httpStatus;
}