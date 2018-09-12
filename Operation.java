package com.ofs.training;

import com.ofs.training.LambdaExpression.Expresion;

public class Operation {
	
	public static void main(String[] args) {
		Expresion add = (int a, int b) -> a+b;
		Expresion multiply = (int a, int b) -> a*b;
		Operation operation = new Operation();
		System.out.println("addition" + operation.functionaOfExpression(6, 3, add));
		System.out.println("mulitply" + operation.functionaOfExpression(6, 3, multiply));
	}
	private int functionaOfExpression(int a, int b, Expresion ex) {
		return ex.operators(a, b);
	}
//	public static void main(String[] args) {
//		Operation operation = new Operation();
//		operation.operators(5, 6);
//	}
//	private void operators(int a, int b) {
//		add(a, b);
//	}
//	private void add(int x, int y) {
//	System.out.println(x+y);
//	}
}


