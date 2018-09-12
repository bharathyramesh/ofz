package com.ofs.training;

import java.util.Iterator;
import java.util.List;

public class IteratorForPersonClass {

    public static void main(String[] args) {

        List<Person> person = Person.createRoster();

        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }

}
