package de.mathisneunzig.klausur.interfaces;

public class Train implements Drivable, Bookable {
	
	//Alle Methoden der beiden Interfaces muessen implementiert werden.
	//Dadurch wird Mehrfachvererbung moeglich!
	
	private int number;
	private double length;
	
	public Train(int n, double l) {
		number = n;
		length = l;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getLength() {
		return length;
	}
	
	//HASHCODE
	
	@Override
	public int hashCode() {
		return (int) (number * length) ;
	}
	
	//EQUALS zum Vergleichen
	
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
		
		//Feldvergleiche
		
		if(this.number != ((Train) o).getNumber()) {
			return false;
		}

		if(this.length != ((Train) o).getLength()) {
			return false;
		}
		
		return true;
		
	}

	@Override
	public void book(int seats) {
		System.out.println("Ich werde gebucht! (und das gleich "+seats+" mal!)");
	}

	@Override
	public void start() {
		System.out.println("Ich starte!");
	}

	@Override
	public void faster() {
		System.out.println("Ich fahre schneller!");
	}

	@Override
	public void slower() {
		System.out.println("Ich fahre langsamer!");
	}

	@Override
	public void stop() {
		System.out.println("Ich halte an!");
	}
	
}
