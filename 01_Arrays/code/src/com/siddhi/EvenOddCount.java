//count the number of even and odd
package com.siddhi;
import java.util.*;
public class EvenOddCount {
    public static void  count(int[] num){
        int countEven = 0 ;
        int countOdd = 0;
        for(int i = 0 ;i < num.length ;i++){

            if(num[i] % 2 ==0 ) {
                countEven++;
            }
            else {
                countOdd++;
            }
        }
        System.out.println("count of even numbers in the given array is : "+countEven);
        System.out.println("count of odd numbers in the given array is "+countOdd);
    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,5,2,6,8,9,10};
        count(nums);
    }
}
