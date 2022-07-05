package com;

import java.sql.*;

public class basicjava {

    public static void main(String[] args) 
    {
       try
       {
          Class.forName("org.postgresql.Driver");
          Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
       System.out.println("conn");

        Statement s=c.createStatement();
          ResultSet rs=s.executeQuery("SELECT * FROM regtutor FETCH FIRST 100 ROWS ONLY");
          while(rs.next()){
              System.out.println(rs.getString("username"));
         }
          s.close();
          c.close(); 
       }    
        catch(Exception e)
        {
            System.out.println(e);    
        }
    
    }
    
}