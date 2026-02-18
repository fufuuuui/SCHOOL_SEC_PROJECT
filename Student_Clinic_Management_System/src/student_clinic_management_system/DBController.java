package student_clinic_management_system;

import java.sql.*;
import javax.swing.*;

public class DBController {

    Connection connection = DBConnection.getConnection();

    public void addPatient(
            String date,
            String patientName,
            String phoneNumber,
            String address,
            String city,
            String dateOfBirth,
            int age,
            String gender,
            String complaint,
            String nurseName,
            String treatment) {

        String sql = "INSERT INTO patients "
                + "(Date_of_Registration, Patient_Name, Phone_Number, Address, City, Date_of_Birth, Age, Gender, Complaint, Nurse_name, Treatment) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {

            pst.setString(1, date);
            pst.setString(2, patientName);
            pst.setString(3, phoneNumber);
            pst.setString(4, address);
            pst.setString(5, city);
            pst.setString(6, dateOfBirth);
            pst.setInt(7, age);
            pst.setString(8, gender);
            pst.setString(9, complaint);
            pst.setString(10, nurseName);
            pst.setString(11, treatment);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Patient added successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void updatePatient(int id,
            String date,
            String patientName,
            String phoneNumber,
            String address,
            String city,
            String dateOfBirth,
            int age,
            String gender,
            String complaint,
            String nurseName,
            String treatment) {

        String sql = "UPDATE patients SET "
                + "Date_of_Registration=?, Patient_Name=?, Phone_Number=?, Address=?, City=?, Date_of_Birth=?, Age=?, Gender=?, Complaint=?, Nurse_name=?, Treatment=? "
                + "WHERE Patient_ID=?";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {

            pst.setString(1, date);
            pst.setString(2, patientName);
            pst.setString(3, phoneNumber);
            pst.setString(4, address);
            pst.setString(5, city);
            pst.setString(6, dateOfBirth);
            pst.setInt(7, age);
            pst.setString(8, gender);
            pst.setString(9, complaint);
            pst.setString(10, nurseName);
            pst.setString(11, treatment);
            pst.setInt(12, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Patient updated successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void deletePatient(int id) {

        String sql = "DELETE FROM patients WHERE Patient_ID=?";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {

            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Patient deleted successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Delete Error: " + e.getMessage());
        }
    }

    public ResultSet getStudentData() throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "select * from patients";
        Statement stmt = con.createStatement();
        return stmt.executeQuery(sql);
    }
}
