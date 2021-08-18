package com.assignment;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int bigNum = 0;
        System.out.print("Enter number for addition or 0 to exit: ");
        int num = in.nextInt();

        while (num != 0){
            if(bigNum < num){
                bigNum = num;
            }
            counter += num;
            System.out.print("Enter number for addition or 0 to exit: ");
            num = in.nextInt();
        }

        System.out.println("Sum of all number is: " + counter);
        System.out.println("Biggest number: " + bigNum);
    }
}
