package de.mathisneunzig.programmierenvl.zug;

import java.io.File;
import java.util.Date;

import de.mathisneunzig.programmierenvl.utils.TableReader;
import de.mathisneunzig.programmierenvl.utils.TableType;

public class GueterManager {
	
	@SuppressWarnings("deprecation")
	public GueterManager() {
		
		TableReader tr = new TableReader();
		
		Zug g = new Gueterzug(100, 100, 3);
		
		Gueterwagon gw1 = new Gueterwagon("Beton", (byte) 2, 134.3);
		Gueterwagon gw2 = new Gueterwagon("Stahl", (byte) 2, 223);
		Gueterwagon gw3 = new Gueterwagon("Erde", (byte) 2, 89.67);
		assignFahrer(g, new Zugfuehrer("Neunzig", "Mathis", 24318, new Date(2, 10, 2000)));
		Holzkiste f1 = new Holzkiste("Blitz-Beton", 34.5);
		Holzkiste f1b = new Holzkiste("Blitz-Beton extra-schnell", 45.3);
		loadFracht(gw1, f1, f1b);
		Fracht f2 = new Fracht("Stahl Stange", 340.5);
		loadFracht(gw2, f2);
		Fracht f3 = new Fracht("Erde", 89.67);
		loadFracht(gw3, f3);
		Gueterwagon[] gw = new Gueterwagon[3];
		gw[0] = gw1;
		gw[1] = gw2;
		gw[2] = gw3;
		((Gueterzug) g).setGueter(gw);
		
		System.out.println("Zug: "+g.getId());
		System.out.println("Lokomotive: "+((Gueterzug) g).getLok().getID());
		System.out.println("Zugführer: "+g.getFahrer().getName()+", "+g.getFahrer().getVorname()+", "+g.getFahrer().getId());
		System.out.println("Anzahl Wagons: "+g.getAnzahlWagons());
		for(Gueterwagon gwg : ((Gueterzug) g).getGueter()) {
			System.out.println("Güterwagon:");
			for(Fracht f : gwg.getF()) {
				if(f instanceof Holzkiste)
					System.out.println("Holzkiste: "+f.getBezeichnung()+", "+f.getMenge());
				else if(f instanceof Fass)
					System.out.println("Fass: "+f.getBezeichnung()+", "+f.getMenge());
				else
					System.out.println("Fracht: "+f.getBezeichnung()+", "+f.getMenge());
			}
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public void createFromFile(File f) {
		
		TableReader tr = new TableReader();
		String[][] s2 = (String[][])tr.getTable(TableType.STRING, f);
		
		int c = 0;
		
		for(String[] s : s2) {
			
			c++;
			
		}
		
		Zugfuehrer z = new Zugfuehrer(s2[0][0], s2[0][1], Integer.parseInt(s2[0][2]), new Date(Integer.parseInt(s2[0][3]), Integer.parseInt(s2[0][3]), Integer.parseInt(s2[0][3])));
		Gueterzug g = new Gueterzug(Integer.parseInt(s2[1][1]), Double.parseDouble(s2[1][2]), Integer.parseInt(s2[1][4]));
		
		for(int i = 2; i<c; i++) {
			
			if(i == 0) {
				
			}
			
		}
		
	}
	
	public void assignFahrer(Zug z, Zugfuehrer f) {
		
		z.setFahrer(f);
		
	}
	
	public void loadFracht(Gueterwagon gw, Fracht ...frachts) {
		
		for(Fracht f : frachts) {
			gw.addF(f);;
		}
		
	}
	
}
