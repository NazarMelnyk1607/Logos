package com.logos.Exam_Java_Core;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Comparator;

@ToString
@AllArgsConstructor
public class Device implements Comparator<Device>{
    long serialNumber;
    String brand;
    String info;
    int price;

    public Device() {
    }

    @Override
    public int compare(Device o1, Device o2) {
        return o1.price > o2.price ? 1 : -1;
    }
}
