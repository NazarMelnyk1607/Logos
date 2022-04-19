package com.logos.Lesson_15.Map;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String fullName;
    private String birthDay;
    private String nationality;

    public Person(String fullName, String birthDay, String nationality) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.nationality = nationality;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", nationality='" + nationality + '\'' +
                ", HashCode='" + hashCode() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fullName, person.fullName) &&
                Objects.equals(birthDay, person.birthDay) &&
                Objects.equals(nationality, person.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, birthDay, nationality);
    }

    @Override
    public int compareTo(Person o) {
        return this.hashCode() > o.hashCode() ? 1 : -1;
    }
}
