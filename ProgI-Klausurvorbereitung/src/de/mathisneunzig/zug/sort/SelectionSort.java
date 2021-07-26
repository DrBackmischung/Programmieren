package de.mathisneunzig.zug.sort;

public class SelectionSort {
	
	public static int[] selectionSort(int[] input) {
		
		int[] n = input;
		
		int sortedMarker = n.length-1;
		while(sortedMarker > 0) {
			int max = 0;
			for(int i = 0; i <= sortedMarker; i++) {
				if(n[i] > n[max]) {
					max = i;
				}
			}
			int c = n[sortedMarker];
			n[sortedMarker] = n[max];
			n[max] = c;
			sortedMarker--;
			
			for(int i : n) {
				System.out.println(i);
			}
			System.out.println("===");
			
		}
		
		for(int i : n) {
			System.out.println(i);
		}
		
		return n;
		
	}
}
