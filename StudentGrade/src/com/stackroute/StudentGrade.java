package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method to find maximum,minimum  of student grades
 */
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
        int[] grades = new int[count];

        for (i = 0; i < count; i++) {
            System.out.println("Enter grades of each student");
            grades[i] = reader.nextInt();
            sum = sum + grades[i];                            //calculates sum of grades
        }
        System.out.println("Average =" + sum / count);
        maximum = grades[0];
        for (i = 0; i < count; i++) {
            if (maximum < grades[i]) {
                maximum = grades[i];                        //finds maximum grade
            }
        }
        System.out.println("Maximum =" + maximum);
        minimum = grades[0];
        for (i = 0; i < count; i++) {
            if (maximum < grades[i]) {
                maximum = grades[i];                     //finds minimum grade
            }
        }

        System.out.println("Minimum =" + minimum);


    }
}
