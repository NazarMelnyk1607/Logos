package com.logos.Lesson_10_HomeWork.Task_1;

public class Main {
    public static void main(String[] args) {
        String str = "I like Java !!!"; // a)
        System.out.println("Останній символ рядка = " + str.charAt(str.length() - 1)); // b)
        System.out.println("Наш рядок закінчується на '!!!' = " + str.endsWith("!!!")); // в)
        System.out.println("Наш рядок починається на 'I like' = " + str.startsWith("I like")); // г)
        String[] split = str.split(" ");
        boolean b = false;
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("Java")){
                b = true;
                break;
            }else {
                continue;
            }
        }
        System.out.println("Підрядок має слово 'Java' = " + b); // д)
        System.out.println("Позиція слова 'Java' в підрядку = " + str.indexOf("Java")); // е)
        System.out.println(str.replace("a", "o")); // ж)
        System.out.println(str.toUpperCase()); // з)
        System.out.println(str.toLowerCase()); // і)
        System.out.println(str.substring(7, 11)); // к)

    }
}
