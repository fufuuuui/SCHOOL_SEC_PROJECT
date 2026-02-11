/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_clinic_management_system;

import java.sql.Connection;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author fuuufuu
 */
public class DBConnection {
private static Properties props = new Properties();
public static Connection getConnection(){
    Connection con;
    try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/schooldb","root", "Passw0rd");
         
         
         System.out.print("Connection Successful!");
         return con;
                 }catch(Exception e){ 
                System.out.print("Connection Error"+ e.getMessage()); 
    }
    return null;
    }
}
