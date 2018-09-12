package com.ofs.training;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindingPerson {

    public static void main(String[] args) {

      FindingPerson element = new FindingPerson();
      List<String> male = element.filterPerson(Person.createRoster(), element.isMale());
      LinkedList<String> list = new LinkedList<String>();

      list.addAll(male);

      System.out.println(list);
      System.out.println(list.getFirst());
      System.out.println(list.getLast());

      Random randomGenerator = new Random();
      int index = randomGenerator.nextInt(male.size());
      System.out.println(list.get(index));
    }
      private List<String> filterPerson(List<Person> persons, Predicate<Person> predicate) {
          List<String> collect = persons.stream()
                  .filter(predicate)
                  .map(Person::getName)
                  .collect(Collectors.toList());
          return collect;
      }

      private Predicate<Person> isMale() {
          return person -> person.getGender() == Person.Sex.MALE;
      }
}




// method 1
//FindingElement element = new FindingElement();
//List<String> male = element.filterPerson(Person.createRoster(), element.isMale());
//System.out.println(male);
//System.out.println(male.get(0));
//int range = male.size();
//System.out.println(male.get(range - 1));
//Random randomGenerator = new Random();
//int index = randomGenerator.nextInt(male.size());
//System.out.println(male.get(index));


// method 2
//FindingPerson element = new FindingPerson();
//List<String> male = element.filterPerson(Person.createRoster(), element.isMale());
//LinkedList<String> list = new LinkedList<String>();
//
//list.addAll(male);
//
//System.out.println(list);
//System.out.println(list.getFirst());
//System.out.println(list.getLast());
//
//Random randomGenerator = new Random();
//int index = randomGenerator.nextInt(male.size());
//System.out.println(list.get(index));
//private List<String> filterPerson(List<Person> persons, Predicate<Person> predicate) {
//    List<String> collect = persons.stream()
//            .filter(predicate)
//            .map(Person::getName)
//            .collect(Collectors.toList());
//    return collect;
//}
//
//private Predicate<Person> isMale() {
//    return person -> person.getGender() == Person.Sex.MALE;
//}
//}



// method 3
//FindingPerson element = new FindingPerson();
//Optional<String> male = element.filterPersonForFirst(Person.createRoster(), element.isMale());
//Optional<String> LastMale = element.filterPersonForLast(Person.createRoster(), element.isMale());
//System.out.println(male.get());
//System.out.println(LastMale.get());
//}
//
//private Optional<String> filterPersonForFirst(List<Person> persons, Predicate<Person> predicate) {
//  Optional<String> collect = persons.stream()
//          .filter(predicate)
//          .map(Person::getName).findFirst();
////          .collect(Collectors.toList());
//  return collect;
//}
//
//private Optional<String> filterPersonForLast(List<Person> persons, Predicate<Person> predicate) {
//  Optional<String> collect = persons.stream()
//          .filter(predicate)
//          .map(Person::getName).findAny();
////          .collect(Collectors.toList());
//  return collect;
//}
//
//private Predicate<Person> isMale() {
//  return person -> person.getGender() == Person.Sex.MALE;
//}