//https://neetcode.io/problems/duplicate-integer/question?list=neetcode250
package com.siddhi;
import java.util.*;
public class hasDuplicate {

    public static boolean Duplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] num={1,2,3,4,6,7,3};
        System.out.println(Duplicate(num));
    }
}
