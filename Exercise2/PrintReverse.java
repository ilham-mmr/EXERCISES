package com.example.ilham;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        String input = scanner.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }


    }
}
