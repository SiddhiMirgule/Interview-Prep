package com.siddhi;

import java.util.*;
public class TwoSum {

        public static int[] Sum(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) { // j starts from i+1
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j}; // i != j guaranteed
                    }
                }
            }

            return new int[]{-1, -1};
        }

    public static void main(String[] args) {
        int [] num = {5,5};
        System.out.println(Sum(num,10));
    }
    }




