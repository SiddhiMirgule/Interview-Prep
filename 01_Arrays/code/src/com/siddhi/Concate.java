//https://neetcode.io/problems/concatenation-of-array/question
package com.siddhi;
import java.util.*;
public class Concate{
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int []arr = new int [2*n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int[] nums = new int[4];
        for(int i = 0 ; i < 4 ; i ++){
            nums[i] =sc.nextInt();
        }
    }
}