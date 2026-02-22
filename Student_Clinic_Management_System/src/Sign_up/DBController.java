/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sign_up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import student_clinic_management_system.Patient_List;

/**
 *
 * @author fuuufuu
 */
public class DBController {
    Connection connection = DBConnection.getConnection();
    public void Sign_up(String Name, String Email, String Password)
    {
        String sql = "INSERT INTO users(username, email, password) VALUES(?,?,?)";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {

        pst.setString(1, Name);
        pst.setString(2, Email);
            pst.setString(3, Password);

        pst.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    public String Log_in(String Password, String Email)    {
        String sql = "SELECT username, password FROM users WHERE email = ?";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {

            pst.setString(1, Email);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String passDb = rs.getString("password");
                String username = rs.getString("username");

                if (Password.equals(passDb)) {
                    return username;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
