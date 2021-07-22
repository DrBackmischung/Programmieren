package de.mathisneunzig.klausur.collections;

import java.util.Comparator;

public class DoubleComparator implements Comparator<Double> {

	@Override
	public int compare(Double arg0, Double arg1) {
		if(arg0 < arg1)
			return 1;
		if(arg0 > arg1)
			return -1;
		return 0;
	}

}
