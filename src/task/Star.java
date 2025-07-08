package task;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :  ");
        int n = sc.nextInt();


//    for (int i = 1; i <= x; i++) {
//        for (int j = 1; j <= i; j++) {
//            System.out.print(" * ");
//        }
//        System.out.println("");
//    }

//                         *  *  *  *  *  *
//                         *  *  *  *  *
//                         *  *  *  *
//                         *  *  *
//                         *  *
//                         *


//    for (int i = x; i >=1; i--) {
//        for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//        System.out.println("");
//        }
//    }
//
//}


        // outer loop to handle rows
        for (int i = n; i >= 1; i--) {

            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (int k = 0; k <= n - i; k++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
