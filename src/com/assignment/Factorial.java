package com.assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num = in.nextInt();
        if(num >= 0) {
            int factorial = 1;
            while (num > 1) {
                factorial = factorial * num;
                num--;
            }
            System.out.println("Factorial is :- " + factorial);
        }
        else {
            System.out.println("Factorial of Negative Numbers will always undefine.!");
        }

    }
}
