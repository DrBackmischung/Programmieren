package de.mathisneunzig.zug;

import java.util.Iterator;
import java.util.TreeSet;

import de.mathisneunzig.zug.datamodel.CommuterTrain;
import de.mathisneunzig.zug.datamodel.Train;
import de.mathisneunzig.zug.list.List;
import de.mathisneunzig.zug.list.Queue;
import de.mathisneunzig.zug.sort.BubbleSort;
import de.mathisneunzig.zug.sort.QuickSort;
import de.mathisneunzig.zug.sort.SelectionSort;

public class Main {
	
	public static void main(String[] args) {
		
		TreeSet<Train> t = new TreeSet<>();
		CommuterTrain c1 = new CommuterTrain(90, "Yamanote", 200);
		t.add(c1);
		t.add(new CommuterTrain(420, "Keihin-Tohuko", 150));
		t.add(new CommuterTrain(20, "Saikyo", 400));
		Iterator i = t.iterator();
		while(i.hasNext()) {
			System.out.println(((Train)i.next()).toString());
		}
		
		c1.book(100);
		c1.book(30);
		c1.book(80);
		c1.book(20);
		c1.book(60);
		c1.book(20);
		
		System.out.println("=============================LIST");
		
		CommuterTrain c2 = new CommuterTrain(91, "Yamanote", 200);
		CommuterTrain c3 = new CommuterTrain(92, "Yamanote", 200);
		
		List<Train> t2 = new List<>();
		t2.add(c1);
		t2.add(c2);
		t2.add(c3);
		System.out.println(t2.contains(c1));
		System.out.println(t2.contains(c2));
		System.out.println(t2.contains(c3));
		System.out.println(t2.size);
		t2.print();
		t2.remove(c2);
		System.out.println(t2.contains(c1));
		System.out.println(t2.contains(c2));
		System.out.println(t2.contains(c3));
		System.out.println(t2.size);
		t2.print();
		t2.add(c2);
		System.out.println(t2.contains(c1));
		System.out.println(t2.contains(c2));
		System.out.println(t2.contains(c3));
		System.out.println(t2.size);
		t2.print();
		
		System.out.println("=============================QUEUE");
		
		CommuterTrain c4 = new CommuterTrain(93, "Yamanote", 200);
		CommuterTrain c5 = new CommuterTrain(94, "Yamanote", 200);
		
		Queue<Train> t3 = new Queue<>();
		t3.enqueue(c1);
		t3.enqueue(c2);
		t3.enqueue(c3);
		t3.enqueue(c4);
		t3.enqueue(c5);
		t3.dequeue();
		t3.dequeue();
		t3.dequeue();
		t3.enqueue(c1);
		t3.dequeue();
		t3.print();

		System.out.println("=============================BUBBLESORT");
		int[] input = {2, 3, 4, 1};
		BubbleSort.bubbleSort(input);

		System.out.println("=============================SELECTIONSORT");
		int[] input2 = {2, 3, 4, 1, 5, 7, 6};
		SelectionSort.selectionSort(input2);

		System.out.println("=============================QUICKSORT");
		int[] input3 = {2, 3, 4, 1, 5, 7, 6, 8, 10, 9, 15};
		int[] result = QuickSort.quickSort(input3, 0, input3.length-1);
		for(int r : result) {
			System.out.println(r);
		}
		
	}
	
}
