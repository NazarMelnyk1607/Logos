package com.logos.Lesson_12.ArrayList;

import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayList<T> implements List<T>{

    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 5;
    private int size;

    public ArrayList(int initCapacity){
        if(initCapacity < 0) throw new IllegalArgumentException();
        elements = new Object[initCapacity];
    }

    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void add(T element) {
        resizeIfNeeded();
        elements[size] = element;
        size++;
    }

    private void resizeIfNeeded() {
        if(elements.length == size){
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    @Override
    public void add(int index, Object element) {
        Objects.checkIndex(index, size);
        resizeIfNeeded();
        // 3, 4, 5, 6, 7 - 9 in index 2
        // 3, 4, 5, 5, 6, 7
        // 3, 4, 9, 5, 6, 7
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public void set(int index, Object element) {
        Objects.checkIndex(index, size);
        elements[index] = element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }

    @Override
    public T getFirst() {
        if(isEmpty()) throw new NoSuchElementException();
        return get(0);
    }

    @Override
    public T getLast() {
        if(isEmpty()) throw new NoSuchElementException();
        return get(size-1);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        Objects.checkIndex(index, size);
//        2, 3, 4, 5, 6 remove 4 where index 2
//        2, 3, 5, 6
        System.arraycopy(elements, index+1, elements, index, size-index-1);
        size--;
        return (T) elements[index];
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if(element.equals(elements[i])) return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }
}
