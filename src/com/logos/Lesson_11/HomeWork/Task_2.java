package com.logos.Lesson_11.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String email;

        ArrayList<String> emailList = new ArrayList<>();
        Pattern pattern = Pattern.compile("@gmail.com$");
        do {
            System.out.println("Write your email:");
            email = scanner.next();
            Matcher matcher = pattern.matcher(email);
            if(matcher.find()){
                emailList.add(email);
            }
        }while (email.equals("break") == false);

        System.out.println("----------------");
        for (int i = 0; i < emailList.size(); i++) {
            System.out.println(emailList.get(i));
        }
    }
}
