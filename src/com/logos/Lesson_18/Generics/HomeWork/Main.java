package com.logos.Lesson_18.Generics.HomeWork;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MyEntry<Integer, String> myEntry = new MyEntry<>();
        int i;
        int key;
        String value;
        do {
            i = scanner.nextInt();
            switch (i){
                case 1:{
                    System.out.println("Write key:");
                    key = scanner.nextInt();
                    System.out.println("Write value:");
                    value = scanner.next();
                    myEntry.add(key, value);
                    break;
                }
                case 2:{
                    System.out.println("Write key:");
                    key = scanner.nextInt();
                    myEntry.delete(key);
                    break;
                }
                case 3:{
                    System.out.println("Write key:");
                    key = scanner.nextInt();
                    System.out.println("Write value:");
                    value = scanner.next();
                    myEntry.delete(key, value);
                    break;
                }
                case 4:{
                    myEntry.printKeys();
                    break;
                }
                case 6:{
                    myEntry.printAllMap();
                    break;
                }
            }

        }while (i != 0);

    }
}
