package com.example.ilham;

public class Avarage {
    public static void main(String[] args) {
        System.out.println(average(2));
        System.out.println(average(1,2,3));
        System.out.println(average(1,2,3,4));
    }

    public static double average(double x){
        return x;
    }

    public static double average(double x, double y, double z){
        return (x+y+z)/3;
    }

    public static double average(double x,double y ,double z, double m){
        return (x+y+z+m)/4;
    }
}

