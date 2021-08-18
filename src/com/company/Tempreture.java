package com.company;

import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter tempreture in C: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Tempreture in F is: " + tempF);
    }
}
