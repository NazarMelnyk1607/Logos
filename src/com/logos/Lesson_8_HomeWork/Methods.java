package com.logos.Lesson_8_HomeWork;

public class Methods {

    public static boolean beMonth(String month) {
        boolean b = true;
        switch (month.toUpperCase()) {
            case "APRIL":
                break;
            case "JANUARY":
                break;
            case "FEBRUARY":
                break;
            case "MARCH":
                break;
            case "MAY":
                break;
            case "JUNE":
                break;
            case "JULY":
                break;
            case "AUGUST":
                break;
            case "SEPTEMBER":
                break;
            case "OCTOBER":
                break;
            case "NOVEMBER":
                break;
            case "DECEMBER":
                break;
            default:
                return false;

        }
        return b;
    }

    public static void sameTimeOfYear(String season){

        if(season.toUpperCase().equals("SUMMER")){
            System.out.println(Months.JUNE);
            System.out.println(Months.JULY);
            System.out.println(Months.AUGUST);
        } else if(season.toUpperCase().equals("WINTER")){
            System.out.println(Months.DECEMBER);
            System.out.println(Months.JANUARY);
            System.out.println(Months.FEBRUARY);
        } else if(season.toUpperCase().equals("SPRING")){
            System.out.println(Months.APRIL);
            System.out.println(Months.MARCH);
            System.out.println(Months.MAY);
        } else if(season.toUpperCase().equals("AUTUMN")){
            System.out.println(Months.SEPTEMBER);
            System.out.println(Months.OCTOBER);
            System.out.println(Months.NOVEMBER);
        }else {
            System.out.println("Don't correct a season");
        }
    }

    public static void sameNumberOfDays(int days){

        for (int i = 0; i < Months.values().length; i++) {

        }
    }
}
