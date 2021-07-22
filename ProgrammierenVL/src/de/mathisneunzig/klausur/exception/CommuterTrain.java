package de.mathisneunzig.klausur.exception;

import de.mathisneunzig.klausur.interfaces.Train;

public class CommuterTrain extends Train {
	
	private int seats;
	
	public CommuterTrain(int seats) {
		this.seats = seats;
	}
	
	@Override
	public void book(int seats) {
		
	}
	
}
