package com.logos.Lesson_14.HomeWork;

import java.util.*;

public class SortingPersons {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();

        personSet.add(new Person("Nazar", 22));
        personSet.add(new Person("Mark", 14));
        personSet.add(new Person("Misha", 31));
        personSet.add(new Person("Ihor", 19));
        personSet.add(new Person("Avlo", 22));


        for (Person person : personSet){
            System.out.println(person);
        }



    }
}
