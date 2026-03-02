//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//linearly scanning :“even number of digits” problem using a linear search style approach.
//Here, we are not searching for a target value.
//Instead, we are linearly scanning the array and checking each element — which is exactly what linear search does.
package com.siddhi;

public class FindNum{

    public static int EvenDig(int [] nums){
        int count =0;
        for(int num:nums){
            int digit = 0 ;
            while( num > 0){
                num =num/10;
                digit++;
            }
            if(digit % 2 == 0 ){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] ={12, 345, 2,6,7896};
        System.out.println(EvenDig(arr));
    }
}
