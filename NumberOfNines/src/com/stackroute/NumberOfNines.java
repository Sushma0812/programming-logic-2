package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method to count number of nines in the array elements
 */
public class NumberOfNines {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int size;
        System.out.println("Enter size of the array");
        size = reader.nextInt();
        int[] array = new int[size];
        int count = 0;
        int i;
        System.out.println("Enter array elements");
        for (i = 0; i < size; i++) {
            array[i] = reader.nextInt();
        }
        for (i = 0; i < size; i++) {
            if (array[i] == 9) {               //checks the number equals to nine,if it is equal count will be updated
                count++;
            }
        }
        System.out.println("Number of 9's " + count);

    }
}
