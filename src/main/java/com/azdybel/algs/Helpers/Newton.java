package com.azdybel.algs.Helpers;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.INewton;

import java.math.BigInteger;

import static com.azdybel.algs.Statics.Constants.MAX_FACTORIAL_VALUE_INDEX;

public class Newton implements INewton, IAlgorithmRunner {
    long[] factorialValues = new long[MAX_FACTORIAL_VALUE_INDEX];

    @Override
    public long factorial(int i) {
        if (factorialValues[(int) i] > 0) return factorialValues[(int) i];
        factorialValues[(int) i] = factorial(i - 1) * i;
        return factorialValues[(int) i];
    }

    @Override
    public long nPoK(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        if (k == 1) return n;
        return nPoK(n - 1, k) + nPoK(n - 1, k - 1);
    }

    @Override
    public void printNewtonTriangle(int rows) {
        int m = 2 * rows - 1;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < ((m - (2 * i - 1)) / 2); j++) {
                System.out.print("    ");
            }
            for (int k = 0; k <= i; k++) {
                if(k==0) System.out.print(nPoK(i, k));
                else System.out.printf("%8d", nPoK(i, k));
            }
            System.out.println();
        }
    }

    @Override
    public void setup() {
        factorialValues[0] = 1;
        factorialValues[1] = 1;
    }

    @Override
    public void run() {
        factorial(4000);
    }

}
