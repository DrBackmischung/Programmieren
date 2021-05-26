package de.mathisneunzig.programmierenvl.zug;

public class Gueterwagon extends Wagon {
	
	private double maxLast;
	private Fracht[] f = new Fracht[0];

	public Gueterwagon(String typ, byte achsen, double maxLast) {
		super(typ, achsen);
		this.maxLast = maxLast;
	}

	public double getMaxLast() {
		return maxLast;
	}

	public void setMaxLast(double maxLast) {
		this.maxLast = maxLast;
	}

	public Fracht[] getF() {
		return f;
	}

	public void setF(Fracht[] f) {
		this.f = f;
	}
	
	public void addF(Fracht f) {
		
		int l = this.f.length;
		Fracht[] f2 = new Fracht[l+1];
		for(int i = 0; i<l; i++) {
			
			f2[i] = this.f[i];
			
		}
		f2[l] = f;
		this.f = f2;
		
	}
	
}
