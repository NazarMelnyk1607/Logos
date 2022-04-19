package com.logos.Lesson_21.HomeWork.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Methods {
    public void formatterDate(LocalDate date){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM - dd - YYYY");
        System.out.println(dateTimeFormatter.format(date));
    }
    public void formatterTime(LocalTime localTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(dateTimeFormatter.format(localTime));
    }
    public void formatterDateTime(LocalDateTime localDateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM - dd - YYYY h:mm a");
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
