package de.mathisneunzig.programmierenvl.zug;

public abstract class Zug {
	
	private int id;
	private double laenge;
	private int anzahlWagons;
	private Zugfuehrer fahrer;
	
	public Zug(int id, double laenge, int anzahlWagons) {
		this.id = id;
		this.laenge = laenge;
		this.anzahlWagons = anzahlWagons;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public int getAnzahlWagons() {
		return anzahlWagons;
	}

	public void setAnzahlWagons(int anzahlWagons) {
		this.anzahlWagons = anzahlWagons;
	}

	public Zugfuehrer getFahrer() {
		return fahrer;
	}

	public void setFahrer(Zugfuehrer fahrer) {
		this.fahrer = fahrer;
	}
	
}
