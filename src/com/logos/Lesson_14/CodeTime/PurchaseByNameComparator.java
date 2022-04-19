package com.logos.Lesson_14.CodeTime;

import java.util.Comparator;

public class PurchaseByNameComparator implements Comparator<Purchase> {
    @Override
    public int compare(Purchase purchase1, Purchase purchase2) {
        return purchase1.getName().compareTo(purchase2.getName());
    }
}
