package com.logos.Lesson_22.Lamda.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class MyElements {
    public List<Integer> integerList = new ArrayList<>();

    public void searchMaxElement(Element e){
        int numberMax = integerList.get(0);
        for(int i = 1; i < integerList.size(); i++){
            if(integerList.get(i) > numberMax){
                numberMax = integerList.get(i);
            }
        }
        e.searchElement(numberMax);
    }

    public void searchMinElement(Element e){
        int numberMin = integerList.get(0);
        for(int i = 1; i < integerList.size(); i++){
            if(integerList.get(i) < numberMin){
                numberMin = integerList.get(i);
            }
        }
        e.searchElement(numberMin);
    }

    public void searchAverageElement(Element e){
        int number = 0;
        for(int i = 0; i < integerList.size(); i++){
            number += integerList.get(i);
        }
        number = (number / 2);
        e.searchElement(number);
    }
}
