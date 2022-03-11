package com.bridgelabz.logical;
import static java.lang.System.currentTimeMillis;
import java.util.Scanner;
public class Stopwatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start the stopwatch from :");
        sc.nextDouble();
        double start;
        start = currentTimeMillis();    // converting the input starting time in milliseconds
        System.out.println("End the stopwatch to : ");
        sc.nextDouble();
        double stop;
        stop = currentTimeMillis(); //converting the input ending time in milliseconds
        double elapsedTime = (stop-start)/1000;
        System.out.println("Elapsed Time is " +elapsedTime+ " seconds");
        sc.close();
    }
}