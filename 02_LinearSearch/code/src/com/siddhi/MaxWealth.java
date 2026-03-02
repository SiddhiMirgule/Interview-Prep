//Richest customer wealth
//// https://leetcode.com/problems/richest-customer-wealth/

//package com.siddhi;
//import java.util.*;
//public class MaxWealth {
//
//    public static int Max(int[][] nums){
//        int max = 0;
//        for(int i = 0 ; i <nums.length ;i++){
//            int current = 0 ;
//            for(int j = 0 ; j < nums[i].length ;j++){
//                current +=nums[i][j];
//            }
//            if(current > max){
//                max= current ;
//            }
//        }
//      return max ;
//    }
//
//    public static void main(String[] args) {
//        int[][] arr = {{1,5},{7,3},{3,5}};
//        System.out.println(Max(arr));
//    }
//}
package com.siddhi;
//import java.util.*;
public class MaxWealth{
public static int maximumWealth(int[][] accounts) {
    int maxWealth = 0;

    // Loop through each customer
    for (int[] customer : accounts) {
        int currentWealth = 0;

        // Sum all bank values for this customer
        for (int money : customer) {
            currentWealth += money;
        }

        // Update maxWealth if this customer's total is greater
        if (currentWealth > maxWealth) {
            maxWealth = currentWealth;
        }
    }
    return maxWealth;
}

    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }
}