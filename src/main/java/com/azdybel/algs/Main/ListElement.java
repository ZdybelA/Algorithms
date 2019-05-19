package com.azdybel.algs.Main;

import java.util.List;

public class ListElement implements Comparable<ListElement> {
    private int value;
    public ListElement next;
    public ListElement prev;

    public int getValue() {
        return value;
    }

    public ListElement(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(ListElement o) {
        return this.value > o.value ? 1 : -1;
    }
}
