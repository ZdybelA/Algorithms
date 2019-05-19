package com.azdybel.algs.Main;

import com.azdybel.algs.Interfaces.IMyList;

import java.util.concurrent.atomic.AtomicBoolean;


public class MyList implements IMyList {
    private int size = 0;
    private ListElement head;
    private ListElement last;


    public int getSize() {
        return size;
    }

    public void incSize() {
        size++;
    }

    public void decSize() {
        size--;
    }

    public ListElement getHead() {
        return head;
    }

    public void setHead(ListElement head) {
        this.head = head;
    }

    public ListElement getLast() {
        return last;
    }

    public void setLast(ListElement last) {
        this.last = last;
    }

    @Override
    public void Add(ListElement listElement) {
        if (getSize() == 0) {
            this.setHead(listElement);
        } else {
            this.getLast().next = listElement;
            listElement.prev = this.getLast();
            listElement.next = this.getHead();
        }
        this.setLast(listElement);
        this.incSize();
    }

    @Override
    public void AddOrdered(ListElement listElement) {
        //znajdz odpowiednie miejsce
        //iterator = wstaw przed
        if (getSize() == 0) {
            this.setHead(listElement);
            this.setLast(listElement);
            listElement.next = listElement;
            listElement.prev = listElement;
        } else {
            ListElement iterator = this.getHead();
            if (listElement.getValue() <= iterator.getValue()) {
                this.setHead(listElement);
            } else {
                AtomicBoolean isLast = new AtomicBoolean(false);
                while (listElement.getValue() > iterator.getValue() && !isLast.get()) {
                    iterator = iterator.next;
                    if (iterator.equals(this.getHead())) {
                        this.setLast(listElement);
                        isLast.set(true);
                    }
                }
            }


            listElement.prev = iterator.prev;
            listElement.next = iterator;
            listElement.prev.next = listElement;
            iterator.prev = listElement;
        }
        this.incSize();


    }

    @Override
    public void Remove(ListElement listElement) {
        if (this.getSize() == 0) {
            System.out.println("Jakim cudem znalazles element w pustej liscie");
        } else {
            listElement.prev.next = listElement.next;
            listElement.next.prev = listElement.prev;
            listElement.prev = null;
            listElement.next = null;
        }
        this.decSize();
    }

    @Override
    public ListElement Find(int value) {

        return null;
    }

    @Override
    public ListElement FindIndexForValue(int value) {
        ListElement le = this.getHead();
        ListElement reverseLe = this.getLast();

        return null;
    }
}
