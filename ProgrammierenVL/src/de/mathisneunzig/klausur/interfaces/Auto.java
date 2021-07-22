package de.mathisneunzig.klausur.interfaces;

public class Auto implements Drivable {
	
	//Ein Interface kann mehrfach genutzt werden

	@Override
	public void start() {
		System.out.println("Ich starte! (aber ich bin ein Auto)");
	}

	@Override
	public void faster() {
		System.out.println("Ich fahre schneller! (aber ich bin ein Auto)");
	}

	@Override
	public void slower() {
		System.out.println("Ich fahre langsamer! (aber ich bin ein Auto)");
	}

	@Override
	public void stop() {
		System.out.println("Ich halte an! (aber ich bin ein Auto)");
	}

}
