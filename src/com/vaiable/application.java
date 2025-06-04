package com.vaiable;


class Appli{
    String stname;
    int phno;

    public void display(){
        stname="svs";
        System.out.println(stname);
    }
}


public class application {

    public static void main(String[] args){

        Appli app=new Appli();
//        app.stname="SVS";
//        System.out.println(app.stname);

        app.display();
    }
}
