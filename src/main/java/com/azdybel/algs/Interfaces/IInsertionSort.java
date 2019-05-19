package com.azdybel.algs.Interfaces;

public interface IInsertionSort<T> {
    int getSortedSize();
    T getElementAtIndex(int index);
    void insertElementAt(int index, T elementToInsert);
    void sort();
}
