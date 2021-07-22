package de.mathisneunzig.klausur.exception;

import de.mathisneunzig.klausur.interfaces.Train;

public class CommuterTrain extends Train {
	
	private int seats;
	private int freeSeats;
	
	public CommuterTrain(int seats) {
		this.seats = seats;
		this.freeSeats = seats;
	}
	
	@Override
	public void book(int seats) {
		System.out.println("Ich versuche "+seats+" Sitze zu buchen.");
		try {
			//Die Exception MUSS abgefangen werden, da es eine checked exception ist!
			reserveSeats(seats);
		} catch (BookingException e) {
			//Fehlermeldung ausgeben
			e.printStackTrace();
		} finally {
			//Was noch passieren muss, bevor das Programm abschmiert
			System.out.println("Es wurde ein Buchungsfehler ausgegeben!");
		}
//		reserveSeats(seats);
	}
	
	//ReserveSeats soll einen Fehler werfen, wenn nicht genug freie Sitze zur Verfuegung sind!
	
	public boolean reserveSeats(int seats) throws BookingException {
		System.out.println("Ich versuche "+seats+" Sitze zu reservieren.");
		if(freeSeats >= seats) {
			freeSeats = freeSeats-seats;
			System.out.println("Ich habe "+seats+" Sitze reserviert.");
			return true;
		} else {
			throw new BookingException(seats, freeSeats);
		}
	}
	
}
