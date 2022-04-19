package com.logos.Lesson_22.Optional.CodeTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<Dog> optionalDog = Optional.of(new Dog("dog", 2));
        System.out.println(optionalDog.get());

//        List<Optional<Dog>> optionals = Arrays.asList(Optional.of(new Dog("dog1", 1)),
//                Optional.of(new Dog("dog2", 4)), Optional.of(new Dog("dog3")),
//                Optional.of(new Dog()), Optional.of(new Dog("dog5", 9)),
//                Optional.empty());

        List<Optional<Dog>> optionals = new ArrayList<>();

        for(Optional<Dog> optional: optionals){
            if(optional.isPresent()){
                System.out.println(optional.get());
            }
        }


    }
}
