package com.logos.Lesson_9.exception;

public class Main {
    public static void main(String[] args) {
//        divide(9.0, 0.0);
//        String someString = null;
//        someString.concat("test");
//        int[] array = {1, 2, 3};
//        System.out.println(array[3]);


    }

    private static void divide(double number_1, double number_2) {
        double result = 0;
        try {
                result = number_1 / number_2;

        }catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("finish");
        }
        System.out.println("our result = " + result);
    }
}
