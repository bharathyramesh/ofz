package com.ofs.training;

class PrePostDemo {

	public static void main(String[] args) {

		int i = 3;
		i++;// it first print the value of i and in memory it increase the value
			// of i
		System.out.println(i); // "4"
		++i;
		System.out.println(i); // "5"
		System.out.println(++i); // "6" it first increase its value and then it
									// is printing it
		System.out.println(i++); // "6"
		System.out.println(i); // "7"
	}
}
