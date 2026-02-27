//check if array is sorted or not
package com.siddhi;
import java.util.*;
public class ArraySorted {

    public static boolean Sorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;   // Not sorted
            }
        }
        return true;  // Sorted
    }


    public static void main(String[] args) {
        int[] nums={1,3,8,4,2};
        if(Sorted(nums)){
            System.out.println("Array sorted");
        }
        else{
            System.out.println("Array not sorted");
        }
    }
}
