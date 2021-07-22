package de.mathisneunzig.klausur.exception;

public class Main {
	
	public static void main(String[] args) {
		
		CommuterTrain c = new CommuterTrain(200);
		
		//Buchung 1: 150 Sitze
		c.book(150);
		
		//Buchung 2: 30 Sitze
		c.book(30);
		
		//Buchung 3: 40 Sitze
		c.book(40);
		
		//Buchung 4: 10 Sitzen
		c.book(10);
		
	}
	
}
