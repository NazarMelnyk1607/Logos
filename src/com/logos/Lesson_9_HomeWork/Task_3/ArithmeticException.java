package com.logos.Lesson_9_HomeWork.Task_3;

public class ArithmeticException extends Exception {
    private String message;

    ArithmeticException(String message){
        this.message = message;
    }
}
