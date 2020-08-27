package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method to  calculate longest sequence of zeroes in the given number
 */
public class Zero {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = reader.nextInt();
        int maximum = -1;
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 0) {
                count++;
                number >>= 1;
                maximum = Math.max(maximum, count);
            } else {
                maximum = Math.max(maximum, count);
                count = 0;
                number >>= 1;
            }
        }
        System.out.println("Number of zeroes " + maximum);

    }
}
