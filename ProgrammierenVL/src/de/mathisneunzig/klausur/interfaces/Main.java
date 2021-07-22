package de.mathisneunzig.klausur.interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		Train t = new Train();
		t.start();
		t.faster();
		t.slower();
		t.stop();
		
		Auto a = new Auto();
		a.start();
		a.faster();
		a.slower();
		a.stop();
		
	}
	
}
