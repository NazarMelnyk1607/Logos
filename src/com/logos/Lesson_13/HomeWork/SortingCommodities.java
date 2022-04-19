package com.logos.Lesson_13.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCommodities {
    public static void main(String[] args) {
        Commodity commodity_1 = new Commodity("phone", 32, 42, 45);
        Commodity commodity_2 = new Commodity("leptop", 36, 1, 4);
        Commodity commodity_3 = new Commodity("book", 1, 9, 5);
        Commodity commodity_4 = new Commodity("TV", 6, 11, 1);
        Commodity commodity_5 = new Commodity("radio", 6, 17, 95);
        List<? extends Commodity> commodities = new ArrayList<>();
        OperationsWithCommodity operations = new OperationsWithCommodity();
        commodities = operations.addCommodity(commodity_1);
        commodities = operations.addCommodity(commodity_2);
        commodities = operations.addCommodity(commodity_3);
        commodities = operations.addCommodity(commodity_4);
        commodities = operations.addCommodity(commodity_5);
        operations.printAll(commodities);
        System.out.println("----------------------");
        Collections.sort(commodities, new CommodityNameComparator());
        operations.printAll(commodities);

        commodities = operations.removeCommodity(commodity_3);
        commodities = operations.removeCommodity(commodity_5);
        operations.printAll(commodities);
        System.out.println("----------------------");
        Collections.sort(commodities, new CommodityLengthComparator());
        operations.printAll(commodities);


    }
}
