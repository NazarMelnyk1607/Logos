package com.logos.Lesson_12_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {23, 13, 54, 12, 456};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        while (true){
            int randomValueIndex = new Random().nextInt(intArray.length);
            int searchValue = intArray[randomValueIndex];
            int location = Arrays.binarySearch(intArray, searchValue);
            if(location >= 0){
                System.out.println("Location of " + searchValue
                + " is " + location + " intArray[" + location + "] = " + intArray[location]);
                break;
            }
        }
    }
}
