package com.azdybel.algs.Interfaces;

public interface IBackpackProblem {
    void addItem(int weight, int value);
    void solve();
    int getMaxValue();
}
