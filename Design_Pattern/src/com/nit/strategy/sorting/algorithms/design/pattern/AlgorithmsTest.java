package com.nit.strategy.sorting.algorithms.design.pattern;

public class AlgorithmsTest {
	
	public static void main(String[] args) {
		int[] input = {6, 3, 7, 2, 9, 4};
		Context ctx = new Context(new BubbleSort());
		ctx.arrange(input);
		
		ctx = new Context(new QuickSort());
		ctx.arrange(input);
	}

}
