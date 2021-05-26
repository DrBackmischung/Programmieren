package de.mathisneunzig.programmierenvl;

import java.io.File;
import java.io.IOException;

import de.mathisneunzig.programmierenvl.haus.HausManager;
import de.mathisneunzig.programmierenvl.misc.Maths;
import de.mathisneunzig.programmierenvl.zug.GueterManager;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Maths m = new Maths();
		
		System.out.println("GGT von 969 und 627: "+m.ggt(11, 96));
		System.out.println("Fakultät von 5: "+m.fak(5));
		System.out.println("Liste der Primzahlen: "+m.siebEra());
		for(int i = 0; i<10; i++) {
			System.out.println("Random gerade Zahl: "+m.randomGeradeZahl(1, 10));
		}
		
		HausManager hm = new HausManager();
		hm.create();
		
		GueterManager gm = new GueterManager();
		File f = new File("src/de/mathisneunzig/programmierenvl/zug/lib/Auftrag.csv");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		gm.createFromFile(f);
		
	}
	
}
