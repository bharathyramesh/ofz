package com.ofs.training;

public class Initial {

	public static void main(String[] args) {

		String fullName = "";
		StringBuilder initial = new StringBuilder();
		System.out.println(initial.capacity());
		// String initialCharacter;
		int length = fullName.length();

		for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(fullName.charAt(i))) {
				initial.append(fullName.charAt(i));
			}
		}
		System.out.println(fullName.length());
		System.out.println(initial);
		System.out.println(initial.capacity());

	}
}
