package com.logos.Lesson_19.IO.HomeWork;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int id;
    private Salary salary;

    public Employee(String name, int id, Salary salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
