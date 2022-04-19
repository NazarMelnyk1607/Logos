package com.logos.Lesson_13.comparable;

import java.util.Comparator;

public class WorkerSalaryComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        return worker1.getSalary() > worker2.getSalary() ? 1 : -1;
    }
}
