package de.mathisneunzig.programmierenvl.haus;

public class Haus {
	
	private int tueren, fenster, etagen, plz = 0;
	private double flaeche = 0D;
	private String strasse, hausnummer, ort = "";
	private boolean flachdach = false;
	private Garten[] garten = new Garten[0];
	
	public Haus() {
		
		
		
	}
	
	public void setTueren(int t) {
		tueren = t;
	}
	
	public int getTueren() {
		return tueren;
	}
	
	public void setFenster(int f) {
		fenster = f;
	}
	
	public int getFenster() {
		return fenster;
	}
	
	public void setEtagen(int e) {
		etagen = e;
	}
	
	public int getEtagen() {
		return etagen;
	}
	
	public void setFlaeche(double f) {
		flaeche = f;
	}
	
	public double getFlaeche() {
		return flaeche;
	}
	
	public void setFlachdach(boolean fl) {
		flachdach = fl;
	}
	
	public boolean getFlachdach() {
		return flachdach;
	}
	
	public void setAdresse(String strasse, String hausnummer, int plz, String ort) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	
	public String getAdress() {
		return strasse+" "+hausnummer+"\n"+plz+" "+ort;
	}
	
	public void setGarten(Garten g) {
		garten = new Garten[1];
		garten[0] = g;
	}
	
	public void addGarten(Garten g) {
		garten = new Garten[garten.length+1];
		garten[garten.length-1] = g;
	}
	
	public void setGarten(Garten[] g) {
		garten = g;
	}
	
	public Garten[] getGarten() {
		return garten;
	}
	
}
