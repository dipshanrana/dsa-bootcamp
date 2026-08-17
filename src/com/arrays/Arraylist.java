package com.arrays;

import java.util.ArrayList;

public class Arraylist {
    //arraylist is the part of java collection framework so we need it for dynamic size of array


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(2);
        arrayList.add(2);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(2));
        arrayList.set(0,4);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);

    }


}
