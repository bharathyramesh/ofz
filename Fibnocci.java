package com.ofs.training;

public class Fibnocci {

	int firstTemperoraryVariable = 0;
	int secondTemperorayVariable = 1;
	int nextElementVariable;

	void usingFor() {

		int firstElement = 5;
		int firstTemperorary = 0;
		int secondTemperoray = 1;
		int nextElement;
		System.out.println("Fibnocci using for");

		for (int i = 0; i <= firstElement; i++) {
			System.out.println(firstTemperorary);
			nextElement = firstTemperorary + secondTemperoray;
			firstTemperorary = secondTemperoray;
			secondTemperoray = nextElement;
		}
	}

	void usingWhile() {

		int firstElement = 5;
		int firstTemperorary = 0;
		int secondTemperoray = 1;
		int nextelement;

		while (firstElement >= 0) {
			System.out.println(firstTemperorary);
			nextelement = firstTemperorary + secondTemperoray;
			firstTemperorary = secondTemperoray;
			secondTemperoray = nextelement;
			firstElement--;
		}
	}

	void recursion() {

		System.out.println(firstTemperoraryVariable);
		nextElementVariable = firstTemperoraryVariable + secondTemperorayVariable;
		firstTemperoraryVariable = secondTemperorayVariable;
		secondTemperorayVariable = nextElementVariable;
	}

	public static void main(String[] args) {

		int firstNumber = 5;
		Fibnocci fb = new Fibnocci();
		fb.usingFor();
		System.out.println(" ");
		System.out.println("Fibnocci using while");
		fb.usingWhile();
		System.out.println(" ");
		System.out.println("Fibnocci using recursion");
		while (firstNumber >= 0) {
			fb.recursion();
			firstNumber--;
		}
	}
}
