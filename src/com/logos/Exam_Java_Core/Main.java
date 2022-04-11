package com.logos.Exam_Java_Core;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DeviceService deviceService = new DeviceService();
        deviceService.readFromFile();
        System.out.printf(deviceService.devices.get(0).toString());

        //Task1
        deviceService
                .devices.
                stream()
                .forEach(device -> System.out.println(device.toString()));

        //Task2
        long number = scanner.nextLong();
        deviceService
                .devices
                .stream()
                .filter(device -> device.serialNumber == number)
                .forEach(device -> System.out.println(device.toString()));

        long count = deviceService
                .devices
                .stream()
                .filter(device -> device.serialNumber == number)
                .count();
        if (count == 0){
            throw new RuntimeException("Жодного приладу з таким серійним номером.");
        }

        //Task3
        deviceService
                .devices
                .stream()
                .sorted();

        //Task4
        deviceService
                .devices
                .stream()
                .filter(device -> device.price > 400)
                .forEach(device -> System.out.println(device.toString()));

        //Task5
        deviceService
                .devices
                .stream()
                .filter(device -> device.price < 800)
                .forEach(device -> System.out.println(device.toString()));

        //Task6
        Collections.sort(deviceService.devices, new Device());
        deviceService
                .devices
                .stream()
                .forEach(device -> System.out.println(device.toString()));

    }


}
