package de.mathisneunzig.programmierenvl.unittest;

import de.mathisneunzig.programmierenvl.DivideByZero;

public class Main {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println("2 + 3 + 6 = "+c.add(2, 3, 6));
		System.out.println("8 - 4 - 10 = "+c.substract(8, 4, 10));
		System.out.println("2 * 5 * 9 = "+c.multiply(2, 5, 9));
		try {
			System.out.println("10 / 2 / 2 = "+c.divide(10, 2, 2));
		} catch (DivideByZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
