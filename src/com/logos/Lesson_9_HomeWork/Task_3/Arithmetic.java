package com.logos.Lesson_9_HomeWork.Task_3;

public class Arithmetic {
    public static void math(double number_1, double number_2){
        System.out.println("Number one = " + number_1 + ", Number two = " + number_2);
        System.out.println("Додавання двох чисел = " + MathMethods.suma(number_1, number_2));
        System.out.println("Віднімання двох чисел = " + MathMethods.vidnimanya(number_1, number_2));
        System.out.println("Множення двох чисел = " + MathMethods.mnojenya(number_1, number_2));
        System.out.println("Ділення двох чисел = " + MathMethods.dilenya(number_1, number_2));
    }
}
