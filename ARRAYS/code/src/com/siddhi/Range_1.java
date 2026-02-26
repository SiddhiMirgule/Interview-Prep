package com.siddhi;
import java.util.*;

    public class Range_1 {

        // XOR Method
        public static int findMissingXOR(int[] nums) {

            int n = nums.length;
            int xor = 0;

            // XOR all numbers from 0 to n
            for (int i = 0; i <= n; i++) {
                xor ^= i;
            }

            // XOR all elements in array
            for (int num : nums) {
                xor ^= num;
            }

            return xor;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();  // size of array

            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int missing = findMissingXOR(nums);

            System.out.println("Missing Number: " + missing);
        }
    }
