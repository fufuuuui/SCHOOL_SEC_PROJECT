/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sign_up;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        pst.setString(3, Password);  // use setString

        pst.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
}
