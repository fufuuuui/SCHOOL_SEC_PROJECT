/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabaseconnection;
import java.sql.*;
import javax.swing.*;

public class DBController {
    
    public void addStudent (String name, String gender, String strand, int grade_level){
    String sql = "insert into students (name, gender, strand, grade_level) values (?,?,?,?)";
    executeSQL(sql, "Added", name, gender, strand, grade_level, null);
}
    public ResultSet getStudentData() throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "select * from students";
        Statement stmt = con.createStatement();
        return stmt.executeQuery(sql);
    }
     private void executeSQL (String sql, String action, String name, String gender, String strand, int grade_level, Integer id  ){
        try(Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement (sql)) {
            pst.setString (1, name);
            pst.setString (2, gender);
            pst.setString (3, strand);
            pst.setInt (4, grade_level);
            if (id != null) pst.setInt (5, id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student" +" "+ action + " "+ "Successfully!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+ e.getMessage());   
        }
        
    }
    public void updateStudent (int id, String name,String gender, String strand, int gradeLevel){
        String sql = "Update students set name =?, gender=?, strand=?, grade_level=? where student_id=?";
        executeSQL (sql, "Updated", name, gender, strand, gradeLevel, id);
    }
        public void deleteStudents (int id){
            String sql = "delete from students where student_id =?";
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement pst = con.prepareStatement(sql)){
                pst.setInt (1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student Deleted Successfully!");
            } catch (SQLException e){
                System.out.println("Delete Error: " + e.getMessage());
                
            }
        }
        
    }

