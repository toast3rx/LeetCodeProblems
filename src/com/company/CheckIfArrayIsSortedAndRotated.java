/**
 * 1752. Check if Array Is Sorted and Rotated
 * Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
 *
 * There may be duplicates in the original array.
 *
 * Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
 *
 * Input: nums = [3,4,5,1,2]
 * Output: true
 * Explanation: [1,2,3,4,5] is the original sorted array.
 * You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
 */

package com.company;

public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int k = 0;
        for(int  i = 0 ; i < nums.length; i++)
            if(nums[i] > nums[(i + 1) % nums.length])
                k++;
        return k <= 1;
    }
}
