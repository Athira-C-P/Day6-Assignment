package com.bridgelabz.logical;
import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no =  S.nextInt();
        int temp = 0;
        for (int i = 2; i <= no-1; i++){
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println(no + " is prime number");
        }
        else {
            System.out.println(no + " is not prime number");
        }
    }
}
