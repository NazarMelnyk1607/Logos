package com.logos.Lesson_15.CodeTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Person person1 = new Person("Aleksandr", 1);
        Person person2 = new Person("Taras", 2);
        Person person3 = new Person("Nazar", 3);

        Account account1 = new Account(2, "Top73845");
        Account account2 = new Account(5, "Hacker2022");
        Account account3 = new Account(7, "Pikachy1789");

        Map<Person, Account> personAccountMap = new HashMap<>();

        personAccountMap.put(person1, account3);
        personAccountMap.put(person2, account2);
        personAccountMap.put(person3, account1);

        System.out.println(personAccountMap);

        Map<Person, ArrayList<Account>> personArrayListMap = new HashMap<>();
        ArrayList<Account> accountArrayList = new ArrayList<>();
        accountArrayList.add(account1);
        accountArrayList.add(account2);
        accountArrayList.add(account3);
        personArrayListMap.put(person1, accountArrayList);
        System.out.println(personArrayListMap);


        ArrayList<Account> accountArrayList1 = personArrayListMap.get(person1);
        accountArrayList1.add(account3);
        System.out.println(personArrayListMap);

    }
}
