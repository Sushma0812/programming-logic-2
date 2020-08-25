package com.stackroute;
import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = reader.nextInt();
        if((number % 2 == 0) && (number > 20) &&( number < 30))
        {
            System.out.println("Jerry");
        }
        if((number % 2 != 0) && (number > 20) && (number < 30))
        {
            System.out.println("Tom");
        }


    }
}
