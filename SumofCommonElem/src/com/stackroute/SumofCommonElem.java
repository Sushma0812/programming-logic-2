package com.stackroute;
import java.util.Scanner;
/*
 *This class consists a method to find sum of common elements in two arrays
 */
public class SumofCommonElem {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int array1[] = new int[10];
        int array2[] = new int[10];
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = reader.nextInt();                         //reads input values from user

        }
        for (int j = 0; j < array2.length; j++) {
            array2[j] = reader.nextInt();                         //checks common elements from user
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    sum = sum + array1[i];                          //calculate sum of common elements
                }

            }
        }
        System.out.println("Sum is" + sum);

    }
}
