
package com.example.ilham;

import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite color:");
        String color = scanner.nextLine();
        System.out.print("Enter your faour favorite food:");
        String food = scanner.nextLine();
        System.out.print("Enter your favorite animal:");
        String animal = scanner.nextLine();
        System.out.print("Enter the first name of your friend:");
        String name = scanner.nextLine();

        System.out.printf("I had a dream that %s ate a %s %s and said it tasted like %s!",name,color,animal,food);

    }
}
