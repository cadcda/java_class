package com.datatype;

public class Datatype {
    static boolean isCompleted;

    boolean isDone=true;

     public void display(){

        System.out.println(isDone);
    }

    public static void main(String[] args){

//        boolean isCompleted=false;
        System.out.println(isCompleted);

        char c='V';
        System.out.println(c);

        byte b=52;
        System.out.println(b);

        Datatype dt=new Datatype();
        dt.display();


    }
}
