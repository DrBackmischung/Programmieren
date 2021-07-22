package de.mathisneunzig.klausur.unittest;

public class PriceCalculator {
	
	//Eine Methode soll einen Gesamtpreis berechnen in Abhaengigkeit der gekauften Tickets fuer die Strecke
	
	private static double priceAdult = 3.50;
	private static double priceChild = 2.50;
	
	public static double calculate(int adults, int childs) {
		return ( adults * priceAdult ) + ( childs * priceChild );
	}
	
}
