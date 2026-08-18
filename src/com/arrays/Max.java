package com.arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,2));

    }
    static int max(int[] arr){

        if(arr.length==0){
            return -1;
        }
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
        if(end>start){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
       int max = arr[start];
        for (int i = start+1; i <= end; i++) {
            if(arr[i]>max){
              max = arr[i];
            }
        }
        return max;
    }


}
