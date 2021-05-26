package de.mathisneunzig.programmierenvl.zug;

public abstract class Wagon {
	
	private String typ;
	private byte achsen;
	
	public Wagon(String typ, byte achsen) {
		super();
		this.typ = typ;
		this.achsen = achsen;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public byte getAchsen() {
		return achsen;
	}

	public void setAchsen(byte achsen) {
		this.achsen = achsen;
	}
	
}
