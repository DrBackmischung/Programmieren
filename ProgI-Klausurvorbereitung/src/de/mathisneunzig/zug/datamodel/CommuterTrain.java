package de.mathisneunzig.zug.datamodel;

import de.mathisneunzig.zug.exception.NotEnoughtSeatsException;

public class CommuterTrain extends Train implements Bookable {
	
	private int seats;
	private int freeSeats;
	
	public CommuterTrain(int nr, String name, int seats) {
		super(nr, name);
		this.seats = seats;
		this.freeSeats = seats;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public int getFreeSeats() {
		return freeSeats;
	}
	
	public void substractSeats(int i) {
		freeSeats -= i;
	}
	
	public void addSeats(int i) {
		freeSeats += i;
	}
	
	public void book(int seats) {
		System.out.println(seats+" Sitze buchen...");
		try {
			System.out.println(reserveSeats(seats));
		} catch (NotEnoughtSeatsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fehler!");
		}
	}
	
	public boolean reserveSeats(int seats) throws NotEnoughtSeatsException {
		if(getFreeSeats() >= seats) {
			System.out.println("Sitze wurden gebucht: "+seats);
			substractSeats(seats);
			return true;
		} else {
			throw new NotEnoughtSeatsException("Nicht mehr genug Sitze uebrig. Es ist nicht moeglich, "+seats+" Sitze zu blockieren.");
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!super.equals(o)) {
			return false;
		}
		if(this.getSeats() != ((CommuterTrain)o).getSeats()) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() * (int) this.getSeats();
	}
	
}
