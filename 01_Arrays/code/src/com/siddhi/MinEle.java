//find minimum element
package com.siddhi;

public class MinEle {
    public static int Min(int[] nums){
        int min=nums[0];

        for (int i = 0 ; i < nums.length;i++) {
            if(nums[i]>min){
               nums[i]= min;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] nums ={3,7,2,9,5};
        System.out.println(Min(nums));
    }
}
