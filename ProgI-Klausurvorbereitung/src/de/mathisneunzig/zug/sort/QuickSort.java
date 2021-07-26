package de.mathisneunzig.zug.sort;

public class QuickSort {
	
	public static int[] quickSort(int[] numbers, int left, int right) {
		
		int indexLeft = left;
        int indexRight = right;

        if(left < right){
            int pivot = numbers[(indexLeft + indexRight) / 2];

            while(indexLeft <= indexRight){
                while (numbers[indexLeft] < pivot){
                    indexLeft++;
                }

                while (numbers[indexRight] > pivot){
                    indexRight--;
                }

                if(indexLeft <= indexRight){
                    swapElementsInArray(numbers, indexLeft, indexRight);
                    indexLeft++;
                    indexRight--;
                }
            }

            if(left < indexRight){
            	quickSort(numbers, left, indexRight);
            }

            if(indexLeft < right){
            	quickSort(numbers, indexLeft, right);
            }
        }
		
		return numbers;
		
	}


    private static void swapElementsInArray(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
