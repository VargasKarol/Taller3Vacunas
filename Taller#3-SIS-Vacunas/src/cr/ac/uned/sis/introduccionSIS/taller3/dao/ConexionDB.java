/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uned.sis.introduccionSIS.taller3.dao;

import java.sql.*;

/**
 *
 * @author ivan
 */
public class ConexionDB {
    
    private String urlBD="jdbc:derby://localhost:1527/Vacunas";
    private String userName="adminSIS";
    private String password="SIS12345";
    
    public Connection getConexion() throws SQLException{
        return DriverManager.getConnection(urlBD,userName,password);
    }
    
}
