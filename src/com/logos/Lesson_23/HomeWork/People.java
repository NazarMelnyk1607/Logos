package com.logos.Lesson_23.HomeWork;

import java.util.Comparator;

public class People implements Comparator<People>, Comparable<People> {
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public People() {
    }

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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName()) > 0 ? -1 : 1;
    }

    @Override
    public int compareTo(People o) {
        if(this.getAge() > o.getAge()){
            return 1;
        }else if (this.getAge() < o.getAge()){
            return -1;
        }
        return 0;
    }
}
