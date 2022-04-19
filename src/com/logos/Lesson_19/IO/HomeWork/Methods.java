package com.logos.Lesson_19.IO.HomeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //Task1 and Task2
        Employee employee = new Employee("Nazar", 123, new Salary(15000));

        Methods methods = new Methods();
        methods.serialize(employee);

        Employee employee1 = methods.deserialize();
        System.out.println(employee1.getName() + " " + employee1.getId() + " " + employee1.getSalary());

        //Task3
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Oleh", 234, new Salary(17000)));
        employeeList.add(new Employee("Nazar", 567, new Salary(10000)));
        employeeList.add(new Employee("Mark", 674, new Salary(20000)));

        methods.serialize(employeeList);

        List<Employee> employees = methods.deserializeList();
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).getName() + " " + employees.get(i).getId() + " " + employees.get(i).getSalary());
//            System.out.println(employees.get(i).getName() + " " + employees.get(i).getId() + " " + employees.get(i).);
        }

        //Task4


    }

    public void serialize(Employee employee) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);

        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object was serialize");
    }
    public void serialize(List<Employee> employees) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employees);

        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object was serialize");
    }
    public Employee deserialize() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("output.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Employee employee = (Employee) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Object was deserialize");
        return employee;
    }
    public List<Employee> deserializeList() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("output.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Employee> employees = (List<Employee>) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Object was deserialize");
        return employees;
    }
}
