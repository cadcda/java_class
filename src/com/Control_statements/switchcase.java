package com.Control_statements;

import java.util.Scanner;

public class switchcase {

    public  static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("the the two values :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operation");
        String x=sc.next();
        switch (x){

            case  "sum":
                System.out.println("sum is executed"+" sum is "+ (a+b));
                break;
            case "sub":
                System.out.println("thi is sub"+"sub is " + (a-b));
                break;

            default:
                System.out.println("hi");
                break;
//        System.out.println("sum is "+ (a+b));
//        System.out.println("sub is " + (a-b));
//        System.out.println("mult is "+ (a*b));
//        System.out.println("div is "+ (a/b));
//        System.out.println("mod is "+ (a%b));
    }

}

}
