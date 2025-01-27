package org.hatice.inventoryandstockmanagementsystem.exception;

public class InventoryAndStockManagementSystemException extends RuntimeException {
	private ErrorType errorType;
	
	public InventoryAndStockManagementSystemException(ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}
	
	public ErrorType getErrorType() {
		return errorType;
	}
}