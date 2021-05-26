package de.mathisneunzig.programmierenvl.zug;

public class Fracht {
	
	private String bezeichnung;
	private double menge;
	
	public Fracht(String bezeichnung, double menge) {
		this.bezeichnung = bezeichnung;
		this.menge = menge;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public double getMenge() {
		return menge;
	}
	public void setMenge(double menge) {
		this.menge = menge;
	}
	
}
