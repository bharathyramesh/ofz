package com.ofs.training;

public class Square extends ShapeClass {

	@Override
	public void area(int radius) {
		System.out.println(radius * radius + " is area of the square");
	}

	@Override
	public void perimeter(int perimeter) {
		System.out.println((4) * perimeter + " is perimeter of the square");

	}

	public static void main(String[] args) {
		Square square = new Square();
		square.area(2);
		square.perimeter(3);
	}

}
