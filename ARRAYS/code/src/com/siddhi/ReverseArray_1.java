//Reverse using (pattern) Two Pointer

package com.siddhi;

import java.util.*;

public class ReverseArray_1 {

    public static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        int [] nums= new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i]=sc.nextInt();
        }
        reverse(nums);

        System.out.println(Arrays.toString(nums));

    }
}
