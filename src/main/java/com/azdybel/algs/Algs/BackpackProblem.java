package com.azdybel.algs.Algs;

import com.azdybel.algs.Helpers.Newton;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBackpackProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackpackProblem implements IBackpackProblem, IAlgorithmRunner {

    private List<Item> items = new ArrayList<>();
    private int capacity;
    private int numberOfItems;
    private int maxValue;

    @Override
    public void setup() {
        Scanner in = new Scanner(System.in);
        capacity = in.nextInt();
        numberOfItems = in.nextInt();
        for (int i = 0; i < numberOfItems; i++) {
            addItem(in.nextInt(), in.nextInt());
        }
    }

    @Override
    public void addItem(int weight, int value) {
        items.add(new Item(weight, value));
    }

    @Override
    public void run() {

    }

    @Override
    public void solve() {
        items.sort(Item::compareTo);
        while (capacity > 0 && items.size() > 0 && items.get(0).getWeight() <= capacity) {

            Item i = items.get(0);
            capacity -= i.getWeight();
            maxValue += i.getValue();
            items.remove(i);
        }

    }

    @Override
    public int getMaxValue() {
        return maxValue;
    }
}
