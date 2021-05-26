package de.mathisneunzig.programmierenvl.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Maths {
	
	public int ggt(int a, int b) {
		 
		if (a == 0) {
			return b;
		}
		
		while (b != 0) {
			
			if (a > b) {
			 	a = a - b;
			} else {
			 	b = b - a;
			}
			
		}
		 
		return a;
		 
	}
	
	public int fak(int a) {
		
		int erg = 1;
		
		for(int i = 1; i<=a; i++) {
			erg = erg*i;
		}
		
		return erg;
		
	}
	
	public ArrayList<Integer> siebEra() {
		
		String s = JOptionPane.showInputDialog("Geben Sie eine Zahl ein:");
		int z = Integer.parseInt(s);
		
		char[] b = new char[z+1];
		ArrayList<Integer> i = new ArrayList<>();
		b[0] = 'X';
		b[1] = 'X';
		
		for(int j = 2; j <= z; j++) {
			
			if(b[j] != 'X') {
				i.add(j);
				b[j] = 'X';
			}
			
			int index = j;
			
			while(index <= z) {
				b[index] = 'X';
				index = index+j;
			}
			
		}
		
		return i;
		
	}
	
	public int randomGeradeZahl(int a, int b) {
		
		int zahl = (int)((Math.random()) * b + a);
		
		return zahl % 2 == 0 ? zahl : randomGeradeZahl(a, b);
		
	}
	
}
