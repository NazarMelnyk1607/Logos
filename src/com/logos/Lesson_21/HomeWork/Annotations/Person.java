package com.logos.Lesson_21.HomeWork.Annotations;

@Show
public class Person {
    @Show
    private String name;
    @Show
    private int age;
    @Show
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Show
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
    @Show
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
