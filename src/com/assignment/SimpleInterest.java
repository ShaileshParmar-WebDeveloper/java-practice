package com.assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int principle = in.nextInt();
        System.out.print("Enter number of years: ");
        int year = in.nextInt();
        System.out.print("Enter interest rate: ");
        float interest = in.nextFloat();
        float simpleInt = principle * (1 + (interest / 100) * year);
        System.out.println("Simple interest: " + simpleInt);
    }
}
