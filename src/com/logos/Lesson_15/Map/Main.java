package com.logos.Lesson_15.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<String, Person>();
        personMap.put("123-ab", new Person("Tataryn Oleksandr Petrovych",
                "8.02.89", "Ukrainian"));
        personMap.put("124-cb", new Person("Tataryn Petro Ivanovixh",
                "7.08.59", "Ukrainian"));
        personMap.put("125-ab", new Person("Tataryn Olha Sergiivna",
                "19.10.79", "Ukrainian"));
        personMap.put("123-ab", new Person("Kychylap Olha Sergiivna",
                "19.10.79", "Ukrainian"));


        for (Map.Entry<String, Person> entry : personMap.entrySet()){
            System.out.println("entry passport: " + entry.getKey() + " person: " + entry.getValue());
        }

        //Person personFromMap = personMap.get("124-cb");
        //Person personFromNull = personMap.get("128-cb");
        //System.out.println(personFromMap);
        //System.out.println(personFromNull);

        // operation with map

//        Person removePersonFromMap = personMap.remove("123-ab");
//        boolean isPersonRemoved = personMap.remove("124-cb", new Person("Tataryn Petro Ivanovixh",
//                "7.08.59", "Ukrainian"));
//
//        System.out.println("removePersonFromMap " + removePersonFromMap );
//        System.out.println("isPersonRemoved " + isPersonRemoved);

        Set<String> keys = personMap.keySet();
        List<Person> personList = new ArrayList<>(personMap.values());

        for (Person _person : personList){
            System.out.println(_person);
        }

    }
}
