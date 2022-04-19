package com.logos.Lesson_11.equalshex;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Tom", 2);
        Cat catTwo = new Cat("Tom", 2);
        Cat catThree = new Cat("Pet", 3);
        System.out.println(catOne.equals(catTwo));
        System.out.println(catOne.hashCode());
        System.out.println(catTwo.hashCode());
        System.out.println(catThree.hashCode());
        boolean isCatEqualsByName = catOne.getName().equals(catTwo.getName());
        System.out.println(isCatEqualsByName);
    }
}
