package com.stackroute;
import java.util.Scanner;
public class  NumberOfNines {
    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        int size;
        System.out.println("Enter size of the array");
        size = reader.nextInt();
        int[] array = new int[size];
        int count = 0;
        int i;
        System.out.println("Enter array elements");
        for(i=0; i<size; i++)
        {
        array[i] = reader.nextInt();
        }
        for(i=0; i<size; i++)
        {
            if(array[i] == 9)
            {
                count++;
            }
        }
        System.out.println("Number of 9's "+count);

        }
        }
