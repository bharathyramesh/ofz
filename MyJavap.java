package com.ofs.training;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyJavap {

	public void printModifier(int mod) {
		if (Modifier.isPublic(mod)) {
			System.out.print("public ");
		}
		if (Modifier.isPrivate(mod)) {
			System.out.print("private ");
		}
		if (Modifier.isStatic(mod)) {
			System.out.print("static ");
		}
		if (Modifier.isFinal(mod)) {
			System.out.print("final ");
		}
		if (Modifier.isNative(mod)) {
			System.out.print("native ");
		}
	}

	public static void main(String[] args) throws Exception {

		Class className = Class.forName(args[0]);
		// Class currentClass = className.getClass();

		MyJavap javaP = new MyJavap();

		// to get interface
		// print interface
		Class[] interfaceName = className.getInterfaces();
		int mod = className.getModifiers();
		javaP.printModifier(mod);
		System.out.print(className + " implements ");
		for (int index = 0; index < interfaceName.length; index++) {
			System.out.print(interfaceName[index].getName() + " ");
		}
		System.out.println(" { \n");

		// to get fields
		Field[] fields = className.getDeclaredFields();
		for (Field field : fields) {

			int mod2 = field.getModifiers();
			javaP.printModifier(mod2);
			System.out.println(field.getName());
		}

		// to get method
		// print methods
		Method[] methods = className.getDeclaredMethods();
		int lengthOfMethods = methods.length;
		for (Method method : methods) {

			int a = 1;
			int mod3 = method.getModifiers();
			javaP.printModifier(mod3);
			System.out.print(method.getReturnType().getSimpleName() + " " + method.getName());
			System.out.print("(");
			Class[] parameter = method.getParameterTypes();
			int lengthOfparameters = parameter.length;

			for (Class para : parameter) {
				System.out.print(" " + para.getTypeName() + " ");

				if (a < lengthOfparameters) {
					System.out.print(",");
				}
				a++;
			}

			System.out.print(")");
			System.out.println();
		}

		// to get constructor
		// print constructor
		Constructor[] construct = className.getConstructors();
		int lengthOfConstructor = construct.length;
		for (Constructor constructor : construct) {

			int b = 1;
			int mod4 = constructor.getModifiers();
			javaP.printModifier(mod4);
			System.out.print(" " + constructor.getName());
			System.out.print("(");
			Class[] parameter = constructor.getParameterTypes();
			int lengthOfparameter = parameter.length;

			for (Class para : parameter) {
				System.out.print(" " + para.getTypeName() + " ");

				if (b < lengthOfparameter) {
					System.out.print(",");
				}
				b++;
			}
			System.out.print(")");
			System.out.println();
		}
	}
}
