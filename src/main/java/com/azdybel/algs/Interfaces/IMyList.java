package com.azdybel.algs.Interfaces;

import com.azdybel.algs.Main.ListElement;

public interface IMyList {
    void Add(ListElement listElement);
    void AddOrdered(ListElement listElement);
    void Remove(ListElement listElement);
    ListElement Find(int value);
    ListElement FindIndexForValue(int value);
}
