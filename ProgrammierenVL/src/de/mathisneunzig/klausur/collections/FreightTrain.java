package de.mathisneunzig.klausur.collections;

import de.mathisneunzig.klausur.interfaces.Train;

public class FreightTrain extends Train implements Comparable<FreightTrain> {
	
	private double weight;
	private int number;
	
	public FreightTrain(double w, int n, double l) {
		super(n, l);
		weight = w;
		number = n;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this == o) {
			return true;
		}
		
		//Die Vergleiche von der Superklasse muessen uebereinstimmen!
		
		if(!super.equals(o)) {
			return false;
		}
		
		//Feldvergleiche
		
		if(this.weight != ((FreightTrain) o).getWeight()) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public int hashCode() {
		return (int) (super.hashCode() ^ (int) weight);
	}

	@Override
	public int compareTo(FreightTrain f) {
		if(number > f.number)
			return 1;
		if(number < f.number)
			return -1;
		return 0;
	}
	
	public int getNumber() {
		return number;
	}
	
}
