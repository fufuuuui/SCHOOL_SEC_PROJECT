/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_clinic_management_system;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author ihub1
 */
public class DBController {
    public void addPatient(String Date, String first_name, String last_name, int age, String gender, String strand, String complaint, String Nurse_name, String Treatment){
        String sql = "INSERT INTO patients (Date, First_Name, Last_Name, Age, Gender, Strand, Complaint, Nurse_name, Treatment) VALUES (?, ?, ?, ?,?,?,?,?,?,?)";
        executeSQL(sql, "Added", Date, first_name, last_name, age, gender, strand, complaint, Nurse_name, Treatment, null);
    }
    public void updatePatient(int id, String Date, String first_name, String last_name, int age, String gender, String strand, String complaint, String Nurse_name, String Treatment) {
        String sql = "UPDATE patients SET date=?, first_name=?, last_name=?, age=?, gender=?, strand=?, complaint=?, Nurse_name=?, Treatment=?,  WHERE Student_ID=?";
        executeSQL(sql, "Update", Date, first_name, last_name, age, gender, strand, complaint, Nurse_name, Treatment, id);
    }
    public void deletePatient(int id){
        String sql = "DELETE FROM patients WHERE student_id =?";
        try(Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)){
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Patient Deleted Succesfully!");
        } catch (SQLException e){
            System.out.println("Delete Error: " + e.getMessage());
        }
    }
    public ResultSet getStudentData() throws SQLException{
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM patients";
        Statement stmt = con.createStatement();
        return stmt.executeQuery(sql);
}  
    
    private void executeSQL(String sql, String action, String Date, String first_name, String last_name, int age, String gender, String strand, String complaint, String Nurse_name, String Treatment, Integer id){
            try (Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)){
                pst.setString(1, Date);
                pst.setString(2, first_name);
                pst.setString(3, last_name);
                pst.setInt(4, age);
                pst.setString(5, gender);
                pst.setString(6, strand);
                pst.setString(7, complaint);
                pst.setString(8, Nurse_name);
                pst.setString(9, Treatment);
                if (id != null) pst.setInt(10, id);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Patient"+ action+"succesfully!");
            
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error:"+ e.getMessage());
                
            }
        }

    private void executeSQL(String sql, String added, String Date, String first_name, String last_name, int age, String gender, String strand, String complaint, String Nurse_name, String Treatment, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
