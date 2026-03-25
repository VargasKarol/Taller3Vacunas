/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uned.sis.introduccionSIS.taller3.dao;


import cr.ac.uned.sis.introduccionSIS.taller3.dominio.Vacuna;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ivan
 */
public class VacunaDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ConexionDB cx = new ConexionDB();

    public boolean insertar(Vacuna v) {
        String sql = "INSERT INTO VACUNA (CODIGO, NOMBRE, DOSIS, FABRICANTE) VALUES (?, ?, ?, ?)";
        try {
            con = cx.getConexion();
            ps = con.prepareStatement(sql);

            // TODO: completar parámetros

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error insertar: " + e.getMessage());
            return false;
        }
    }

    public Vacuna buscar(int codigo) {
        String sql = "SELECT * FROM VACUNA WHERE CODIGO = ?";
        Vacuna v = null;
        try {
            con = cx.getConexion();
            ps = con.prepareStatement(sql);

            // TODO: asignar parámetro y construir objeto si existe

        } catch (Exception e) {
            System.out.println("Error buscar: " + e.getMessage());
        }
        return v;
    }

    public boolean actualizar(Vacuna v) {
        String sql = "UPDATE VACUNA SET NOMBRE=?, DOSIS=?, FABRICANTE=? WHERE CODIGO=?";
        try {
            con = cx.getConexion();
            ps = con.prepareStatement(sql);

            // TODO: completar parámetros

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error actualizar: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int codigo) {
        String sql = "DELETE FROM VACUNA WHERE CODIGO=?";
        try {
            con = cx.getConexion();
            ps = con.prepareStatement(sql);

            // TODO: completar parámetro

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error eliminar: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Vacuna> listar() {
        ArrayList<Vacuna> lista = new ArrayList<>();
        String sql = "SELECT * FROM VACUNA";
        try {
            con = cx.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            // TODO: recorrer ResultSet y llenar lista

        } catch (Exception e) {
            System.out.println("Error listar: " + e.getMessage());
        }
        return lista;
    }
}
