package com.example.ilham;

import java.util.Scanner;

public class CountA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something:");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                count++;
            }
        }
        if(!(count>0)){
            System.out.println("A does not appear");
        }else {
            System.out.println("A appears " + count + " times");
        }

    }
}
