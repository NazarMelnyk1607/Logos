package com.logos.Lesson_14.CodeTime;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (Purchase purchase: getPurchaseByName()){
            System.out.println(purchase);
        }
        for (Purchase purchase: getPurchaseByDefault()){
            System.out.println(purchase);
        }

    }

    private static Set<Purchase> getPurchaseByDefault() {
        Set<Purchase> purchases = new LinkedHashSet<>();

        boolean isProceed = true;
        while (isProceed){
            System.out.println("Enter purchase name (exit - tap 'break')");
            String name = scanner.next();
            if(name.equalsIgnoreCase("break")){
                isProceed = false;
            } else {
                System.out.println("enter count of purchase:");
                int count = scanner.nextInt();
                purchases.add(new Purchase(name, count));
            }
        }
        return purchases;
    }
    private static Set<Purchase> getPurchaseByCountDown() {
        Set<Purchase> purchases = new LinkedHashSet<>();

        boolean isProceed = true;
        while (isProceed){
            System.out.println("Enter purchase name (exit - tap 'break')");
            String name = scanner.next();
            if(name.equalsIgnoreCase("break")){
                isProceed = false;
            } else {
                System.out.println("enter count of purchase:");
                int count = scanner.nextInt();
                purchases.add(new Purchase(name, count));
            }
        }
        return purchases;
    }
    private static Set<Purchase> getPurchaseBy() {
        Set<Purchase> purchases = new LinkedHashSet<>();

        boolean isProceed = true;
        while (isProceed){
            System.out.println("Enter purchase name (exit - tap 'break')");
            String name = scanner.next();
            if(name.equalsIgnoreCase("break")){
                isProceed = false;
            } else {
                System.out.println("enter count of purchase:");
                int count = scanner.nextInt();
                purchases.add(new Purchase(name, count));
            }
        }
        return purchases;
    }

    private static Set<Purchase> getPurchaseByName() {
        Set<Purchase> purchases = new TreeSet<>(new PurchaseByNameComparator());

        boolean isProceed = true;
        while (isProceed){
            System.out.println("Enter purchase name (exit - tap 'break')");
            String name = scanner.next();
            if(name.equalsIgnoreCase("break")){
                isProceed = false;
            } else {
                System.out.println("enter count of purchase:");
                int count = scanner.nextInt();
                purchases.add(new Purchase(name, count));
            }
        }
        return purchases;
    }
}
