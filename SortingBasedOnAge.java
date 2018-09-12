package com.ofs.training;

import java.util.Comparator;
import java.util.stream.Collectors;

public class SortingBasedOnAge {

    public static void main(String[] args) {

        (Person.createRoster().stream()
                              .sorted((Comparator.comparing(Person::getAge)).reversed())
                              .collect(Collectors.toList()))
                              .forEach(System.out::println);
    }

}
