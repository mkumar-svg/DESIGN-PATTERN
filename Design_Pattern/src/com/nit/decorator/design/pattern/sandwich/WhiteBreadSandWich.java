package com.nit.decorator.design.pattern.sandwich;

import java.math.BigDecimal;

public class WhiteBreadSandWich extends Sandwich {
	
	public WhiteBreadSandWich(String desc) {
		description = desc;
	}

	@Override
	public BigDecimal price() {
		return new BigDecimal("3.0");
	}

}
