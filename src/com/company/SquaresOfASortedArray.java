/*
977. Squares of a Sorted Array
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */
package com.company;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int index = nums.length - 1;
        int l = 0;
        int h = nums.length - 1;
        int[] result = new int[nums.length];

        while(l <= h) {
            int low = nums[l] * nums[l];
            int high = nums[h] * nums[h];

            if(low > high) {
                result[index] = low;
                l++;
            }
            else {
                result[index] = high;
                h--;
            }
            index--;
        }
        return result;
    }
}
