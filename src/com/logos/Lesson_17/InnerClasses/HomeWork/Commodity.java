package com.logos.Lesson_17.InnerClasses.HomeWork;

public class Commodity implements Comparable<Commodity>{
    private String name;
    private int width;
    private int length;
    private double weight;

    public Commodity(String name, int width, int length, double weight) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public Commodity() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(Commodity commodity) {
        return this.weight > commodity.weight ? 1 : -1;
    }
}
