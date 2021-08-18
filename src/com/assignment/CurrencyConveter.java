package com.assignment;

import java.util.Scanner;

public class CurrencyConveter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = 74.30f;
        System.out.print("Enter amount in ₹ :- ");
        float rupee = in.nextFloat();
        float dollar = rupee / base ;
        System.out.println("$" + String.format("%.2f",dollar));
    }
}
