/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */

package com.company;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastZeroFoundAt = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[lastZeroFoundAt++] = nums[i];
            }
        }

        for(int i = lastZeroFoundAt; i < nums.length; i ++) {
            nums[i] = 0;
        }
    }
}
