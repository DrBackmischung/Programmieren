package de.mathisneunzig.zug.datamodel;

public class FreightTrain extends Train {
	
	private double weight;
	
	public FreightTrain(int nr, String name, double weight) {
		super(nr, name);
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!super.equals(o)) {
			return false;
		}
		if(this.getWeight() != ((FreightTrain)o).getWeight()) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() * (int) this.getWeight();
	}
	
}
