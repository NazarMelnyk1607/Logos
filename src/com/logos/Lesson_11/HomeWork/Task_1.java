package com.logos.Lesson_11.HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        String[] names = new String[10];
        Pattern pattern = Pattern.compile("^a");
        int i = 0;

        do {
            System.out.println("Write a word:");
            name = scanner.next();
            Matcher matcher = pattern.matcher(name);
            if(matcher.find()){
                names[i] = name;
                i++;
            }
        }while (name.equals("break") == false);

        System.out.println("---------------------------");

        for (int k = 0; k<names.length; k++){
            System.out.println(names[k]);
        }
    }

}
