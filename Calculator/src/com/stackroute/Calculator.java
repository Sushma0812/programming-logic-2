package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method used to perform arithmetic operations
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice;
        int numberOne;
        int numberTwo;
        String ch = "yes";
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Division");

        System.out.println("Enter a choice to perform operation");
        choice = reader.nextInt();
        do {
            System.out.println("Enter first number");
            numberOne = reader.nextInt();
            System.out.println("Enter second number");
            numberTwo = reader.nextInt();
            switch (choice) {
                case 1:
                    int sum = numberOne + numberTwo;
                    System.out.println(numberOne + "+" + numberTwo + "= " + sum);
                    break;
                case 2:
                    int subtract = numberOne - numberTwo;
                    System.out.println(numberOne + "-" + numberTwo + "=" + subtract);
                    break;
                case 3:
                    int multiply = numberOne * numberTwo;
                    System.out.println(numberOne + "*" + numberTwo + "=" + multiply);
                    break;
                case 4:
                    int divide = numberOne / numberTwo;
                    System.out.println(numberOne + "/" + numberTwo + "=" + divide);
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
            System.out.println("Do you want to continue (y/n)");
            ch = reader.next();
        } while (ch == "y" || ch == "Y");

    }
}
