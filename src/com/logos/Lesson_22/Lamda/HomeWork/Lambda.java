package com.logos.Lesson_22.Lamda.HomeWork;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 14, 73, 1, 9);
        MyElements myElements = new MyElements();
        myElements.integerList = integers;

        myElements.searchMaxElement(i -> System.out.println(i));
        myElements.searchMinElement(i -> System.out.println(i));
        myElements.searchAverageElement(i -> System.out.println(i));
    }
}
