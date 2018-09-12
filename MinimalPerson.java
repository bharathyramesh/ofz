package com.ofs.training;

import java.util.List;
import java.util.stream.Collectors;

public class MinimalPerson {

    public static void main(String[] args) {

//        Person personEmail;
//        List<Person> name = Person.createRoster().stream().map(p -> getName() + getEmailAddress()).collect(Collectors.toList());
//        //System.out.println(name);
//        List<String> collect = Person.createRoster().stream().map(Person::getEmailAddress).collect(Collectors.toList());
//        //System.out.println(collect);
//        name.addAll(collect);
//        System.out.println(name);
        List<String> name = Person.createRoster()
                                  .stream()
                                  .map(p -> p.getName() + p.getEmailAddress())
                                  .collect(Collectors.toList());
        System.out.println(name);
    }

}
//personList.filterPersonAge(Person.createRoster(), personList.isAgeAbove21(), personList.isMale()).forEach(System.out::println);