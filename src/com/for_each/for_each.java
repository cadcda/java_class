package com.for_each;

public class for_each {

    public  static void main(String[] args){

        sum(5,4);
        sum(5,10,68,20,10000);
    }
public static void sum(int...n){
    int total=0;
     for(int x:n){
       total+=x;     //    System.out.println(x);
     }
    System.out.println(total);


}

}
