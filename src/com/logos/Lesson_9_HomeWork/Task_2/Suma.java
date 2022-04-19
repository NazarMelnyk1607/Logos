package com.logos.Lesson_9_HomeWork.Task_2;

public class Suma {
    public static void sumaTwoNumbers(double number_1, double number_2){
        if((number_1 % 1 == 0) && (number_2 % 1 == 0)){
            double result = number_1 + number_2;
            System.out.println("Сума двох чисел = " + result);
        }else{
            System.out.println("Числа введені не коректно!!!");
        }
    }
}
