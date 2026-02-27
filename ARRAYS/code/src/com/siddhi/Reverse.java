//reverse an array
package com.siddhi;
import java.util.*;
public class Reverse {
    public static void rev(int num[]){
         for (int i =num.length-1; i>=0;i--){
             System.out.println(num[i]);
         }
    }

    public static void main(String[] args) {
        int nums[]={1,3,8,4,2};
        rev(nums);
    }
}
