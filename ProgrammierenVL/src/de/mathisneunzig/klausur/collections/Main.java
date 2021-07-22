package de.mathisneunzig.klausur.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		//Listenoperationen
		
		List<String> freundeAusHessen = new ArrayList<>();
		freundeAusHessen.add("Manuel");
		freundeAusHessen.add("Colin");
		freundeAusHessen.add("Soufiane");
		freundeAusHessen.add("Samed");
		
		System.out.println("=== Mit dummen Leuten:");
		
		//Iterator zum itierieren
		
		Iterator i = freundeAusHessen.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		freundeAusHessen.remove("Colin");
		
		System.out.println("=== Ohne Colin:");
		
		i = freundeAusHessen.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("=== Als For Schleife:");
		
		for(String s : freundeAusHessen) {
			System.out.println(s);
		}
		
		System.out.println("=== Ist Manuel ein Freund aus Hessen?");
		
		if(freundeAusHessen.contains("Manuel")) {
			System.out.println("Manuel ist ein Freund aus Hessen :)");
		} else {
			System.out.println("Manuel ist ein Bastard :/");
		}
		
		System.out.println("=== Wie viele Freunde aus Hessen?");
		System.out.println(freundeAusHessen.size());
		
		//Set (TreeSet) -> Menge
		
		TreeSet<Double> preiseVonWelde = new TreeSet<>();
		preiseVonWelde.add(0.89);
		preiseVonWelde.add(1.49);
		preiseVonWelde.add(0.79);
		preiseVonWelde.add(1.39);
		preiseVonWelde.add(0.79);
		
		System.out.println("=== Weldepreise:");
		
		i = preiseVonWelde.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Natuerliche Ordnung des Doubles ueberschreiben: Comparator, der Doubles anders sortiert
		
		TreeSet<Double> preiseVonWelde2 = new TreeSet<>(new DoubleComparator());
		preiseVonWelde2.add(0.89);
		preiseVonWelde2.add(1.49);
		preiseVonWelde2.add(0.79);
		preiseVonWelde2.add(1.39);
		preiseVonWelde2.add(0.79);
		
		System.out.println("=== Weldepreise, aber falsch herum:");
		
		i = preiseVonWelde2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Set von FreightTrains, die dafuer das Interface Comparable implementieren muessen. Dort wird die natuerliche Ordnung definiert!
		
		TreeSet<FreightTrain> t = new TreeSet<>();
		t.add(new FreightTrain(100, 1, 5.5));
		t.add(new FreightTrain(100, 3, 3));
		t.add(new FreightTrain(100, 2, 10));
		
		System.out.println("=== Zuege:");
		
		Iterator<FreightTrain> f = t.iterator();
		while(f.hasNext()) {
			System.out.println(f.next().getNumber());
		}
		
		//Maps
		
		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("Mathis", "Flauuuschi");
		tm.put("Mathis", "Floof");
		tm.put("Mathis", "Plueschi");
		tm.put("Mathis", "Dummer Hundesohn");
		tm.put("Colin", "Dummer Hundesohn");
		
		System.out.println("=== Colins Beleidigung:");
		
		System.out.println(tm.get("Colin"));

		System.out.println("=== Beleidugungen:");
		System.out.println(tm.toString());
		
		tm.remove("Colin");

		System.out.println("=== Beleidugungen ohne Colin:");
		System.out.println(tm.toString());
		
		//HashMap
		
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Mathis", "Flauuuschi");
		hm.put("Mathis", "Floof");
		hm.put("Mathis", "Plueschi");
		hm.put("Mathis", "Dummer Hundesohn");
		hm.put("Colin", "Dummer Hundesohn");

		System.out.println("=== Beleidugungen in HashMap:");
		System.out.println(hm.toString());
		
		//Exkurs zu compareTo: Vergleiche generell (HashCode und Equals)
		//Equals jeweils in Train und FreightTrain implementiert

		System.out.println("=== Sind die beiden Zuege gleich?");
		FreightTrain f1 = new FreightTrain(4.5, 3, 3.5);
		FreightTrain f2 = new FreightTrain(4.5, 3, 3.5);
		System.out.println(f1.equals(f2));

		System.out.println("=== Sind die beiden HashCodes gleich?");
		System.out.println(f1.hashCode() == f2.hashCode());
		System.out.println(f1.hashCode());
		
	}
	
}
