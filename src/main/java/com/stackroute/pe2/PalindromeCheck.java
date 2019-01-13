/*Write a Java method to Reverse the given input & Check if it is a Palindrome.*/
package com.stackroute.pe2;

public class PalindromeCheck {
    /*method to find reverse number*/
    public int reverse(int num) {
        int sum = 0;
        for (; num > 0; num /= 10) {
            int d = num % 10;
            sum = sum * 10 + d;
        }
        return sum;
    }
    /*method to find palindrome*/
    public boolean palindrome(int num) {
        int rev = reverse(num);
        if (num == rev)
            return true;
        else
            return false;
    }
}
