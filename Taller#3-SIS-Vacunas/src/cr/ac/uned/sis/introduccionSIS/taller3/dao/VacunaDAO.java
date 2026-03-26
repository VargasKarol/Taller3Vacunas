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
            
            ps.setInt(1, v.getCodigo());
            ps.setString(2, v.getNombre());
            ps.setInt(3, v.getDosis());
            ps.setString(4, v.getFabricante());

            
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
            
            ps.setInt(1, codigo);
            rs=ps.executeQuery();
            if(rs.next()){
                v= new Vacuna();
                v.setCodigo(rs.getInt("CODIGO"));
                v.setNombre(rs.getString("NOMBRE"));
                v.setDosis(rs.getInt("DOSIS"));
                v.setFabricante(rs.getString("FABRICANTE"));
            }
        
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

            ps.setString(1, v.getNombre());
            ps.setInt(2,v.getDosis());
            ps.setString(3, v.getFabricante());
            ps.setInt(4, v.getCodigo());
            

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

            ps.setInt(1, codigo);

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

            while (rs.next()) {
                Vacuna v = new Vacuna();
                v.setCodigo(rs.getInt("CODIGO"));
                v.setNombre(rs.getString("NOMBRE"));
                v.setDosis(rs.getInt("DOSIS"));
                v.setFabricante(rs.getString("FABRICANTE"));
                lista.add(v);
            }

        } catch (Exception e) {
            System.out.println("Error listar: " + e.getMessage());
        }
        return lista;
    }
}
