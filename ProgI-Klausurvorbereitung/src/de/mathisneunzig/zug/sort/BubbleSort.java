package de.mathisneunzig.zug.sort;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] input) {
		
		int[] n = input;
		
		boolean swap = false;
		do {
			swap = false;
			for(int i = 0; i < n.length-1; i++) {
				if(n[i] > n[i+1]) {
					int c = n[i];
					n[i] = n[i+1];
					n[i+1] = c;
					swap = true;
				}
			}
		} while (swap);
		for(int i : n) {
			System.out.println(i);
		}
		return n;
		
	}
}
