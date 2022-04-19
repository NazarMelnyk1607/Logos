package com.logos.Lesson_21.HomeWork.Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Methods methods = new Methods();
        methods.formatterDate(localDate);

        LocalTime localTime = LocalTime.now();
        methods.formatterTime(localTime);

    }
}
