package com.ofs.training;

public abstract class CharSequenceImplementation implements CharSequence{

	public static void main(String[] args) {

		String name = "I am manibharathi and this is very important note";
		System.out.println(name.charAt(0));
		System.out.println(name.subSequence(0, 5));
		System.out.println(name.length());
		System.out.println(name);
		System.out.println(name.toString());
		
	}

	
}
