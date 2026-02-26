//https://neetcode.io/problems/anagram-groups/question
package com.siddhi;

import java.util.*;
public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {

        // Map: key = sorted string, value = list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        // Return all groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"act","pots","tops","cat","stop","hat"};

        List<List<String>> groups = groupAnagrams(strs);

        System.out.println(groups);
    }
}
