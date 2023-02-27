package com.BasicCorePrograms;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1=r.nextInt();
        System.out.println("Enter second number: ");
        num2=r.nextInt();

        num1=num1-num2;
        num2=num1+num2;
        num1=num2-num1;

        System.out.println("Numbers after swap....");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
