package de.mathisneunzig.programmierenvl.tier;

public class Hund extends Tier {

	public Hund(String farbe) {
		super(farbe);
	}
	
	@Override
	public void test() {
		System.out.println("Ich bin ein Hund ");
		
	}
	
}
