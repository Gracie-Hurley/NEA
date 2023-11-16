/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guitester;

/**
 *
 * @author hurle
 */
public class User{
    private static String UniqueID;
    private static String StudentEmail;
    private static String StudentUserName;
    private static String StudentPassword;

    public static String getUniqueID() {
        return UniqueID;
    }

    public static void setUniqueID(String UniqueID) {
        User.UniqueID = UniqueID;
    }

    public static String getStudentEmail() {
        return StudentEmail;
    }

    public static void setStudentEmail(String StudentEmail) {
        User.StudentEmail = StudentEmail;
    }

    public static String getStudentUserName() {
        return StudentUserName;
    }

    public static void setStudentUserName(String StudentUserName) {
        User.StudentUserName = StudentUserName;
    }

    public static String getStudentPassword() {
        return StudentPassword;
    }

    public static void setStudentPassword(String StudentPassword) {
        User.StudentPassword = StudentPassword;
    }
    
    public User(String UserName, String Password){
        this.StudentUserName= UserName;
        this.StudentPassword= Password;
        
        
        
       
    
}
}
