package task;
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class billing {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the product names");
//        String names=sc.nextLine();
//        System.out.println("enter the qty");
//        int Qty=sc.nextInt();
//        System.out.println("enter the price");
//        int price=sc.nextInt();
//
//        System.out.println("The final bill is   " + "   " +  names +"  Quanty  " +  Qty +"  Price for each quantity   " +  price );
//        System.out.println("the Total amt to be paid is  " + "Rs." +Qty*price);
//    }
//}


import java.util.Scanner;

public class billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] productNames = new String[n];
        int[] quantities = new int[n];
        double[] prices = new double[n];

        // Input section
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));
            System.out.print("Product name: ");
            productNames[i] = sc.nextLine();

            System.out.print("Quantity: ");
            quantities[i] = sc.nextInt();

            System.out.print("Price per unit: ");
            prices[i] = sc.nextDouble();
            sc.nextLine(); // Consume newline
        }

        // Calculation
        double total = 0;
        System.out.println("\n---------------------- Final Bill ----------------------");
        System.out.printf("%15s %-10s %-10s %-10s\n", "Product", "Qty", "Price", "Total");

        for (int i = 0; i < n; i++) {
            double itemTotal = quantities[i] * prices[i];
            total += itemTotal;
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", productNames[i], quantities[i], prices[i], itemTotal);
        }

        // Apply discount
        double discount = 0;
        if (total > 1000) {
            discount = total * 0.1; // 10% discount
            total -= discount;
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Discount Applied: Rs. %.2f\n", discount);
        System.out.printf("Final Amount to Pay: Rs. %.2f\n", total);
    }
}
