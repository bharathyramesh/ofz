package com.ofs.training;

// public class Vararg {
public class InputVararg {

	static int id = 0;

	// Vararg(int... firstVariable) {
	public InputVararg(int... firstVariable) {
		for (int SecondVariable : firstVariable) {
			// Console console = getConsole()
			// console.print(data)
			System.out.println(SecondVariable);
		}
	}

	// Vararg(int... firstVariable, String... name) {
	public InputVararg(int firstVariable, String... name) {
		for (String Name : name) {
			id = id + 1;
			// Console console = getConsole()
			// console.print(data)
			System.out.println(Name + "id is" + id);
		}
	}

	// static execute () {
	public static void main(String[] args) {

		// Vararg var = new Vararg(arguments)
		InputVararg var = new InputVararg(1, "Bharathy");
		InputVararg firstVar = new InputVararg(2, "ManiBharathy", "Bharathy", "Vinoth");
		InputVararg secondVar = new InputVararg(1, 2, 3, 4);
		InputVararg thirdVar = new InputVararg();
	}
}
