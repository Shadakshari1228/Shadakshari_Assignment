package com.exception.assignments;

class IlleagalBankTransactionException extends Exception {

	private static final long serialVersionUID = 1L;

	IlleagalBankTransactionException(String exception2) {
		super(exception2);
	}
}