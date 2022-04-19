package com.logos.Lesson_9_HomeWork.Task_3;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IllegalAccessException, ArithmeticException, IllegalArgumentException, MyException{
        double number_1 = 0;
        double number_2 = 0;
        String message;
        System.out.println("Введіть перше число:");
        number_1 = scanner.nextDouble();
        System.out.println("Введіть друге число:");
        number_2 = scanner.nextDouble();
        if((number_1 < 0) && (number_2 < 0)){
            message = "Перше і друге число менше нуля.";
            throw new IllegalArgumentException(message);
        } else if(((number_1 == 0) && (number_2 != 0)) || ((number_1 != 0) && number_2 == 0)){
            message = "Перше число дорівнює нулю, або друге число.";
            throw new ArithmeticException(message);
        } else if((number_1 == 0) && (number_2 == 0)){
            message = "Перше і друге число дорівнює нулю.";
            throw new IllegalAccessException(message);
        } else if((number_1 > 0) && (number_2 > 0)){
            message = "Перше і друге число більше нуля.";
            throw new MyException(message);
        }else {
            Arithmetic.math(number_1, number_2);
        }
    }
}
