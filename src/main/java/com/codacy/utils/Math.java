package com.codacy.utils;

public class Math {

    private int magicNumber;

    public Math(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    /**
     * Adds 2 numbers, unless there is a magic number on the second argument
     */
    public int magicAdd(int x, int y) {
        what(1, 2);
        if (y == magicNumber) {
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            return y - x;
        } else {
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            return x + y;
        }
    }

    public void what(int x, int y) {
        System.out.println("hey");
        return ;
    }

}
