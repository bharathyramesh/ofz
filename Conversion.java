package com.ofs.training;

//public class Conversion
public class Conversion {

	public static void main(String[] args) {

		String firstElement = "230";
		// double value = 0.0/0.0;
		System.out.println(Integer.toHexString(65));
		System.out.println(Integer.valueOf(firstElement, 5));
		System.out.println(Integer.valueOf(1));
		System.out.println(Float.valueOf(5));
		System.out.println(Long.valueOf(1));
		System.out.println(Integer.valueOf(5).equals(Long.valueOf(5)));
		System.out.println(Double.isNaN(0.0 / 0.0));
	}
}
