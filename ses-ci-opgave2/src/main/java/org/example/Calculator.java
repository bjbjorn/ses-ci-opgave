package org.example;

public class Calculator {
    private int z;

    public Calculator(int x, int y) {
        calculate(x,y);
    }

    private void calculate(int x, int y) {
        z = x+y;
        System.out.println(z);
    }

    public int getZ() {
        return z;
    }

}
