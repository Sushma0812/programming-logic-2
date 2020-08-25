/*
 *The pacage name is com.stackroute
 * Scanner is imported from java.util
 * Class name is StrongNumber
 */
package com.stackroute;
import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args)
    {
	   Scanner reader = new Scanner(System.in);
	   System.out.println("Enter a number:");
	   int number = reader.nextInt();
	   int factorial;
	   int sum=0;
	   int temp;
	   int remainder;
	   int i;
	   temp = number;
	   while(number > 0)                                //performs logic of Strong number
	   {
	       factorial=1;
	       remainder = number % 10;
	       for(i=remainder; i>=1; i--)
	       	factorial = factorial * i;
	        sum = sum + factorial;
	        number = number / 10;

       }
	   if(sum == temp)                                        //checks the given condition
       {
           System.out.println("Given number is a strong number");
       }
	   else
       {
           System.out.println("Given number is not a strong number");
       }

    }
}
