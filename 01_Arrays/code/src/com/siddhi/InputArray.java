//Input array element and output array element :

package com.siddhi;
import java.util.*;
public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nums[]=new int[5];
        System.out.println("Enter Elements: ");
        for(int i = 0 ; i < nums.length ; i ++){
            nums[i]=sc.nextInt();
        }
        System.out.print(" [ ");
        for(int i = 0 ; i < nums.length;i++)
        {
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        System.out.println("]");
    }
}
