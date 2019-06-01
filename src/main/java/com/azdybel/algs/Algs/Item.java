package com.azdybel.algs.Algs;

import java.util.Comparator;

public class Item implements Comparable<Item> {

    public int p;
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.value = value;
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Item o) {

        double o1ratio = (double) this.value / (double) this.weight;
        double o2ratio = (double) o.value / (double) o.weight;
        if (o1ratio == o2ratio) {
            if (this.weight > o.weight) return this.weight == o.weight ? 0 : 1;
            return -1;
        }
        return o1ratio < o2ratio ? 1 : o1ratio == o2ratio ? 0 : -1;
//        return this.value < o.value ? 1 : -1;
    }
}

//126 200 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4
