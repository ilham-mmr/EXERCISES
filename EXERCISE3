package com.example.ilham;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //QUESTION1
        //By new KeyWord
        String myName = new String("Sabda PS");
        //By String Literal
        String myLastName = "Rachmat";

        //QUESTION2
        String phr = new String("Big,blue sky");
        System.out.println(phr.substring(phr.indexOf(","), 7));
        //The output is ,blu

        //QUESTION3
        Random rd = new Random();
        System.out.println(rd.nextInt(41) + 10);
        //It will generate a random number 10 to 50 inclusive

        //QUESTION4
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        System.out.println("Num1 = " + num1 + " Num2 = " + num2);
        System.out.println("The largest value between num1 and num2 = " + Math.max(num1, num2));

        //QUESTION5
        String test = "abc";
        test = test + test;
        System.out.println(test);
        //The output is abcabc

        Random hmm = new Random();
        double d = Math.round(2.5 + hmm.nextInt(1));
        System.out.println("The value is " + d);

        System.out.println("*******************************");

        //QUESTION6
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x value:");
        int x = scanner.nextInt();
        System.out.print("Enter y value:");
        int y = scanner.nextInt();
        System.out.println(x+" to the power of " +y+" is "+(int) (Math.pow(x, y)));

        //QUESTION7
        String text1 = "School of Computing";
        String text2 = "College of Arts and Sciences";
        String text3 = "UUM Sintok";

        int totalLength = (text1+text2+text3).length();
        System.out.println(text2.substring(0,text2.length()-8)+text1.substring(text1.indexOf('C'),text1.length()));
        System.out.println("Total length is "+totalLength);


    }
}
