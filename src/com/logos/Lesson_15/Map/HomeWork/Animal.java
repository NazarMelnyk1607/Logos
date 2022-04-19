package com.logos.Lesson_15.Map.HomeWork;

public class Animal {
    private AnimalType animalType;
    private String name;

    public Animal(AnimalType animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public Animal() {
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType=" + animalType +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
