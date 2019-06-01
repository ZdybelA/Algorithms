package com.azdybel.algs.Algs;

import com.azdybel.algs.Helpers.Newton;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBackpackProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BackpackProblem implements IBackpackProblem, IAlgorithmRunner {

    private List<Item> items = new ArrayList<>();
    private int capacity;
    private int numberOfItems;
    private int maxValue;
    private String genome;
    private String bestGenome;

    @Override
    public void setup() {
        Scanner in = new Scanner(System.in);
        capacity = in.nextInt();
        numberOfItems = in.nextInt();
        genome = "";
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
//        items.sort(Item::compareTo);
        int occupiedCapacity = 0;
        for (int i = 0; i < items.size() && occupiedCapacity <= capacity; i++) {
            if (items.get(0).getWeight() < capacity - occupiedCapacity) {
                genome += "1";
                occupiedCapacity += items.get(i).getWeight();
            }
        }
        //dopisz pozostale 0ra
        for (int j = 0; j < genome.length(); j++) {
            if (genome.charAt(j) == '1') {
                System.out.print("1 ");
                maxValue += items.get(j).getValue();
            } else System.out.print("0 ");
        }
        System.out.println();
        System.out.println(getValueOfGenome(genome));
        for(int k = 0; k<Math.pow(2, items.size());k++ ){
            //0000
            //0001
            //0010
            //0011
            String tempGenome = Integer.toBinaryString(k);
            int tgL = tempGenome.length();
            for(int t=0; t<items.size() - tgL; t++) {
                tempGenome = "0"+tempGenome;
            }
            if(maxValue < getValueOfGenome(tempGenome)) {
                bestGenome = tempGenome;
                maxValue = getValueOfGenome(bestGenome);
            }
        }
        System.out.println(bestGenome);
        System.out.println(maxValue);
    }

    @Override
    public int getMaxValue() {
        return maxValue;
    }

    @Override
    public int getValueOfGenome(String genome) {
        int result = 0;
        int capacityTaken = 0;
        for(int i=0; i<genome.length(); i++){
            if(genome.charAt(i) == '1'){
                capacityTaken+= items.get(i).getWeight();
                result+= items.get(i).getValue();
            }
        }
        if(capacityTaken > capacity) return 0;
        return result;
    }
}

//7 20 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4
