package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IInsertionSort;
import com.azdybel.algs.Main.ListElement;
import com.azdybel.algs.Main.MyList;

import java.util.Random;

public class ListInsertionSort implements IInsertionSort<ListElement>, IAlgorithmRunner {

    private MyList myList;

    @Override
    public void setup() {
        this.myList = new MyList();
        ListElement twenty = new ListElement(20);
        for (int i = 0; i < 450; i++) {
            myList.AddOrdered(new ListElement(new Random(System.nanoTime()).nextInt(30)));
        }
        ListElement iterator = myList.getHead();
        do {
            System.out.println(iterator.getValue());
            iterator = iterator.next;
        } while (iterator != myList.getHead());
    }

    @Override
    public void run() {

    }

    @Override
    public int getSortedSize() {
        return 0;
    }

    @Override
    public ListElement getElementAtIndex(int index) {

        return null;
    }

    @Override
    public void insertElementAt(int index, ListElement elementToInsert) {

    }

    @Override
    public void sort() {

    }
}
