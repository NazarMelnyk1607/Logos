package com.logos.Lesson_14.CodeTime;

import java.util.Comparator;

public class PurchaseByCountComparator implements Comparator<Purchase> {

    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o2.getCount() - o2.getCount() ;
    }
}
