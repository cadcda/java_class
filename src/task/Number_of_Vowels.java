package task;

import java.util.Scanner;

public class Number_of_Vowels {
    public static void main (String[] args){

        //number of vowels in the string
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowelCount = 0;

        // Convert the string to lowercase to simplify comparison
        input = input.toLowerCase();

        char [] x=input.toCharArray();


        // Check each character
        for (char ch : x) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

    }
}
