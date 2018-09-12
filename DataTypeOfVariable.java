package com.ofs.training;

class DataTypeOfVariable {

	void type(Object ob) {

		if (ob instanceof Float) {
			System.out.println("it is float");
		}
		if (ob instanceof Integer) {
			System.out.println("it is int");
		}
		if (ob instanceof Double) {
			System.out.println("it is double");
		}
		if (ob instanceof Long) {
			System.out.println("it is long");
		}
		if (ob instanceof Short) {
			System.out.println("it is short");
		}
	}

	public static void main(String[] args) {

		DataTypeOfVariable dataType = new DataTypeOfVariable();
		Object ob1 = 100 / 24;
		Object ob2 = 100.10 / 10;
		Object ob3 = 'z' / 2;
		Object ob4 = 10.5f / 0.5f;
		Object ob5 = 12.4 % 5.5;
		Object ob6 = 100 % 56;

		dataType.type(ob1);
		dataType.type(ob2);
		dataType.type(ob3);
		dataType.type(ob4);
		dataType.type(ob5);
		dataType.type(ob6);
	}
}

/*
 * - 100 / 24 - 100.10 / 10 - 'Z' / 2 - 10.5 / 0.5 - 12.4 % 5.5 - 100 % 56
 */