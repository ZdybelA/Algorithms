package com.azdybel.algs.Main;

import com.azdybel.algs.Helpers.Newton;
import com.azdybel.algs.Helpers.TimeMeasurementHelper;

public class Main {
    public static void main(String[] args) {
        Newton n = new Newton();
//        System.out.println(n.factorial(4000));


//        System.out.println(n.nPoK(12, 7));
        n.printNewtonTriangle(13);

    }

}
