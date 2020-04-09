package com.example.ilham;


public class NumberSquareCube {

    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        for (int i = 0; i <= 10; i++) {
            int square = (int) Math.pow(i, 2);
            int cube = (int) Math.pow(i, 3);
            System.out.println(i + "\t\t" + square + "\t\t" + cube);
        }
    }
}
