/*Write a program, which reads number of students and n grades as input (of int between 0 and 100, inclusive) and
 displays the average, minimum and maximum.Your program shall check for valid input. You should keep all the
 grades in an int[] and use a method for each of the computations.*/
package com.stackroute.pe2;

public class StudentsGrade {
    /* Method to find maximum in arr[] */
    public int maxValue(int num, int[] numbers) {
        int maxValues = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValues) {
                maxValues = numbers[i];
            }
        }
        return maxValues;
    }
        // Method to find minimum in arr[] //
        public int minValue(int num2,int[] numbers){
            int minValues = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minValues) {
                    minValues = numbers[i];
                }
            }
            return minValues;
        }
        // Method to find average in arr[] //
        public double getAvgvalue(double num1,double[] numbers){
            double sum = 0;
            if (num1 != 0) {
                for (int i = 0; i < num1; i++) {
                    sum = sum + numbers[i];
                }
            }double number = (sum/num1);
            return (int) number;
        }
    }