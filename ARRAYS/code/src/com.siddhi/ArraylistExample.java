

import java.util.*;
public class ArraylistExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList <Integer> arr = new ArrayList<>(8);
        //input item
        for(int i = 0 ; i < 8;i++){
            arr.add(sc.nextInt());
        }
        //get item at index
        for(int i = 0 ; i < 8; i++){
            System.out.println((arr.get(i)));
        }

        System.out.println(arr);
    }
}