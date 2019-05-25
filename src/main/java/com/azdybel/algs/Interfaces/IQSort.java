package com.azdybel.algs.Interfaces;

public interface IQSort {
    int partition(int[] tab, int start, int end);
    void sort(int[] tab, int start, int end);
    void swap(int[] tab, int i, int j);
    int choosePP(int tab[], int start, int end);

}
