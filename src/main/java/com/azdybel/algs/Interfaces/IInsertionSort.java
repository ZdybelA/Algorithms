package com.azdybel.algs.Interfaces;

public interface IInsertionSort<T> {
    int getSortedSize();
    T getElementAtIndex(int index);
    void InsertElementAt(int index, T elementToInsert);
}
