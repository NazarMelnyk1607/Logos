package com.logos.Lesson_20.Thread.HomeWork;

import java.util.Scanner;

public class MyThread extends Thread {

    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write, how many numbers you want:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        array[0] = 1;
        array[1] = array[0];
        for (int i = 2; i < number; i++){
            array[i] = array[i-1] + array[i-2];
        }
        System.out.print("Normal order:  ");
        for (int i : array){
            System.out.print(i + " ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
