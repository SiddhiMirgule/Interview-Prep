package com.siddhi;
import java.util.*;
public class SmallerThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

       SmallerThanCurrent  solution = new SmallerThanCurrent();
        int[] result = solution.smallerNumbersThanCurrent(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
