package com.dipshan;

public class OccurrenceCount {
    public static void main(String[] args) {
       int n = 1385757879;
       int a = n;
       int number = 8;
       int count = 0;
       while(a>0){
           if(a%10==number){
               count++;
           }
           a = a/10;
       }
        System.out.println(count);
    }
}
