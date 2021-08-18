package com.assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 number: ");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        System.out.print("Enter operation: ");
        char operation = in.next().charAt(0);
        float total = 0;

        if (operation == '+') {
            total = num1 + num2;
        }else if (operation == '-'){
            total = num1 - num2;
        }else if (operation == '*'){
            total = num1 * num2;
        }else if (operation == '/'){
            total = num1 / num2;
        }else {
            System.out.println("Operation was not valid!");
        }

        System.out.println("Calculation is: " + total);

        if (num1 > num2){
            System.out.println(num1 + " is great than " + num2);
        }else if (num1 < num2){
            System.out.println(num2 + " is great than " + num1);
        }else {
            System.out.println("Both number is equal!");
        }

    }
}
