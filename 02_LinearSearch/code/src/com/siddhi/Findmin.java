package com.siddhi;

public class Findmin {

    public static int MinEle(int[] arr){
         int min =arr[0];
        for(int i=0 ; i <arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min ;
    }
    public static void main(String[] args) {
        int num[] ={50,40,30,20,10,10,20,30,40,50};
        System.out.println(MinEle(num));
    }
}
