package com.logos.Lesson_12.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String word;
        do {
            System.out.println("Write word:");
            word = scanner.next();
            if(word.equals("break") == false){
                arrayList.add(word);
            }
        }while (word.equals("break") == false);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("-------------------------");
        System.out.println("All words, which start 's':");
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).startsWith("s")){
                System.out.println(arrayList.get(i));
            }
        }
        System.out.println("-------------------------");
        System.out.println("All words, which have more than 5 letters:");
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).length()>5){
                System.out.println(arrayList.get(i));
            }
        }

    }
}
