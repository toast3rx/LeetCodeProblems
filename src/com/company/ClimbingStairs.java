/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 */
package com.company;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int firstStair = 1;
        int secondStair = 2;
        int temp;

        for(int i = 3; i <= n; i++) {
            temp = secondStair;
            secondStair = secondStair + firstStair;
            firstStair = temp;
        }

        return secondStair;
    }
}
