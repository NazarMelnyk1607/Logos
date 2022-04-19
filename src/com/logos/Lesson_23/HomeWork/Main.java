package com.logos.Lesson_23.HomeWork;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            Main.menu();
        }

    public static void menu(){
        List<People> peopleList = List.of(new People("Nazar", 20, Sex.MAN),
                new People("Oleh", 62, Sex.MAN), new People("Olya", 36, Sex.WOMAN),
                new People("Mark", 16, Sex.MAN), new People("Natalya", 26, Sex.WOMAN),
                new People("Misha", 29, Sex.MAN), new People("Ira", 56, Sex.WOMAN),
                new People("Vitya", 18, Sex.MAN), new People("Andriana", 28, Sex.WOMAN));

        int count;
        while (true){
            Methods methods = new Methods();
            System.out.println("Вибрати чоловіків-військовозобов'язаних (від 18 до 27 років) - 1\n" +
                    "● Знайти середній вік серед чоловіків - 2\n" +
                    "● Знайти кількість потенційно працездатних людей у вибірці (тобто від 18) \n" +
                    "років і з огляду на що жінки виходять в 55 років, а чоловік в 60) - 3\n" +
                    "● Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку - 4\n" +
                    "● Відсортувати колекцію людей спочатку за ім’ям, а потім за віком - 5\n" +
                    "● Знайти найстаршу людину - 6\n" +
                    "● Знайти наймолодшу людину - 7\n" +
                    "● Вивести скільки є чоловіків - 8\n" +
                    "● Вивести скільки є жінок - 9\n" +
                    "EXIT - 0");

            System.out.println("Введіть число:");
            count = scanner.nextInt();

            switch (count){
                case 1:{
                    methods.conscriptsMans(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 2:{
                    methods.middleAge(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 3: {
                    methods.able_bodiedPeople(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 4: {
                    methods.sortPeopleForName(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 5: {
                    methods.sortPeopleForNameAndAge(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 6: {
                    methods.oldPerson(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 7: {
                    methods.youngPerson(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 8: {
                    methods.numberOfMan(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 9: {
                    methods.numberOfWoman(peopleList);
                    System.out.println("==================================================");
                    continue;
                }
                case 0: {
                    System.exit(0);
                }
            }
        }
    }
}
