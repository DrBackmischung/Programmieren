package de.mathisneunzig.programmierenvl.haus;

public class HausManager {
	
	public HausManager() {
		
	}
	
	public void create() {
		Haus h1 = new Haus();
		h1.setAdresse("Parkring", "21", 68159, "Mannheim");
		Garten g1 = new Garten();
		g1.addBlume("Sonnenblume");
		g1.addBlume("Rose");
		Garten g2 = new Garten();
		g2.addBlume("Schnittlauch");
		h1.addGarten(g1);
		h1.addGarten(g2);
		Haus h2 = new Haus();
		h2.setAdresse("Dietmar-Hopp-Allee", "16", 69190, "Walldorf");
		Haus[] h = new Haus[2];
		h[0] = h1;
		h[1] = h2;
	}
	
}
