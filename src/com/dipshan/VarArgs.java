package com.dipshan;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(3,3,3,4,6,4,3);
    }

//    static void fun(int... v) {
//        System.out.println(Arrays.toString(v));
//    }
    static void fun(int a, int b , int ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }


}
