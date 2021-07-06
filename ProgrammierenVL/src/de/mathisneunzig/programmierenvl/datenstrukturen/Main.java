package de.mathisneunzig.programmierenvl.datenstrukturen;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		
		System.out.println("Mathis: "+l.contains("Mathis"));
		System.out.println("Marcel: "+l.contains("Marcel"));
		System.out.println("Nathalie: "+l.contains("Nathalie"));
		
		l.add("Mathis");
		l.add("Marcel");
		l.add("Tomke");
		l.add("Leo");
		l.add("Betty");
		l.add("Nathalie");
		
		System.out.println("Mathis: "+l.contains("Mathis"));
		System.out.println("Marcel: "+l.contains("Marcel"));
		System.out.println("Nathalie: "+l.contains("Nathalie"));
		
		l.remove("Mathis");
		l.remove("Marcel");
		l.remove("Nathalie");
		
		System.out.println("Mathis: "+l.contains("Mathis"));
		System.out.println("Marcel: "+l.contains("Marcel"));
		System.out.println("Nathalie: "+l.contains("Nathalie"));
		
	}

}
