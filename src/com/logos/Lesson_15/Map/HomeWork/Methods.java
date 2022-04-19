package com.logos.Lesson_15.Map.HomeWork;

import java.lang.reflect.AnnotatedArrayType;
import java.util.*;

public class Methods {

    public Scanner scanner = new Scanner(System.in);

    public void addPerson(String name, int age, List<Person> personList){
        Person person = new Person(name, age);
        personList.add(person);
    }

    public void printPersons(List<Person> personList){
        for (Person person : personList){
            System.out.println(person);
        }
    }

    public List<Animal> newAnimalList(){
        List<Animal> animalList = new ArrayList<>();
        return animalList;
    }

    public void addAnimal(AnimalType animalType, String name, List<Animal> animalList){
        Animal animal = new Animal(animalType, name);
        animalList.add(animal);
    }

    public void addAnimalToPerson(Map<Person, List<Animal>> map, List<Animal> animalList, List<Person> personList){
        System.out.println("Write person name, if you want add this person some animals:");
        String namePerson = scanner.next();
        System.out.println("Write person age, if you want add this person some animals:");
        int age = scanner.nextInt();
        for (Person person : personList){
            if((person.getName().equals(namePerson)) && (person.getAge() == age)){
                map.put(person, animalList);
                break;
            }else {
                continue;
            }
        }
    }

    public List<Animal> removeAnimal(List<Animal> animalList){
        System.out.println("Write animal index, what animal you want to delete:");
        int index = scanner.nextInt();
        animalList.remove(index);
        List<Animal> animalList1 = new ArrayList<>();
        for (Animal animal : animalList){
            animalList1.add(animal);
        }
        return animalList1;
    }

    public void removeAnimalToPerson(Map<Person, List<Animal>> map, List<Animal> animalList, List<Person> personList){
        System.out.println("Write person name, if you want delete this person some animals:");
        String namePerson = scanner.next();
        System.out.println("Write person age, if you want delete this person some animals:");
        int age = scanner.nextInt();
        for (Person person : personList){
            if((person.getName().equals(namePerson)) && (person.getAge() == age)){
                List<Animal> animalList1 = removeAnimal(animalList);
                map.replace(person, animalList, animalList1);
                break;
            }else {
                continue;
            }
        }
    }

    public void removePersonFromTheZooClub(Map<Person, List<Animal>> map, List<Person> personList){
        System.out.println("Write person name, if you want delete this person:");
        String namePerson = scanner.next();
        System.out.println("Write person age, if you want delete this person:");
        int age = scanner.nextInt();
        for (Person person : personList){
            if((person.getName().equals(namePerson)) && (person.getAge() == age)){
                map.remove(person);
                break;
            }else {
                continue;
            }
        }
    }

    public void printZooClub(Map<Person, List<Animal>> map){
        System.out.println(Arrays.asList(map));
    }

    public void exitProgram(){
        System.exit(0);
    }


}
