package com.logos.Lesson_20.Thread.HomeWork;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write, how many numbers you want:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        array[0] = 1;
        array[1] = array[0];
        for (int i = 2; i < number; i++){
            array[i] = array[i-1] + array[i-2];
        }
        System.out.print("Reverse order:  ");
        for (int i = number-1; i >= 0; i--){
            System.out.print(array[i] + " ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
