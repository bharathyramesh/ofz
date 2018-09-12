package com.ofs.training;

//public class ClassFileNameLocationFinder {
public class ClassFileNameLocationFinder {

	// static void execute() {
	public static void main(String[] args) {

		// ClassFileLocationFinder cp = getCurrentProgram()
		ClassFileNameLocationFinder cp = new ClassFileNameLocationFinder();

		// Class currentClass = cp.getClass()
		Class currentClass = cp.getClass();

		// File currentClassFile = currentClass.getFile()
		// String absPath = currentClassFile.getAbsolutePath()
		String absPath = currentClass.getProtectionDomain().getCodeSource().getLocation().getFile();

		// Console console = getConsole()
		// console.print(absPath)
		System.out.println(absPath + currentClass.getName() + ".class");
	}
}
