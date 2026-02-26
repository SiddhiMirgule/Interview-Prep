// given array of size n containing numbers from 0 to n if exactly 1 number is missing . find it
package com.siddhi;
import java.util.*;
public class Range {
    public static int findMissing(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int missing = findMissing(num);

        System.out.println("Missing number is: " + missing);
    }
}

