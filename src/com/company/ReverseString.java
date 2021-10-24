/*
344. Reverse String
Write a function that reverses a string.
The input string is given as an array of characters s.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */

package com.company;

public class ReverseString {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        while(low <= high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low++;
            high--;
        }
    }
}
