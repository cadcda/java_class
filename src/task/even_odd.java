package task;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args){
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number :");
//        int num=sc.nextInt();
//        if(num%2==0)
//            System.out.println("num is even");
//        else
//            System.out.println("num is odd");


        for(int i=0;i<=10;i++){
            if(i%2!=0) {
                continue;
            }
            else {
                System.out.println(i);

            }
        }
    }
}

//check given number is even or not
// check the year is leap year or not
// //number divisible by 6
// print odd numbers from 1 to 20