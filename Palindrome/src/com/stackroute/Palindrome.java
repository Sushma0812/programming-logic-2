package com.stackroute;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int remainder;
        int sum=0;
        int temp;
        int number;
        int sum1=0;
        System.out.println("Enter a number");
        number = reader.nextInt();

        temp=number;
        while(number>0)
        {
            remainder = number % 10;
            if(remainder % 2 ==0){
                sum1=sum1+remainder;
            }
            sum = (sum*10) + remainder;
            number = number / 10;
        }
        if ((temp == sum) && (sum1 > 25))
        {
            System.out.println(temp+" is a palindrome number and sum of even numbers is greater than 25");
        }
        else if ((temp == sum) && (sum1 < 25))
        {
            System.out.println(temp+" is a palindrome number and sum of even numbers is less than 25");
        }
        else
        {
            System.out.println(temp +" is not a palindrome");
        }

    }
}
