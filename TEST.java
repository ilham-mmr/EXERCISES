package com.example.ilham;

import java.util.Scanner;

public class Main {
    static int intDefault;
    static byte byteDefault;
    static short shortDefault;
    static long longDefault;
    static float floatDefault;
    static double doubleDefault;
    static char charDefault;
    static boolean booleanDefault;

    public static void main(String[] args) {
        //QUESTION1.1
        displayAnyMessage();
        System.out.println("********************************");
        //QUESTION1.2
        defaultPrimitive();
        System.out.println("********************************");
        //QUESTION1.3
        String myName = "Kim";
        String hisName = "Kim";
        String herName = "Intan";
        System.out.println(equalOrnot(myName,hisName));
        System.out.println(equalOrnot(hisName,herName));

    }
    public static void displayAnyMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message:");
        String input = scanner.nextLine();
        System.out.println("Your message : "+input);
    }

    public static void defaultPrimitive(){
        System.out.println("int : "+intDefault);
        System.out.println("byte: "+byteDefault);
        System.out.println("short: "+shortDefault);
        System.out.println("long :"+longDefault);
        System.out.println("float:"+floatDefault);
        System.out.println("double:"+doubleDefault);
        System.out.println("char:"+charDefault);
        System.out.println("boolean :"+booleanDefault);
    }

    public static boolean equalOrnot(String text1,String text2){
        if(text1.equals(text2)){
            return true;
        }else {
            return false;
        }
    }
}
