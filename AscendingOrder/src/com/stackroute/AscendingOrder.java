package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method to find ascending order of four numbers
 */
public class AscendingOrder {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        if (a < b && a < c && a < d && b < c && b < d && c < d) {                  //checks the condition and sort the elements
            System.out.println(a + " " + b + " " + c + " " + d);
        }
        if (a < b && a < c && a < d && c < b && c < d && b < d) {
            System.out.println(a + " " + c + " " + b + " " + d);                //checks the condition and sort the elements
        }
        if (a < b && a < c && a < d && d < c && d < b && c < b) {
            System.out.println(a + " " + d + " " + c + " " + b);                //checks the condition and sort the elements
        }
        if (a < b && a < c && a < d && b < c && b < d && d < c) {
            System.out.println(a + " " + b + " " + d + " " + c);               //checks the condition and sort the elements
        }
        if (a < b && a < c && a < d && b < c && d < b && d < c) {
            System.out.println(a + " " + d + " " + b + " " + c);              //checks the condition and sort the elements
        }
        if (a < b && a < c && a < d && c < d && c < b && d < b) {
            System.out.println(a + " " + c + " " + d + " " + b);             //checks the condition and sort the elements
        }
        if (b < c && b < d && b < a && c < d && c < a && c < a) {
            System.out.println(b + " " + c + " " + d + " " + a);            //checks the condition and sort the elements
        }
        if (b < a && a < c && a < d && b < c && b < d && d < c) {
            System.out.println(b + " " + a + " " + d + " " + c);             //checks the condition and sort the elements
        }
        if (d < a && d < c && c < a && b < c && b < d && b < a) {
            System.out.println(b + " " + d + " " + c + " " + a);             //checks the condition and sort the elements
        }
        if (d < a && d < c && a < c && b < c && b < a && b < d) {
            System.out.println(b + " " + d + " " + a + " " + c);            //checks the condition and sort the elements
        }
        if (c < d && a < c && a < d && b < c && b < a && b < d) {
            System.out.println(b + " " + a + " " + c + " " + d);            //checks the condition and sort the elements
        }
        if (c < d && c < d && a < d && b < c && b < a && b < d) {
            System.out.println(b + " " + c + " " + a + " " + d);            //checks the condition and sort the elements
        }
        if (c < a && c < b && c < d && d < a && d < b && a < b) {
            System.out.println(c + " " + d + " " + a + " " + b);           //checks the condition and sort the elements
        }
        if (c < a && c < b && c < d && a < d && a < b && d < b) {
            System.out.println(c + " " + a + " " + d + " " + b);            //checks the condition and sort the elements
        }
        if (c < a && c < b && c < d && b < a && b < d && a < d) {
            System.out.println(c + " " + b + " " + a + " " + d);            //checks the condition and sort the elements
        }
        if (c < a && c < b && c < d && b < d && b < a && d < a) {
            System.out.println(c + " " + b + " " + d + " " + a);            //checks the condition and sort the elements
        }
        if (c < a && c < b && c < d && a < d && a < b && b < d) {
            System.out.println(c + " " + a + " " + b + " " + d);            //checks the condition and sort the elements
        }
        if (c < a && c < b && c < d && d < b && d < a && b < a) {
            System.out.println(c + " " + d + " " + d + " " + a);            //checks the condition and sort the elements
        }
        if (d < a && d < b && d < c && b < c && b < a && c < a) {

            System.out.println(d + " " + b + " " + c + " " + a);           //checks the condition and sort the elements
        }
        if (d < a && d < b && d < c && b < c && a < b && a < c) {

            System.out.println(d + " " + a + " " + b+ " " + c);           //checks the condition and sort the elements
        }
        if (d < a && d < b && d < c && b < a && b < c && a < c) {
            System.out.println(d + " " + b + " " + a + " " + c);           //checks the condition and sort the elements
        }
        if (d < a && d < b && d < c && c < a && c < b && a < b) {
            System.out.println(d + " " + c + " " + a + " " + b);           //checks the condition and sort the elements
        }
        if (d < a && d < b && d < c && c < b && c < a && b < a) {
            System.out.println(d + " " + c + " " + b + " " + a);            //checks the condition and sort the elements
        }
        if (d < a && d < b && d < c && a < b && a < c && c < b) {
            System.out.println(d + " " + a + " " + c + " " + b);            //checks the condition and sort the elements
        }


    }
}
