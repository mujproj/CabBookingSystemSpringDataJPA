package com.cg.mts.exception;

public class AdminNotFoundException extends Exception {

	private static final long serialVersionUID = -5595964428948080655L;

	public AdminNotFoundException(String msg) {
		super(msg);
	}

	public AdminNotFoundException() {
		super();
	}

}
