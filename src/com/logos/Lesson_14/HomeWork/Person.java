package com.logos.Lesson_14.HomeWork;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        if(this.age > person.getAge()){
            return 1;
        } else if(this.age < person.getAge()){
            return -1;
        } else {
            if(this.name.compareTo(person.getName()) > 0){
                return 1;
            } else if(this.name.compareTo(person.getName()) < 0){
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
