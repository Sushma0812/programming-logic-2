package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method to check whether the given number is palindrome or not
 * And calculates sum of even number and checks whether sum is greater than 25 or not
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int remainder;
        int sum = 0;
        int temp;
        int number;
        int sumOne = 0;
        System.out.println("Enter a number");
        number = reader.nextInt();
        temp = number;
        while (number > 0) {
            remainder = number % 10;              //calculates remainder of a given number
            if (remainder % 2 == 0) {
                sumOne = sumOne + remainder;
            }
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if ((temp == sum) && (sumOne > 25)) {
            System.out.println(temp + " is a palindrome number and sum of even numbers is greater than 25");
        } else if ((temp == sum) && (sumOne < 25)) {
            System.out.println(temp + " is a palindrome number and sum of even numbers is less than 25");
        } else {
            System.out.println(temp + " is not a palindrome");
        }

    }
}
