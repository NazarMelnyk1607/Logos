package com.logos.Lesson_19.IO.HomeWork;

import java.io.Serializable;

public class Salary implements Serializable {
    private int employeesSalary;

    public Salary(int employeesSalary) {
        this.employeesSalary = employeesSalary;
    }

    public Salary() {}

    public int getEmployeesSalary() {
        return employeesSalary;
    }

    public void setEmployeesSalary(int employeesSalary) {
        this.employeesSalary = employeesSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeesSalary=" + employeesSalary +
                '}';
    }
}
