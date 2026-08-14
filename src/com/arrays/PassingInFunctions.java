package com.arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(a));
        passing(a);
        System.out.println(Arrays.toString(a));
    }
    static void passing(int[] arr){
        arr[0] = 99;
    }

}
