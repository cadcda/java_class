package com.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("the the two values :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("sum is "+ (a+b));
        System.out.println("sub is " + (a-b));
        System.out.println("mult is "+ (a*b));
        System.out.println("div is "+ (a/b));
        System.out.println("mod is "+ (a%b));
    }

}
