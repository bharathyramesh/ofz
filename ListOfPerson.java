package com.ofs.training;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPerson {

    private Predicate<Person> isAgeAbove21() {
        return person -> person.getAge() >= 21;
    }

    private Predicate<Person> isMale() {
        return person -> person.getGender() == Person.Sex.MALE;
    }

    private List<String> filterPersonAge(List<Person> persons, Predicate<Person> predicate, Predicate<Person> predicateTwo) {
        List<String> collect = persons.stream()
                .filter(predicate.and(predicateTwo))
                .map(Person::getName)
                .collect(Collectors.toList());
        return collect;
    }

    public static void main(String[] args) {

        ListOfPerson personList = new ListOfPerson();
        List<String> filterPersonAge = personList.filterPersonAge(Person.createRoster(), personList.isAgeAbove21(), personList.isMale());
        System.out.println(filterPersonAge);
    }
}
//personList.filterPersonAge(Person.createRoster(), personList.isAgeAbove21(), personList.isMale()).forEach(System.out::println);