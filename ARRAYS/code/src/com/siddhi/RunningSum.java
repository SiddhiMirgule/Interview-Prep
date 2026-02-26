//https://leetcode.com/problems/running-sum-of-1d-array/description/
package com.siddhi;
import java.util.*;
class RunningSum{
    public int[] runningsum(int [] nums ){
        int n = nums.length;
        int [] arr = new int [n];
        arr[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            arr[i] = nums[i]+ arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int [] nums = new int [6];
        for (int i = 0 ; i < 6 ; i++){
            nums[i] = sc.nextInt();
        }
    }
}