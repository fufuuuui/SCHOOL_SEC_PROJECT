/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student_clinic_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_clinic_management_system", "root", "Passw0rd");
            System.out.print("Connection Successful!");
            return con;
        } catch (Exception e) {
            System.out.println("Connection Error " + e.getMessage());
        }
        return null;
    }
}
