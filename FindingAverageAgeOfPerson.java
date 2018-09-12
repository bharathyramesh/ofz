package com.ofs.training;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindingAverageAgeOfPerson {

    public static void main(String[] args) {

        FindingAverageAgeOfPerson age = new FindingAverageAgeOfPerson();

        List<Person> persons = Person.createRoster();

        double averageUsingInt = age.getAverageUsingInt(persons);
        System.out.println(averageUsingInt);

        double averageUsingLong = age.getAverageUsingLong(persons);
        System.out.println(averageUsingLong);
    }

    private double getAverageUsingLong(List<Person> persons) {
        double age = persons.stream().mapToInt(Person::getAge).average().getAsDouble();
        return age;
    }

    private double getAverageUsingInt(List<Person> persons) {
        double age = persons.stream().mapToLong(Person::getAge).average().getAsDouble();
        return age;
    }

}


//private OptionalDouble getAverageUsingLong(List<Person> persons) {
//    List<Integer> age = persons.stream().map(person -> person.getAge()).collect(Collectors.toList());
//    System.out.println(age);
//    OptionalDouble integerSum = (age.stream().mapToLong(Integer::intValue).average());
//    return integerSum;
//}