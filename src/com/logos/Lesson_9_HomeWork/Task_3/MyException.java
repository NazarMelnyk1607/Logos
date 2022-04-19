package com.logos.Lesson_9_HomeWork.Task_3;

public class MyException extends Exception {

    private String message;

    MyException(String message){
        this.message = message;
    }
}
