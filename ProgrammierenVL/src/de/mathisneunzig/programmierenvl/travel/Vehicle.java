package de.mathisneunzig.programmierenvl.travel;

public class Vehicle {
	
	private LicencePlate l;
	private boolean[] seats;
	
	public Vehicle(LicencePlate l, int seats) {
		this.l = l;
		this.seats = new boolean[seats];
	}
	
	public boolean[] getSeatMap() {
		return this.seats;
	}
	
	public String getLicencePlate() {
		return l.getLabel();
	}

}
