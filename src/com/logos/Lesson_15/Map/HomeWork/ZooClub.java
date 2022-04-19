package com.logos.Lesson_15.Map.HomeWork;

import java.lang.reflect.Method;
import java.util.*;

public class ZooClub {
    public static void main(String[] args) {
        Methods zooClub = new Methods();
        Map<Person, List<Animal>> map = new HashMap<>();
        List<Person> personList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();

        zooClub.addPerson("Nazar", 22, personList);
        zooClub.addPerson("Oleh", 20, personList);
        zooClub.addPerson("Mark", 19, personList);
        zooClub.addPerson("Ihor", 26, personList);

        Animal animal_1 = new Animal(AnimalType.CAT, "cat");
        Animal animal_2 = new Animal(AnimalType.DOG, "dog");
        Animal animal_3 = new Animal(AnimalType.CAT, "mya");

//        zooClub.addAnimalToPerson(map, Arrays.asList(animal_1, animal_3), personList);
//        zooClub.addAnimalToPerson(map, Arrays.asList(animal_1, animal_2), personList);

        zooClub.printZooClub(map);
        zooClub.printPersons(personList);

    }
}
