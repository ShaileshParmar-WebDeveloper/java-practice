package com.company;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner input = new Scanner(System.in);
        int rollNumber = input.nextInt();
        System.out.println("You have entered: " + rollNumber);
    }
}
