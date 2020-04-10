package com.example.ilham;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of books:");
        int n = scanner.nextInt();

        Book[] books = new Book[n];

        scanner.nextLine();

        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter " + (i + 1) + ". book's title:");
            String bookTitle = scanner.nextLine();

            System.out.print("Enter " + (i + 1) + ". book's price:RM");
            double price = scanner.nextDouble();

            scanner.nextLine();

            books[i] = new Book(bookTitle, price);
        }

        Book highestBookPrice = books[0];


        for (int i = 0; i < books.length; i++) {
            if (books[i].price > highestBookPrice.price) {
                highestBookPrice = books[i];
            }


        }
        System.out.println("________________________________________________________________________________");
        System.out.println("The highest book price :" + highestBookPrice.title + " | RM " + highestBookPrice.price);
        System.out.println("________________________________________________________________________________");

        System.out.println("Book(s) which contain java keyword:");

        for (int i = 0; i < books.length; i++) {
            String bookTitle = books[i].title;

            if (bookTitle.toLowerCase().contains("java")) {
                System.out.println("\t#" + bookTitle);
            }
        }
    }

    private String title;      //book’s title
    private double price;      //book’s price

    public Book(String t, double p) {
        title = t;
        price = p;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

