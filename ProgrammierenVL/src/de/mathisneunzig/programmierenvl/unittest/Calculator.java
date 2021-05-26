package de.mathisneunzig.programmierenvl.unittest;

import de.mathisneunzig.programmierenvl.DivideByZero;

public class Calculator {
	
	public long add(int ... a) {
		int result = 0;
		for (int i : a) {
			result = result + i;
		}
		return result;
	}
	
	public long substract(int ... a) {
		int result = a[0];
		for(int i = 1; i<a.length; i++) {
			result = result - a[i];
		}
		return result;
	}
	
	public long multiply(int ... a) {
		int result = 1;
		for (int i : a) {
			result = result * i;
		}
		return result;
	}
	
	public double divide(int ... a) throws DivideByZero {
		double result = a[0];
		for(int i = 1; i<a.length; i++) {
			if(a[i] == 0)
				throw new DivideByZero();
			result = result / a[i];
		}
		return result;
	}
	
}
