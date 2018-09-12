package com.ofs.training;

import java.util.List;

public class PrintingPersonUsingForEach {

    public static void main(String[] args) {

        List<Person> list = Person.createRoster();
         list.stream().forEach(person -> System.out.println(person.getName()));
    }

}
