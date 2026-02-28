//my method

package com.siddhi;

import java.util.*;
import java.util.Arrays;
public class ReverseArray {

    public static int [] rev (int[] num){
        int res[] = new int[5];
        for(int i= 0 ; i < 5 ; i++){
             res[i] = num[5-1-i];
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] =new int[5];
        for(int i = 0 ; i < 5 ; i ++){
            nums[i]=sc.nextInt();
        }
        int result[] = new int[5];
        result=rev(nums);
        System.out.println(Arrays.toString(result));
    }

}
