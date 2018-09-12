package com.ofs.training;

public class AnonymousClass {

	interface Element {
		void add(int a, int b);
	}

	public static void main(String[] args) {

		AnonymousClass value = new AnonymousClass();
		Element element = new Element() {

			public void add(int a, int b) {
				// TODO Auto-generated method stub
				// System.out.println(a + b);
				outputValue(a, b);
			}

			public void outputValue(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a + b);
			}

		};

		value.add(5, 6);
		element.add(5, 7);
	}

	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + b);
	}

}
