/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pangilinan_aldrix_dane_javaswing_q3;
import  java.awt.*;
import  java.awt.event.*;

/**
 *
 * @author ihub9
 */
public class Pangilinan_Aldrix_Dane_JavaSwing_Q3 extends Frame implements ActionListener{
    
    Label lblstudentNo,
            lblFullName, lblStudentAddress;
    
    TextField txtStudentNo,
            txtFullName, txtAddress;
    
    Button btnSave, btnClear;
    
    public Pangilinan_Aldrix_Dane_JavaSwing_Q3(){
         setTitle ("Student Form");
         setSize (700 , 500);
         setVisible (true);
         setLayout (new GridLayout (8, 2 ,10 ,10));
         
         lblstudentNo = new Label ("Student Number");
         lblFullName = new Label ("Name");
         lblStudentAddress = new Label ("Address");
         
         txtStudentNo = new TextField(20);
         txtFullName = new TextField(30);
         txtAddress = new TextField(50);
        
         btnSave = new Button("Save");
         btnClear = new Button("Clear");
         
         
         add(lblstudentNo); add(lblFullName);
         add(lblStudentAddress);
         
         add(txtStudentNo); add(txtFullName);
         add(txtAddress);
         
         add(btnSave); add(btnClear);
     }
            
    public static void main(String[] args) {
        // TODO code application logic here
        new Pangilinan_Aldrix_Dane_JavaSwing_Q3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
