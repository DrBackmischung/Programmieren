package de.mathisneunzig.programmierenvl.zug;

import java.util.Date;

public abstract class Mitarbeiter {
	
	private String name;
	private String vorname;
	private int id;
	private Date gebDate;
	
	public Mitarbeiter(String name, String vorname, int id, Date gebDate) {
		this.name = name;
		this.vorname = vorname;
		this.id = id;
		this.gebDate = gebDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getGebDate() {
		return gebDate;
	}

	public void setGebDate(Date gebDate) {
		this.gebDate = gebDate;
	}
	
}
