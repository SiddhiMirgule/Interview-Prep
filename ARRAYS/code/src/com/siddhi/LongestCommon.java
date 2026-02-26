//https://neetcode.io/problems/longest-common-prefix/question?list=neetcode250
package com.siddhi;

public class LongestCommon {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Take first string as reference
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Compare prefix with current string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // reduce prefix
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
