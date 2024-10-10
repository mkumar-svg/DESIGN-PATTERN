package com.nit.decorator.design.pattern.sandwich;

import java.math.BigDecimal;

public abstract class SandWichDecorator extends Sandwich {
	@Override
	public abstract BigDecimal price();
}
