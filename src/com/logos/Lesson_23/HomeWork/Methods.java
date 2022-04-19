package com.logos.Lesson_23.HomeWork;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Methods {

    public void conscriptsMans(List<People> peopleList){
        peopleList
                .stream()
                .filter(person -> (person.getAge() >= 18) && (person.getAge()<=27))
                .filter(people -> people.getSex() == Sex.MAN)
                .forEach(System.out::println);
    }

    public void middleAge(List<People> peopleList){
        OptionalDouble average = peopleList.stream().mapToInt(person -> person.getAge()).average();
        System.out.println(average);
    }

    public void able_bodiedPeople(List<People> peopleList){
        long countMan = peopleList
                .stream()
                .filter(people -> (people.getAge() >= 18) && (people.getAge() < 60))
                .filter(people -> people.getSex() == Sex.MAN)
                .count();
        long countWoman = peopleList
                .stream()
                .filter(people -> (people.getAge() >= 18) && (people.getAge() < 55))
                .filter(people -> people.getSex() == Sex.WOMAN)
                .count();
        System.out.println(countMan + countWoman);
    }

    public void sortPeopleForName(List<People> peopleList){
        peopleList
                .stream()
                .sorted(Comparator.comparing(People::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void sortPeopleForNameAndAge(List<People> peopleList){
        peopleList
                .stream()
                .sorted((o1, o2) -> {
                    if(o1.getName().compareTo(o2.getName()) > 0){
                        return 1;
                    } else if(o1.getName().compareTo(o2.getName()) < 0){
                        return -1;
                    } else{
                        if(o1.getAge() > o2.getAge()){
                            return 1;
                        } else if(o1.getAge() < o2.getAge()){
                            return -1;
                        }
                    }
                    return 0;})
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void oldPerson(List<People> peopleList){
        People people = peopleList
                .stream()
                .max(People::compareTo)
                .get();

        System.out.println(people);
    }

    public void youngPerson(List<People> peopleList){
        People people = peopleList
                .stream()
                .min(People::compareTo)
                .get();

        System.out.println(people);
    }

    public void numberOfMan(List<People> peopleList){
        peopleList
                .stream()
                .filter(people -> people.getSex() == Sex.MAN)
                .forEach(System.out::println);
    }

    public void numberOfWoman(List<People> peopleList){
        peopleList
                .stream()
                .filter(people -> people.getSex() == Sex.WOMAN)
                .forEach(System.out::println);
    }


}
