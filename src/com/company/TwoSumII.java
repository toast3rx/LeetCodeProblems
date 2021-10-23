/*
167. Two Sum II - Input array is sorted
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= first < second <= numbers.length.
Return the indices of the two numbers, index1 and index2, as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Example:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */


package com.company;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while(numbers[low] + numbers[high] != target) {
            if(numbers[low] + numbers[high] < target) {
                low ++;
            }
            else {
                high --;
            }
        }
        return new int[]{low + 1, high + 1};
    }
}
