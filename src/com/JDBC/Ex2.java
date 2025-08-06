package com.JDBC;

import java.sql.*;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java7am","root","rootpassword");
            System.out.println("Connection successful");

            Scanner sc=new Scanner(System.in);
            String s="insert into practice(name,price) values(?,?)";
            PreparedStatement pst= con.prepareStatement(s);
            System.out.println("Enter the name of food and price ");
            String name=sc.nextLine();
            double price=sc.nextInt();
            pst.setString(1,name);
            pst.setDouble(2,price);
            pst.executeUpdate();
            System.out.println("Inserted successfull into the table");

            ResultSet rs=pst.executeQuery("Select * from practice");

            while(rs.next()){
                System.out.println(rs.getInt(1) +  " "  +  rs.getString(2) +   "  "  +  rs.getDouble(3)) ;
            }

            rs.close();
            pst.close();
            con.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
