package com.ofs.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {

		ArrayList<Employee> listOfArrays = new ArrayList<Employee>();
		Employee employeone = new Employee("bharathy", 1);
		Employee employetwo = new Employee("bharathyRamesh", 2);

		listOfArrays.add(employeone);
		listOfArrays.add(employetwo);

		ArrayList<Employee> listOfArraystwo = new ArrayList<Employee>();
		
		Employee employeThree = new Employee("bharathyRamesh", 3);
		Employee employeFour = new Employee("bharathySuresh", 4);

		listOfArraystwo.add(employeThree);
		listOfArraystwo.add(employeFour);
		listOfArrays.addAll(listOfArraystwo);
		listOfArrays.remove(3);

		LinkedList<Employee> listOfArraysUsingLinkedList = new LinkedList<Employee>();
		listOfArraysUsingLinkedList.add(employeThree);
		listOfArraysUsingLinkedList.add(employeFour);
		
		// listOfArrays.removeAll(listOfArraystwo);
		listOfArrays.retainAll(listOfArraystwo);

		Employee employeFive = new Employee("bharathySuresh", 5);
		Employee employeSix = new Employee("bharathySuresh", 6);
		List<Employee> empList = new LinkedList<Employee>();
		
		empList.add(employeFive);
		empList.add(employeSix);
		// empList.addAll(3, empList);
		Iterator<Employee> iterator = listOfArrays.iterator();
		Iterator<Employee> iteratorTwo = empList.iterator();
		Iterator<Employee> iteratorThree = listOfArraysUsingLinkedList.iterator();

		while (iterator.hasNext()) {
			Employee emp = (Employee) iterator.next();
			System.out.format("name is %s and id is %d \n ", emp.name, emp.id);
		}

		while (iteratorTwo.hasNext()) {
			Employee emp1 = (Employee) iteratorTwo.next();
			System.out.format("name is %s and id is %d \n ", emp1.name, emp1.id);
		}
		
		while (iteratorThree.hasNext()) {
            Employee emp2 = (Employee) iteratorThree.next();
            System.out.format("name is %s and id is %d \n ", emp2.name, emp2.id);System.out.println();
        }

	}

}
