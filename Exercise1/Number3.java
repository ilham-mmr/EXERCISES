package com.example.ilham;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter day/month/year");
        String input =  scanner.nextLine();
        String convertedFormat = input.replace('/','.');
        System.out.println(convertedFormat);
    }
}
