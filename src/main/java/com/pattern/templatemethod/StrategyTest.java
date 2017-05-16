package com.pattern.templatemethod;

public class StrategyTest {
	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		System.out.println(cal.calculate(exp, "[+]"));
	}
}
