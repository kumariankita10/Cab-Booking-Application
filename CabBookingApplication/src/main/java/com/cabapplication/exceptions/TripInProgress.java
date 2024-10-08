package com.cabapplication.exceptions;

public class TripInProgress extends RuntimeException{

	public TripInProgress() {
		
	}
	public TripInProgress(String msg) {
		super(msg);
	}
}
