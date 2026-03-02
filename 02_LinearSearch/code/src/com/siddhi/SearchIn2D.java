package com.siddhi;

import java.util.Arrays;

public class SearchIn2D {

    public static int search(int[][]num ,int target){
        for( int [] row :num){
            for(int nums:row){
                if(nums ==target){
                    return 0;
                }
            }
        }
        return -1;
    }
    public static int[] returnindex(int[][]num ,int target){
        for(int i = 0 ; i< num.length;i++){
            for (int j = 0 ; j < num[i].length;j++){

                if(num[i][j]== target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int [][]arr =  {
                        {23,42,35},
                        {18,12,3,9},
                        {78,99,34,56},
                        {18,12}
                        } ;
        int target = 56;
        int result = search(arr,target);
        if(result != -1){
            System.out.println("Element found in given array");
        }
        else{
            System.out.println("Element not found ");
        }

        int sol[] =returnindex(arr,target);
        String sol1= Arrays.toString(sol);

        if(result != -1) {
            System.out.println("Element found at index : " +sol1);
        }
    }
}
