package com.logos.Lesson_9.bank;

public class NoMoneyException extends Exception{

    private String message;

    public NoMoneyException(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
