package com.Control_statements;

import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();

        if(marks>=35) {
            System.out.println("pass mark");

            if (marks >= 90)
                System.out.println("Grade A");
            else if (marks <= 75)
                System.out.println("Grade B");
            else if (marks == 50)
                System.out.println("Grade C");
        }
        else{
            System.out.println("fail");
            }


        }

        }




