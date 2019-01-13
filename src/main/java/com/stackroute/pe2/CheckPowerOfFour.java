/*Write a Java method to check if a given number is power of 4*/
package com.stackroute.pe2;

public class CheckPowerOfFour {
    /*method to find power of the number 4*/
    public boolean checkPowerOfFour(int num) {
        if (num == 0)
            return false;
        /*check number is power of 4*/
        while (num != 1) {
            if (num % 4 != 0)
                return false;
            num = num / 4;
        }
        return true;
    }
}
