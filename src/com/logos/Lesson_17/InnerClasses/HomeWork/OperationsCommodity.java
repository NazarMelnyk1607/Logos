package com.logos.Lesson_17.InnerClasses.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class OperationsCommodity {
    List<Commodity> commodityList = new ArrayList<>();

    public List<? extends Commodity> addCommodity(Commodity commodity){
        commodityList.add(commodity);
        return commodityList;
    }
    public List<? extends Commodity> removeCommodity(Commodity commodity){
        commodityList.remove(commodity);
        return commodityList;
    }
    public void replaceCommodity(Commodity commodity_1, Commodity commodity_2){
        if(commodity_1.getName().equals(commodity_2.getName())){
            commodity_1.setName(commodity_2.getName());
        }else{
            System.out.println("Commodity doesn't exist.");
        }
    }
    public void printCommodity(int index){
        System.out.println(commodityList.get(index));
    }
    public void exit(){
        int i = 0;
        System.exit(i);
    }
    public void printAll(List<? extends Commodity> list){
        for (Commodity commodity : list){
            System.out.println(commodity);
        }
    }
}
