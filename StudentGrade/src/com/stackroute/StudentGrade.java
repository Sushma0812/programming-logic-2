package com.stackroute;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count;
        int sum = 0;
        int maximum;
        int minimum;
        int i;
        int j;
        int temp;
        System.out.println("Enter number of students");
        count = reader.nextInt();
        int[] grades =new int[count];

        for(i=0; i<count; i++)
        {
            System.out.println("Enter grades of each student");
            grades[i] = reader.nextInt();
            sum = sum + grades[i];
        }
        System.out.println("Average =" + sum / count);
        maximum=grades[0];
        for (i = 0; i < count; i++)
        {
            if(maximum < grades[i])
            {
                maximum = grades[i];
            }
        }
        System.out.println("Maximum =" + maximum);
        minimum = grades[0];
        for (i = 0; i < count; i++)
        {
            if(maximum < grades[i])
            {
                maximum = grades[i];
            }
        }

        System.out.println("Minimum ="+ minimum);








    }
}
