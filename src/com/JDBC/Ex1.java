package com.JDBC;

import java.sql.*;

public class Ex1 {

    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java7am","root","rootpassword");
        System.out.println("Connection successful");
        Statement st= con.createStatement();
       String s="insert into practice(name,price) values('ragiball',50)";
       st.execute(s);
        System.out.println("Inserted successfull into the table");
        ResultSet rs=st.executeQuery("Select * from practice");

        while(rs.next()){
            System.out.println(rs.getInt(1) +  " "  +  rs.getString(2) +   "  "  +  rs.getDouble(3)) ;
        }

        rs.close();
        st.close();
        con.close();

    }
        catch (Exception e) {
            System.out.println(e);
        }
        }
}
