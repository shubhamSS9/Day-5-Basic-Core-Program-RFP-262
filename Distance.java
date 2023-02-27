package com.BasicCorePrograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double distance;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter x1 point: ");
        x1=r.nextInt();
        System.out.print("Enter x2 point: ");
        x2=r.nextInt();
        System.out.print("Enter y1 point: ");
        y1=r.nextInt();
        System.out.print("Enter y2 point: ");
        y2=r.nextInt();
        distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println(distance);

    }
}
