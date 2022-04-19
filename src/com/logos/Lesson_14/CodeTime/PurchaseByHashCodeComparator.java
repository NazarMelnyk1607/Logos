package com.logos.Lesson_14.CodeTime;

import java.util.Comparator;

public class PurchaseByHashCodeComparator implements Comparator<Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o1.hashCode() - o2.hashCode();
    }
}
