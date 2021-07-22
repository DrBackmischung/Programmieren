package de.mathisneunzig.klausur.interfaces;

public class Train implements Drivable, Bookable {
	
	//Alle Methoden der beiden Interfaces muessen implementiert werden.
	//Dadurch wird Mehrfachvererbung moeglich!

	@Override
	public void book() {
		System.out.println("Ich werde gebucht!");
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
