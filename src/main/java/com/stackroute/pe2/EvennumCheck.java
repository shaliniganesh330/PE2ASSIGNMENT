/*Write a boolean method called isEven() in a class called EvenNumTest, which takes an int as
input and returns true if the input is even. The signature of the method is as follows: public
static boolean isEven(int number) */

package com.stackroute.pe2;
    /*method to check evennumber*/
public class EvennumCheck {
     public static boolean isEven(int number){
         /*checking whether the number is even*/
        if(number%2 == 0 )
            return true;
        else
            return false;
     }
}
