package com.logos.Lesson_16.Raflaction.HomeWork;

import java.lang.reflect.*;

public class Group {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Student student = new Student();
        Student student1 = new Student("Nazar", 20);
        Class<Student> studentClass = (Class<Student>) student.getClass();
        System.out.println("All constructors and parameters in my class.");
        Constructor[] constructors = studentClass.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getName());
            }
        }

        System.out.println("------------------------------");
        System.out.println("All methods and parameters in my class.");
        Method[] methods = studentClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter);
            }
        }

        System.out.println("-------------------------------");
        System.out.println("All fields in my class.");
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
        }


    }
}
