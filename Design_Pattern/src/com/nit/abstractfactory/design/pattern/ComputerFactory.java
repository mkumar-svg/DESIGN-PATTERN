package com.nit.abstractfactory.design.pattern;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
