package com.arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,2));
    }
    static int max(int[] arr){
    int max = arr[0];
//    for(int e : arr){
//        if(e>max){
//            max = e;
//        }
//    }

        for (int i = 0; i < arr.length; i++) {
          if(arr[i]>max){
              max = arr[i];
          }
        }
    return max;
    }
    static int maxRange(int[] arr,int start, int end ){
       int max = arr[start];
        for (int i = start+1; i <= end; i++) {
            if(arr[i]>max){
              max = arr[i];
            }
        }
        return max;
    }
}
