package com.BasicCorePrograms;

import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner r = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = r.nextInt();
        System.out.print("Enter second number: ");
        num2 = r.nextInt();
        System.out.print("Enter third number: ");
        num3 = r.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is greater : " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is greater : " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("num3 is greater : " + num3);
        } else {
            System.out.println("All numbers are same");

        }
    }
}
