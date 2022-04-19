package com.logos.Lesson_9_HomeWork.Task_3;

public class IllegalArgumentException extends Exception {
    private String message;
    IllegalArgumentException(String message){
        this.message = message;
    }
}
