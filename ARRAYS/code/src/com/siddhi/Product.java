//https://neetcode.io/problems/products-of-array-discluding-self/question?list=blind75
package com.siddhi;

public class Product {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];

            // Step 1: calculate left product
            result[0] = 1;
            for (int i = 1; i < n; i++) {
                result[i] = result[i - 1] * nums[i - 1];
            }

            // Step 2: multiply with right product
            int R = 1; // product of elements to the right
            for (int i = n - 1; i >= 0; i--) {
                result[i] *= R;
                R *= nums[i];
            }

            return result;
        }
    }
}