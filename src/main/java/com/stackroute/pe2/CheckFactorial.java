/*Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit signed integer). Your output shall look like:
Int Factorials:
The factorial of 1 is 1 */
package com.stackroute.pe2;

public class CheckFactorial {
    public long factorial(long num) {
        if (num == 0)
            return 1;
            long fact = 1;
            //loop to calculate factorial of a number//
            for (long i = 1; i <= num; i++) {
                fact = fact * i;
            }
            return fact;
    }
}
