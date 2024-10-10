package com.nit.strategy.sorting.algorithms.design.pattern;

public class Context {
	private final Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void arrange(int[] input) {
		strategy.sort(input);
	}
}
