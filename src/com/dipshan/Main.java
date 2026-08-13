package com.dipshan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println();
//        long okay = 4444L;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter the number: ");
//        int num = sc.nextInt();
//        System.out.println("Your number is : " + num);
//
//        int a = 234_000_000;
//        System.out.println(a);
//        float num = sc.nextInt();
//        sc.close();
//        System.out.println(num);

//        int age = 158;
//        byte a = (byte) (age);
//        System.out.println(a);
//        String okay = " "+ 'A' + 'B';
//        int c = 'a' + 'b';
//        String d = "" + 33 + 33;
//        System.out.println(d);
//        if(true){
//
//        } else if (true) {
//
//        }
//        else{
//
//        }

//        String fruit = "Orange";
//        switch (fruit) {
//            case "Apple" -> System.out.println("It is an red fruit");
//            case "Orange" -> System.out.println("It is orange fruit.");
//        }

        int day = 2;

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the empId: ");
        int empId = sc.nextInt();
        System.out.print("Enter the Department: ");
        String dept = sc.next();

        switch (empId) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter the valid number");
        }

        {
            int a = 22;
        }
        int a = 33;


    }
}