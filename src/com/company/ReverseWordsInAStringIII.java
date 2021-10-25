/*
557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */

package com.company;

import java.util.ArrayList;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = split(s);
        for(String word: words) {
            result.append(reverse(word) + " ");
        }

        return result.toString().trim();
    }

    public String[] split(String s) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                words.add(word.toString());
                word = new StringBuilder();
            }
            else {
                word.append(s.charAt(i));
            }
        }
        words.add(word.toString());
        return words.toArray(new String[words.size()]);
    }

    public  String reverse(String s) {
        char[] word = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;

        while(low <= high) {
            char temp = word[low];
            word[low] = word[high];
            word[high] = temp;

            low++;
            high--;
        }

        return String.valueOf(word);
    }
}
