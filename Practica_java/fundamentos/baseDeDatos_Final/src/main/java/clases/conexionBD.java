/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author marcelo
 */
public class conexionBD {
     
    Connection cn;
    
    public Connection conexion(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd","root","");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No se pudo realizar la conexión");
            System.err.println(e.getMessage());

        }
        return cn;
    }
}
