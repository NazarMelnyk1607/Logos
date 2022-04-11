package com.logos.Exam_Java_Core;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DeviceService {

    public List<Device> devices;

    public void readFromFile(){
        StringBuffer concat = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\nazar\\Downloads\\task_exam.txt"));
            String line;

            while ((line = bufferedReader.readLine()) != null){
                concat.append(line);
                if(concat.equals("."))
                devices.add(convertStringInObject(String.valueOf(concat)));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private Device convertStringInObject(String string) {
        String[] array = string.split(",");
        return new Device(Long.parseLong(array[0].trim()), array[1], array[2], Integer.parseInt(array[3].trim()));
    }

}
