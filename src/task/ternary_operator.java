package task;

import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Greatest between two numbers
        System.out.println("enter the value for x ");
        int x=sc.nextInt();
        System.out.println("enter the value for y ");
        int y=sc.nextInt();

        int result= ( x>y) ?  x : y ;
        System.out.println("greatest number is  " + result);

        //Greatest between three numbers
        System.out.println("enter the value for x1 ");
        int x1=sc.nextInt();
        System.out.println("enter the value for y2 ");
        int y1=sc.nextInt();
        System.out.println("enter the value for z ");
        int z=sc.nextInt();

        int result1=(x1 >y1 ) ? ((x1 >z ) ?x1  : z ) : ((y1 >z ) ?y1  :z );
        System.out.println("greatest number is  " + result1);


    }
}
