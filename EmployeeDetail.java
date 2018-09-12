package com.ofs.training;

// public class EmployeeDetail
public class EmployeeDetail {

	static int id = 0;
	String name;

	// EmployeeDetail(parameters) {
	public EmployeeDetail(String name) {
		// id = id;
		this.id = id + 1;
		// name = name;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

	// public static execute() {
	public static void main(String args[]) {

		// EmployeeDetail.objEmployee = new EmployeeDetail(arguments)
		EmployeeDetail firstEmployee = new EmployeeDetail("Raj");
		// Console console = getConsole()
		// console.print(objEmployee.toString())
		System.out.println(firstEmployee.toString());
		EmployeeDetail secondEmployee = new EmployeeDetail("SaravanaRaj");
		System.out.println(secondEmployee.toString());
		EmployeeDetail thirdEmployee = new EmployeeDetail("ManiBharathy");
		System.out.println(thirdEmployee.toString());
		EmployeeDetail fourthEmployee = new EmployeeDetail("Saravana");
		System.out.println(fourthEmployee.toString());
		EmployeeDetail fifthEmployee = new EmployeeDetail("Bharathy");
		System.out.println(fifthEmployee.toString());
		EmployeeDetail sixthEmployee = new EmployeeDetail("Suresh");
		System.out.println(sixthEmployee.toString());
		EmployeeDetail seventhEmployee = new EmployeeDetail("Sakthi");
		System.out.println(seventhEmployee.toString());
		EmployeeDetail eighthEmployee = new EmployeeDetail("Saravananan");
		System.out.println(eighthEmployee.toString());
		EmployeeDetail ninthEmployee = new EmployeeDetail("Venkatesh");
		System.out.println(ninthEmployee.toString());
		EmployeeDetail tenthEmployee = new EmployeeDetail("Karthi");
		System.out.println(tenthEmployee.toString());
	}
}
