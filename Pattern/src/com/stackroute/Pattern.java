package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method to print the following patttern
 *
 **
 ***
 */
public class Pattern {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        int j;
        int row;
        row = reader.nextInt();                         //reads input from user
        for (i = 0; i < row; i++) {                     //performs the logic tp print *
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}