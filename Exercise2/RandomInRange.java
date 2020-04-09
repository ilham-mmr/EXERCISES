package com.example.ilham;

import java.util.Scanner;

public class RandomInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the first number:");
        int input1 = scanner.nextInt();
        System.out.print("Select the second number:");
        int input2 = scanner.nextInt();

        System.out.println("the range is " + input1 + " to " + input2);
        int x = 1;
        System.out.println();

        while (x != 0) {
            int random = randomInRange(input1, input2);
            System.out.println("random number: " + random);
            System.out.println("enter 0 to exit!");
            x = scanner.nextInt();
        }
    }

    public static int randomInRange(int x, int y) {
        if (x > y) {
            return 0;
        }
        int lowerBound = x;
        int upperBound = y - lowerBound + 1;


        return (int) ((Math.random() * upperBound) + lowerBound);
    }
}
