package exception_handling;

import java.util.Scanner;

public class exception_1 {
    public static void main(String[] args) {
        int z = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();
        try {
            int c = z / b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("close the document");
            sc.close();
        }
        System.out.println("ram");

    }
}
