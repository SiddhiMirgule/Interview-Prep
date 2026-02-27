//https://leetcode.com/problems/running-sum-of-1d-array/description/
package com.siddhi;
import java.util.*;
class RunningSum{
    public static int[] runningsum(int[] nums){
        int prefix[] = new int[nums.length];
        prefix[0] =nums[0];
        for(int i =1 ; i < nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int nums[]={1,2,3,4};
        System.out.println(Arrays.toString(runningsum(nums)));
    }
}