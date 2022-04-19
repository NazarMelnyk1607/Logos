package com.logos.Lesson_13.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingWorkers {
    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<Worker>();
        workerList.add(new Worker(1, "James", 23, 1500));
        workerList.add(new Worker(2, "Lucas", 33, 2500));
        workerList.add(new Worker(3, "Alexander", 26, 1900));
        workerList.add(new Worker(2, "Teddy", 40, 2700));
        workerList.add(new Worker(4, "Max", 20, 1000));
        workerList.add(new Worker(5, "Maximus", 21, 1100));
        workerList.add(new Worker(5, "Maximus", 21, 100));

//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(4);
//        integerList.add(2);
//        integerList.add(7);
//        integerList.add(9);
//        integerList.add(1);
//        integerList.add(0);
//        Collections.sort(integerList);
//        for (int i = 0; i < integerList.size(); i++) {
//            System.out.println(integerList.get(i));
//        }
//        use comparable interface
//        Collections.sort(workerList);
//        Iterator<Worker> workerIterator = workerList.iterator();
//        while (workerIterator.hasNext()){
//            System.out.println(workerIterator.next());
//        }

//              use comparable interface

//        Collections.sort(workerList, new WorkerSalaryComparator());
//        for (Worker worker: workerList){
//            System.out.println(worker);
//        }
        Collections.sort(workerList);
        for (Worker worker: workerList){
            System.out.println(worker);
        }
    }
}
