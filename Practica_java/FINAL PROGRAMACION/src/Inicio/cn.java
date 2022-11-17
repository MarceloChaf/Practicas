/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author lucia
 */
class cn {

    static PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        Connection cn;
    
    public Connection conexión() {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bd","root","");
            
            System.out.println("conectado");
            
        }
        catch (Exception e) {
            
            System.err.println(e.getMessage());
            
        }   
        
        return cn;
        
    }
}
