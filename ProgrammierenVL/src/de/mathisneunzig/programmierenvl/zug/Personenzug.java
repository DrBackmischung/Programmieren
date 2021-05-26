package de.mathisneunzig.programmierenvl.zug;

public class Personenzug extends Zug {

	private Lokomotive lok;
	private Personenwagon[] personenw;

	public Personenzug(int id, double laenge, int anzahlWagons) {
		super(id, laenge, anzahlWagons);
	}
	
	public Personenzug(int id, double laenge, int anzahlWagons, Lokomotive lok, Personenwagon[] personenw) {
		super(id, laenge, anzahlWagons);
		this.lok = lok;
		this.personenw = personenw;
	}

	public Lokomotive getLok() {
		return lok;
	}

	public void setLok(Lokomotive lok) {
		this.lok = lok;
	}

	public Personenwagon[] getGueter() {
		return personenw;
	}

	public void setGueter(Personenwagon[] gueter) {
		this.personenw = gueter;
	}

}
