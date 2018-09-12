package com.ofs.training;

public class Circle extends ShapeClass {

	final double pi = 3.14;

	@Override
	public void area(int radius) {
		System.out.println((pi) * radius * radius);
	}

	@Override
	public void perimeter(int perimeter) {
		System.out.println((pi) * perimeter * perimeter);

	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.area(2);
		circle.perimeter(3);
	}

}
