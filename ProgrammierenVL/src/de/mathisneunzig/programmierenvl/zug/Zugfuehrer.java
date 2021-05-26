package de.mathisneunzig.programmierenvl.zug;

import java.util.Date;

public class Zugfuehrer extends Mitarbeiter {
	
	private String lieblingszug;

	public Zugfuehrer(String name, String vorname, int id, Date gebDate) {
		super(name, vorname, id, gebDate);
	}

	public String getLieblingszug() {
		return lieblingszug;
	}

	public void setLieblingszug(String lieblingszug) {
		this.lieblingszug = lieblingszug;
	}

}
