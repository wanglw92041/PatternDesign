package com.pattern.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		String exp = "10*4";
		ICalculator cal = new Multiply();
		System.out.println(cal.calculate(exp));
	}
}
