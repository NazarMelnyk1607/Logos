package com.logos.Lesson_18.Generics.HomeWork;

import java.util.*;

public class MyEntry <K, V> {
    private K kay;
    private V value;

    static Map<Object, Object> map = new HashMap<Object, Object>();

    public void add(K kay, V value){
        map.put(kay, value);
    }
    public void delete(K kay){
        map.remove(kay);
    }
    public void delete(K kay, V value){
        map.remove(kay, value);
    }
    public void printKeys(){
        Set<K> keys = (Set<K>) map.keySet();
        for (K key : keys){
            System.out.println(key);
        }
    }
//    public void printValue(){
//        List<V> list = new ArrayList(map.values());
//
//
//    }
    public void printAllMap(){
        for(Map.Entry<Object, Object> entry : map.entrySet()){
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }
    }

    public MyEntry() {
    }

    public MyEntry(K kay, V value) {
        this.kay = kay;
        this.value = value;
    }

    public K getKay() {
        return kay;
    }

    public void setKay(K kay) {
        this.kay = kay;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "kay=" + kay +
                ", value=" + value +
                '}';
    }
}
