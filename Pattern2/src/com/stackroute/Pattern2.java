package com.stackroute;
import java.util.Scanner;
public class Pattern2{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        int j;
        int size;
        System.out.println("Enter size");
        size = reader.nextInt();
        for(i=1; i<=size; i++)
        {
            for(j=i; j>=1; j--)
            {
                System.out.print(i);
            }

        }

    }
}
