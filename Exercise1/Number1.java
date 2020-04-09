package com.example.ilham;

public class Number1 {
    public static void main(String[] args) {
        String college = new String("College of Arts and Sciences");
        String town = " UUM Sintok";

        int stringLength;
        String change1,change2,change3;

        stringLength = college.length();

        System.out.println(college+ " contains "+ stringLength + " characters.");

        change1 = college.toUpperCase();
        System.out.println("The string is all in upper case: " + change1);

        change2 = change1.replaceAll("O","*");
        System.out.println("All capital O's are replaced with the asterisk character : "+change2);

        change3 = change2.concat(town);
        System.out.println("The final string is "+change3);

    }
}
