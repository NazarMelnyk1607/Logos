package com.logos.Lesson_14.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
//
//        integerQueue.add(2);
//        integerQueue.add(22);
//        integerQueue.add(10);
//        integerQueue.add(6);
//
//        for (Integer number: integerQueue){
//            System.out.println(number);
//        }
//        System.out.println();
//
//        integerQueue.remove();
//        for (Integer number: integerQueue){
//            System.out.println(number);
//        }
//
//        System.out.println();
//
//        integerQueue.poll();
//        for (Integer number: integerQueue){
//            System.out.println(number);
//        }
//
//        integerQueue.clear();
//        for (Integer number: integerQueue){
//            System.out.println(number);
//        }

        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.offer(2);
        for (Integer number: integerQueue){
            System.out.println(number);
        }
    }


}
