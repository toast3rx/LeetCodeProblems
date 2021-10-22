/*
451. Sort Characters By Frequency
Given a string s, sort it in decreasing order based on the frequency of the characters.
The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.
 */
package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character>[] list = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (list[frequency] == null)
                list[frequency] = new ArrayList<>();
            list[frequency].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int pos = s.length() - 1; pos >= 0; pos--) {
            if (list[pos] != null) {
                for (char c : list[pos]) {
                    for (int i = 0; i < pos; i++)
                        sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
