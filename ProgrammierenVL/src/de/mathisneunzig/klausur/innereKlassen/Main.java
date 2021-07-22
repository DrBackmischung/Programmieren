package de.mathisneunzig.klausur.innereKlassen;

public class Main {
	
	public static void main(String[] args) {
		
		OuterClass o = new OuterClass();
		String s = "Hello World";
		o.printFromInnerTopLevelClass(s);
		o.printFromElementClass(s);
		o.printFromLocalClass(s);
		o.printFromAnonymClass(s);
		o.printFromLambda(s);
		
	}

}
