package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][4];

        int [] [] arr1 = {
                {1,2},
                {3,4,5},
                {3,4,5,6}
        };

        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[0][1]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

    }
}
