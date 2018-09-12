package com.ofs.training;

// public class Equal {
public class Equal {

	String firstString;
	String secondString;

	// public static execute () {
	public static void main(String[] args) {

		// Equal objName = new Equal()
		Equal firstResult = new Equal();
		Equal secondResult = new Equal();
		// objName.propertiesName = getValue()
		firstResult.firstString = "hai";
		secondResult.secondString = "hai";

		if (firstResult.equals(secondResult)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
