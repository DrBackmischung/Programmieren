package de.mathisneunzig.programmierenvl.tier;

public class Main {
	
	public static void main(String[] args) {
		
		Hund h = new Hund("Blau");
		h.test();
		
		
		Tier t = h; 
		t.test();
		
		Tier t2 = new Tier("Gelb");
		t2.test();
		
		if(t instanceof Hund) {
			h = (Hund) t;
			h.test();
		}
		
	}
	
}
