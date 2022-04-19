package com.logos.Lesson_17.InnerClasses.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortingCommodity {
    public static void main(String[] args) {
        Commodity commodity_1 = new Commodity("phone", 32, 42, 45);
        Commodity commodity_2 = new Commodity("leptop", 36, 1, 4);
        Commodity commodity_3 = new Commodity("book", 1, 9, 5);
        Commodity commodity_4 = new Commodity("TV", 6, 11, 1);
        Commodity commodity_5 = new Commodity("radio", 6, 17, 95);
        List<? extends Commodity> commodities = new ArrayList<>();
        OperationsCommodity operations = new OperationsCommodity();
        commodities = operations.addCommodity(commodity_1);
        commodities = operations.addCommodity(commodity_2);
        commodities = operations.addCommodity(commodity_3);
        commodities = operations.addCommodity(commodity_4);
        commodities = operations.addCommodity(commodity_5);
        operations.printAll(commodities);
        System.out.println("-------------------");
        Collections.sort(commodities, lengthCommodity());
        operations.printAll(commodities);
    }

    public static Comparator<Commodity> lengthCommodity(){
        return new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getLength() > o2.getLength() ? 1 : -1;
            }
        };
    }

    public static Comparator<Commodity> nameCommodity(){
        return new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    public static Comparator<Commodity> weightCommodity(){
        return new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getWeight() > o2.getWeight() ? 1 : -1;
            }
        };
    }

    public static Comparator<Commodity> widthCommodity(){
        return new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getWidth() > o2.getWidth() ? 1 : -1;
            }
        };
    }

}
