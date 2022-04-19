package com.logos.Lesson_21.HomeWork.Annotations;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.CharBuffer;

public class RealizationAnnotation {
    public static void main(String[] args) throws IOException {

        Person person = new Person("Nazar", 21);
        Class<Person> personClass = (Class<Person>) person.getClass();
        RealizationAnnotation realizationAnnotation = new RealizationAnnotation();
        realizationAnnotation.print(personClass);
    }

    public void print(Class c) throws IOException {

        Field[] fields = c.getDeclaredFields();
        for(Field field : fields){
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations){
                if(annotation.annotationType().equals(Show.class)){
                    System.out.println(field.getName());
                    writeStringInFile(field.getName());
                }
            }
        }

        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods){
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations){
                if(annotation.annotationType().equals(Show.class)){
                    System.out.println(method.getName());
                    writeStringInFile(method.getName());
                }
            }
        }

        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            Annotation[] annotations = constructor.getDeclaredAnnotations();
            for (Annotation annotation : annotations){
                if(annotation.annotationType().equals(Show.class)){
                    System.out.println(constructor.getName());
                    writeStringInFile(constructor.getName());
                }
            }
        }
    }

    public void writeStringInFile(String string) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\nazar\\Downloads\\annotation.txt");
        fileWriter.write(string + "\n");
        fileWriter.close();
    }

}
