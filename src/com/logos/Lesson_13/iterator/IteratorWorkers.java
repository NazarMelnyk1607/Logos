package com.logos.Lesson_13.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorWorkers {

    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker(1, "James", 23, 1500));
        workerList.add(new Worker(2, "Lucas", 33, 2500));
        workerList.add(new Worker(3, "Alexander", 26, 1900));
        workerList.add(new Worker(2, "Teddy", 40, 2700));
        workerList.add(new Worker(4, "Max", 20, 1000));
        workerList.add(new Worker(5, "Naximus", 21, 1100));

        Iterator<Worker> workerIterator = workerList.iterator();
        while (workerIterator.hasNext()){
            Worker worker = workerIterator.next();
//            if(worker.getLevel() == 5){
//                worker.setSalary(worker.getSalary() - 1000);
//            }
            System.out.println(worker);
        }
        System.out.println("---------------------------");
        ListIterator<Worker> workerListIterator = workerList.listIterator();
        while (workerListIterator.hasNext()){
            Worker worker = workerListIterator.next();
            System.out.println(worker);
        }
        System.out.println("----------------------------");
        while (workerListIterator.hasPrevious()){
            Worker worker = workerListIterator.previous();
            System.out.println(worker);
        }

    }

}
