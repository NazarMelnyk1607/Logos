package com.logos.Lesson_11.HomeWork;

import java.util.regex.Pattern;

public class Task_3 {
    public static void main(String[] args) {
        String str = "I love Java more than my friend. Java is so beautiful.";

        //task 1
        boolean matches = str.matches("Java");
        System.out.println("Task 1 = " + matches);

        //task 2
        String str1 = str.replaceFirst("Java", "C#");
        System.out.println(str1);

        //task 3
        String str2 = str.replaceAll("Java", "C#");
        System.out.println(str2);
    }
}
