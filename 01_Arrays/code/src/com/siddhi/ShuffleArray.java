//https://leetcode.com/problems/shuffle-the-array/description/

package com.siddhi;
import java.util.*;
public class ShuffleArray {

    public static int[] ShufArr(int[] nums, int n){
        int[] arr = new int[2*n];
        int j = 0;
        for(int i = 0; i < n; i++){
            arr[j++] = nums[i];
            arr[j++] = nums[i+n];
        }
        return arr;
    }
    public static void main(String[] args) {
            int nums[] ={2,5,1,3,4,7};
            int n = 3;
             System.out.println(Arrays.toString(ShufArr(nums,n)));
    }
}
