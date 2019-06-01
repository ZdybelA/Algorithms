package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.BackpackProblem;

public class Main {
    public static void main(String[] args) {
        BackpackProblem backpackProblem = new BackpackProblem();
        backpackProblem.setup();
        backpackProblem.solve();
        System.out.println(backpackProblem.getMaxValue());

    }

}

//7 10 1 1 2 2 1 1 2 2 1 1 2 2 1 3 3 1 5 5 3 4
