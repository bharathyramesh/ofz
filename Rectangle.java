package com.ofs.training;

public class Rectangle {

	int width;
	int height;

	float area() {
		float value = width * height;
		return (value);
	}

	public static void main(String[] args) {

		Rectangle myRect = new Rectangle();
		myRect.width = 40;
		myRect.height = 50;
		System.out.println("myRect's area is " + myRect.area());
	}
}
