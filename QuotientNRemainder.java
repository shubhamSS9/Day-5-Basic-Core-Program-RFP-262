package com.BasicCorePrograms;

import java.util.Scanner;

public class QuotientNRemainder {
    public static void main(String[] args) {
        int divident,divisor;
        Scanner r=new Scanner(System.in);

        System.out.print("Enter divident: ");
        divident=r.nextInt();

        System.out.print("Enter divisor: ");
        divisor=r.nextInt();

        int quotient = divident/divisor;
        int remainder = divident%divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
