package de.mathisneunzig.klausur.exception;

@SuppressWarnings("serial")
public class BookingException extends Exception {
	
	//Mindestens die Fehlermeldungen neu definieren. Mehr muss in einer Exception Klasse an sich nicht gross getan werden.
	
	public BookingException() {
		super("Es gibt nicht genug freie Sitze auf dem Zug!");
	}
	
	public BookingException(int seats, int freeSeats) {
		super("Es gibt keine "+seats+" freien Sitze mehr. Es gibt nur noch "+freeSeats+" Sitze.");
	}

}
