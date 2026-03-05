package com.siddhi;

import java.util.Scanner;

public class squareroot {

    public int mySqrt(int x) {
        double ans = Math.sqrt(x);
        int sol=(int) ans;
        return sol;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
    }
}
