package com.ofs.training;

import java.util.Arrays;

// public class ArraySorting {
public class ArraySorting {

	// static void execute(){
	public static void main(String[] args) {

		// String[] cities = getArray()
		String[] cities = { "Madurai", "Thanjavur", "TRICHY", "Karur", "Erode", "trichy", "Salem" };

		// String[] cities = cities.sort()
		// String[] cities = sort.caseInsensitiveCities()
		Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(cities));

		// for(LengthOf) {
		for (int initial = 0; initial <= cities.length; initial++) {
			// if (evenIndexedElement){
			if (initial % 2 == 0) {
				// console.print(cities[evenIndexedElement].toUpperCase())
				System.out.println(cities[initial].toUpperCase());
			}
		}
	}
}
