package com.array;

import java.util.Arrays;

public class arr_methods {
    public static void main(String[] args) {
        int age[]={24,18,25,36,70,98,89,70,12};
        System.out.println(age.length);

        //sort
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));


        //Binary Search   --  first use sort then u can use binary search method
        Arrays.sort(age);
        int index=Arrays.binarySearch(age,1);
        System.out.println(index);
    }
}
