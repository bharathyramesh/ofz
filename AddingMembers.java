package com.ofs.training;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddingMembers {

    public static void main(String[] args) {

        List<Person> newRoster = new ArrayList<>();
        newRoster.add(new Person("John",
                                 IsoChronology.INSTANCE.date(1980, 6, 20),
                                 Person.Sex.MALE,
                                 "john@example.com"));
        newRoster.add(new Person("Jade",
                                IsoChronology.INSTANCE.date(1990, 7, 15),
                                Person.Sex.FEMALE, "jade@example.com"));
        newRoster.add(new Person("Donald",
                                IsoChronology.INSTANCE.date(1991, 8, 13),
                                Person.Sex.MALE, "donald@example.com"));
        newRoster.add(new Person("Bob",
                                IsoChronology.INSTANCE.date(2000, 9, 12),
                                Person.Sex.MALE, "bob@example.com"));

        List<Person> list = Person.createRoster();
        list.addAll(newRoster);

        System.out.println("Size of the list " + list.size());
        System.out.println("list after addition");
        System.out.println(list);

        System.out.println("\n list after removal \n");

        list.removeAll(newRoster);
        System.out.println(list);

        boolean isExist = list.stream().anyMatch(person -> person.name == "Bob");
        System.out.println(isExist);

        list.removeAll(list);
        System.out.println("\n list after removal \n");
        System.out.println(list);
    }

}

