package de.mathisneunzig.programmierenvl;

import org.junit.jupiter.api.function.Executable;

import de.mathisneunzig.programmierenvl.unittest.Calculator;

public class DivideByZero extends Exception implements Executable {

	private static final long serialVersionUID = 571514703146261726L;
	
	public DivideByZero() {
		super("Division durch 0 ist nicht möglich.");
	}

	@Override
	public void execute() throws Throwable {
		
		Calculator c = new Calculator();
		c.divide(2, 0, 1);
		
	}

}
