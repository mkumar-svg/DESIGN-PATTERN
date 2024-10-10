package com.nit.decorator.design.pattern.sandwich;

import java.math.BigDecimal;

public class CheeseDecorator extends SandWichDecorator {
	
	Sandwich currentSandwich;
	
	public CheeseDecorator(Sandwich sw) {
		currentSandwich = sw;
	}
	
	@Override
	public String getDescription() {
		return currentSandwich.getDescription() + ", cheese";
	}

	@Override
	public BigDecimal price() {
		return currentSandwich.price().add(new BigDecimal("0.50"));
	}

}
