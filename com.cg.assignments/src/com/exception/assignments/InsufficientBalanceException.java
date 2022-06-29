package com.exception.assignments;

class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 1L;

	InsufficientBalanceException(String exception) {
		super(exception);
	}
}
