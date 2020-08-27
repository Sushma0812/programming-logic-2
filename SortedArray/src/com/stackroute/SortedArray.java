package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method to sort the array elements
 */
public class SortedArray {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int size;
        int i;
        int j;
        int temp;
        System.out.println("Enter size of the array ");
        size = reader.nextInt();
        int[] myarray = new int[size];
        System.out.println("Enter array elements");
        for (i = 0; i < size; i++) {
            myarray[i] = reader.nextInt();
        }
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (myarray[i] < myarray[j]) {
                    temp = myarray[i];
                    myarray[i] = myarray[j];
                    myarray[j] = temp;
                }
            }
        }
        for (i = 0; i < size - 1; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println(myarray[size - 1]);
    }
}
