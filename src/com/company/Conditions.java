package com.company;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        if(number > 5){
            System.out.println("Your number is greater then 5..!!");
        }else if(number == 5) {
            System.out.println("Your number is 5..!!");
        } else {
            System.out.println("Your number is less then 5..!!");
        }

        while(number >= 0){
            System.out.print(number + " ");
            number--;
        }
    }
}
