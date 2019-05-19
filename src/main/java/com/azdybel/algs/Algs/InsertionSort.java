package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IInsertionSort;

import java.util.Random;

public class InsertionSort implements IInsertionSort<Integer>, IAlgorithmRunner {

    private Integer[] table;
    private int sortedSize;
    @Override
    public int getSortedSize() {
        return sortedSize;
    }

    @Override
    public Integer getElementAtIndex(int index) {
        return table[index];
    }

    @Override
    public void InsertElementAt(int index, Integer elementToInsert) {
        //czy index istnieje w tablicy
        //0...length-1 => i-1 => 1...length
        //pętla, która stworzy przestrzeń dla naszego elementu
        //wstawiamy w wolne miejsce elementToInsert

    }

    @Override
    public void setup() {
        this.table = new Integer[50];
        for(int i=0; i<50; i++){
            this.table[i] = new Random(System.nanoTime()).nextInt();
        }

    }

    @Override
    public void run() {


    }
}
