package org.hatice.inventoryandstockmanagementsystem.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
	
	public ResponseEntity<ErrorMessage> createResponseEntity(ErrorType errorType, List<String> fields) {
		log.error("TÜM HATALARIN GEÇTİĞİ METOD....:"  +errorType.getMessage()+fields);
		return new ResponseEntity<>(ErrorMessage.builder()
		                                        .code(errorType.getCode())
		                                        .message(errorType.getMessage())
		                                        .success(false)
		                                        .fields(fields)
		                                        .build()
				, errorType.getHttpStatus());
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ErrorMessage> runtimeExceptionHandler(RuntimeException e) {
		return createResponseEntity(ErrorType.INTERNAL_SERVER_ERROR,null);
	}
	
	
	
	@ExceptionHandler(InventoryAndStockManagementSystemException.class)
	public ResponseEntity<ErrorMessage> Java16XExceptionHandler(InventoryAndStockManagementSystemException e) {
		return createResponseEntity(e.getErrorType(),null);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorMessage> validationExceptionHandler(MethodArgumentNotValidException e) {
		List<String> fieldErrors = new ArrayList<>();
		e.getBindingResult().getFieldErrors().forEach(fieldError -> {
			fieldErrors.add(fieldError.getField() + " Validasyon Hatası. Detay: " + fieldError.getDefaultMessage());
		});
		
		return createResponseEntity(ErrorType.VALIDATION_ERROR,fieldErrors);
	}
	
	
}