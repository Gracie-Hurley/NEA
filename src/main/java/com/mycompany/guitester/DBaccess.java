/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guitester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hurle
 */
public class DBaccess {
    private static final String DB_URL ="jdbc:mysql://computing.gfmat.org:3306/";
      private static final String DB_NAME ="2022c_GHurley_test";
                private static final String USERNAME ="2022c_GHurley";
                          private static final String PASSWORD ="e4XLPAPdVP8nvGZh";

public static boolean SQLtestConnection(){
boolean connection;
try (Connection con=DriverManager.getConnection(DB_URL + DB_NAME, USERNAME, PASSWORD)){
System.out.println("connection made!");
connection=true;
con.close();
}catch(Exception e){
System.out.println("something went wrong" + e.getMessage());
connection=false;
                                  
}
return connection;
}

    /**
     *
     * @return
     * @throws SQLException
     */
   