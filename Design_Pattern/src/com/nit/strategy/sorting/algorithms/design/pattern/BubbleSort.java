package com.nit.strategy.sorting.algorithms.design.pattern;

public class BubbleSort implements Strategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("sorting array using bubble sort strategy");
		int n = numbers.length;
		int i, j, temp;
		boolean swapped;
		for(i = 0; i < n-1; i++) {
			swapped = false;
			for(j = 0; j < n-i-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					swapped = true;
				}
				
			}
			if(swapped == false) {
				break;
			}
		}
	}

}
