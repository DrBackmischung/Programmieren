package de.mathisneunzig.zug.datamodel;

public class Train implements Drivable, Comparable<Train> {
	
	private int nr;
	private String name;
	
	public Train(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}
	
	public void faster() {
		System.out.println(this.getClass().getName()+": faster");
	}
	
	public void slower() {
		System.out.println(this.getClass().getName()+": slower");
	}
	
	public int getNr() {
		return nr;
	}
	
	public void setNr(int nr) {
		this.nr = nr;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(this.getClass() != o.getClass()) {
			return false;
		}
		if(this.getNr() != ((Train)o).getNr()) {
			return false;
		}
		if(this.getName() != ((Train)o).getName()) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.getNr() * this.getName().hashCode();
	}

	@Override
	public int compareTo(Train t) {
		return this.getNr()-t.getNr();
	}
	
	@Override
	public String toString() {
		return "Zug: "+getNr()+" | "+getName();
	}
	
}
