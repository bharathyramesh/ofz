package com.ofs.training;

// public class ClassNameFinder
public class ClassNameFinder {

	// static void execute() {
	public static void main(String[] args) {

		// String stringName = datatype.getClass()
		// String name = stringName.getName()
		String stringInt = int.class.getName();
		String stringFloat = float.class.getName();
		String stringChar = char.class.getName();
		String stringByte = byte.class.getName();

		// Console console = getConsole()
		// console.print(data)
		System.out.println(stringInt);
		System.out.println(stringFloat);
		System.out.println(stringChar);
		System.out.println(stringByte);
	}
}
