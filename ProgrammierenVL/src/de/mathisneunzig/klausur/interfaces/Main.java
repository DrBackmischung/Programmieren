package de.mathisneunzig.klausur.interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		Train t = new Train(3, 5);
		t.book(5);
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
