package com.logos.Lesson_10_HomeWork.Task_3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введіть набір слів: ");
        String string = scanner.nextLine();
        String[] split = string.split(" ");
        for (int i = 0; i < split.length; i++) {
            if((split[i].charAt(0) == 'a') && (split[i].length() % 2 == 0)){
                System.out.println("Слово = " + split[i] +
                        " починається на символ 'а', і має парну кількість символів.");
            } else {
                continue;
            }
        }
    }
}
