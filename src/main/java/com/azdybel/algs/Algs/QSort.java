package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IInsertionSort;
import com.azdybel.algs.Interfaces.IQSort;

import java.util.Random;

import static com.azdybel.algs.Statics.Constants.TEST_TABLE_MAX_VALUE;
import static com.azdybel.algs.Statics.Constants.TEST_TABLE_SIZE;

public class QSort implements IQSort, IAlgorithmRunner {

    private int[] table;


    @Override
    public void setup() {
        this.table = new int[TEST_TABLE_SIZE];

        for (int i = 0; i < TEST_TABLE_SIZE; i++) {
            this.table[i] = new Random(System.nanoTime()).nextInt(TEST_TABLE_MAX_VALUE);

        }


    }

    @Override
    public void run() {

        this.sort(table, 0, table.length - 1);
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
    }

    @Override
    public int partition(int[] tab, int start, int end) {
        int partitionPoint = choosePP(tab, start, end);
        int i = start, j = end - 1;
        swap(tab, partitionPoint, end);
        while (i != j) {
            while (tab[i] <= tab[end] && i < j) i++;
            while (tab[j] >= tab[end] && j > i) j--;
            swap(tab, i, j);
        }
        if (tab[end] < tab[i]) {
            swap(tab, i, end);
            return i;
        }
        return end;
    }

    @Override
    public void sort(int[] tab, int start, int end) {
        int partitionPoint = partition(tab, start, end);
        if (start < partitionPoint - 1) sort(tab, start, partitionPoint - 1);
        if (end > partitionPoint + 1) sort(tab, partitionPoint + 1, end);

    }

    @Override
    public void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;

    }

    @Override
    public int choosePP(int[] tab, int start, int end) {
        return (start + end) / 2;
    }
}
