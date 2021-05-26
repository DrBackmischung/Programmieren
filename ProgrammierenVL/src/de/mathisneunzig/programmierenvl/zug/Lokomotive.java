package de.mathisneunzig.programmierenvl.zug;

public class Lokomotive {
	
	private String id;
	private String typ;
	private String antrieb;
	private byte achsen;
	
	public Lokomotive(String id, String type, String antrieb, byte achsen) {
		super();
		this.id = id;
		this.typ = type;
		this.antrieb = antrieb;
		this.achsen = achsen;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getAntrieb() {
		return antrieb;
	}
	public void setAntrieb(String antrieb) {
		this.antrieb = antrieb;
	}
	public byte getAchsen() {
		return achsen;
	}
	public void setAchsen(byte achsen) {
		this.achsen = achsen;
	}
	
}
