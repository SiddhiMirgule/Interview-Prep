//find maximum element
package com.siddhi;
import java.util.*;
public class MaxEle {
    public static void main(String[] args) {
        int num[] ={3,7,2,2,9,5};
        int max = 0 ;
        for(int i = 0 ; i < num.length;i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
