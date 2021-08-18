package com.assignment;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        for (int i = 1; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                int div = num / i;
                System.out.print(i + " " + div + " " );
            }
        }
    }
}
