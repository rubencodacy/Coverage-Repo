package com.codacy.utils;

public class Math2 {

    private int magicNumber;

    public Math2(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    /**
     * Adds 2 numbers, unless there is a magic number on the second argument
     */
    public int magicAdd(int x, int y) {
        if (y == magicNumber) {
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            return y - x;
        } else {
            System.out.println("hey");
            System.out.println("hey");
            return x + y;
        }
    }
}
