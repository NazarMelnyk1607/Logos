package com.logos.Lesson_10_HomeWork.Task_2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введіть набір слів: ");
        String string = scanner.nextLine();
        String[] split = string.split(" ");
        int indexLongString = 0;
        int indexShortString = 0;
        int longLengthMyString = split[0].length();
        int shortLengthMyString = split[0].length();
        for (int i = 1; i < split.length; i++) {
            if(longLengthMyString < split[i].length()){
                longLengthMyString = split[i].length();
                indexLongString = i;
            } else if(shortLengthMyString > split[i].length()){
                shortLengthMyString = split[i].length();
                indexShortString = i;
            } else{
                continue;
            }
        }

        System.out.println("Найдовше слово = " + split[indexLongString] +
                ", індекс слова = " + indexLongString);
        System.out.println("Найкоротше слово = " + split[indexShortString] +
                ", індекс слова = " + indexShortString);

    }
}
