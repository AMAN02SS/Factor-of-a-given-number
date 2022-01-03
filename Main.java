package com.AmanSinghSikarwar;

public class Main {

    public static void main(String[] args) {
        getFactor(2);
        System.out.println("============================");
        getFactor(50);
        System.out.println("============================");
        getFactor(22);
        System.out.println("============================");
        getFactor(32);
        System.out.println("============================");

    }

    public static void getFactor(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");;
        }
        int factor = 1;
        int count = 0;

        for (int i = 1; i <= number; i++) {
             if(number%i==0) {
                 System.out.println(i);

             }
        }
    }
}
