package com.dipshan;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        System.out.println(check(num));

        for (int i = 100; i < 1000; i++) {
            if (check(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean check(int n){
        int cube = 0;
        int num = n;
        while(num>0){
            int a = num%10;
            cube = cube + a*a*a;
            num = num/10;
        }

        return n==cube;

    }

}
