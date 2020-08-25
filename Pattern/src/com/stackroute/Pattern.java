/*
 *Package name is com.stackroute
 * Scanner is imported from java.util
 * Class name is Pattern
 */
package com.stackroute;
import java.util.Scanner;
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