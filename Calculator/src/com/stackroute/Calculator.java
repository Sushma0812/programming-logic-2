package com.stackroute;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice;
        int number1;
        int number2;
        String ch = "yes";
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Division");

        System.out.println("Enter a choice to perform operation");
        choice = reader.nextInt();
        do
        {
            System.out.println("Enter first number");
            number1 = reader.nextInt();
            System.out.println("Enter second number");
            number2 = reader.nextInt();
            switch(choice)
            {
                case 1:
                    int sum = number1 + number2;
                    System.out.println(number1 + "+" + number2 + "= "+sum);
                    break;
                case 2:
                    int subtract = number1 - number2;
                    System.out.println(number1 + "-" + number2 + "="+subtract);
                    break;
                case 3:
                    int multiply = number1 * number2;
                    System.out.println(number1 + "*" + number2 + "="+multiply);
                    break;
                case 4:
                    int divide = number1 / number2;
                    System.out.println(number1 + "/" + number2 + "="+ divide);
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
            System.out.println("Do you want to continue (y/n)");
            ch = reader.next();
        }while(ch == "y" || ch == "Y");

    }
}
