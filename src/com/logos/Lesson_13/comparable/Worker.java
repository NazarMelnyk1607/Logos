package com.logos.Lesson_13.comparable;

public class Worker implements Comparable<Worker>{

    private int level;
    private String name;
    private int age;
    private int salary;

    public Worker(int level, String name, int age, int salary) {
        this.level = level;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Worker() {}

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Worker worker) {
        if(this.level > worker.getLevel()){
            return 1;
        } else if(this.level < worker.getLevel()){
            return -1;
        } else {
            if(this.name.compareTo(worker.getName()) > 0){
                return 1;
            } else if(this.name.compareTo(worker.getName()) < 0){
                return -1;
            } else {
                if(this.age > worker.getAge()){
                    return 1;
                } else if(this.age < worker.getAge()){
                    return -1;
                } else {
                    if(this.salary > worker.getSalary()){
                        return 1;
                    } else if(this.salary < worker.getSalary()){
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
