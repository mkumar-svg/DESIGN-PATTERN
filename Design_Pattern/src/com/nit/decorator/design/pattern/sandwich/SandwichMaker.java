package com.nit.decorator.design.pattern.sandwich;

public class SandwichMaker {
	
	public static void main(String[] args) {
		Sandwich mySandwich = new WhiteBreadSandWich("White bread Sandwich");
		System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(), mySandwich.price());
		
		//adding extra cheese using Decorator Pattern
        mySandwich = new CheeseDecorator(mySandwich);
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(), mySandwich.price());
	}

}
