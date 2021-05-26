package de.mathisneunzig.programmierenvl.zug;

public class Gueterzug extends Zug {
	
	private Lokomotive lok;
	private Gueterwagon[] gueter;

	public Gueterzug(int id, double laenge, int anzahlWagons) {
		super(id, laenge, anzahlWagons);
		Lokomotive l = new Lokomotive(id+"L", "Diesellok", "Diesel", (byte) 1);
		this.lok = l;
	}
	
	public Gueterzug(int id, double laenge, int anzahlWagons, Lokomotive lok, Gueterwagon[] gueter) {
		super(id, laenge, anzahlWagons);
		this.lok = lok;
		this.gueter = gueter;
	}

	public Lokomotive getLok() {
		return lok;
	}

	public void setLok(Lokomotive lok) {
		this.lok = lok;
	}

	public Gueterwagon[] getGueter() {
		return gueter;
	}

	public void setGueter(Gueterwagon[] gueter) {
		this.gueter = gueter;
	}
	
}
