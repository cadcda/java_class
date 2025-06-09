package com.return_key;

public class return_key {

    public static void checkage(int age){
        if(age>=18){
            System.out.println("eligible");
            return; //comes outside method once printed "eligible"
        }
        System.out.println("not eligible");
    }

    public static int sum(int a,int b){
                return  a+b;
    }

    public static void main(String[] args){
        checkage(45);
        checkage(12);
        int res=sum(5,5);
        System.out.println(res);
    }
}
