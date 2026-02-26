// given array of size n containing numbers from 0 to n exactly 1 number is missing. find it
package com.siddhi;

import java.util.*;

public class MaxMinElement {

    public static void findMinMax(int[] nums) {

//        if (nums.length == 0) {
//            System.out.println("Array is empty");
//            return;
//        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Enter elements");

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        findMinMax(nums);
    }
}