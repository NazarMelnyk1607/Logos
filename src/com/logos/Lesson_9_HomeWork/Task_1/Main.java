package com.logos.Lesson_9_HomeWork.Task_1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double number;
        System.out.println("Введіть число:");
        number = scanner.nextDouble();
        ParneOrNo.parne(number);
    }
}
