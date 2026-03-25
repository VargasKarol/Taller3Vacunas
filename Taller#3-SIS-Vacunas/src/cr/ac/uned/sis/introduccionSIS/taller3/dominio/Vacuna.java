/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uned.sis.introduccionSIS.taller3.dominio;

/**
 *
 * @author ivan
 */
public class Vacuna {
    private int codigo;
    private String nombre;
    private int dosis;
    private String fabricante;
    
    public Vacuna() {
    }

    public Vacuna(int codigo, String nombre, int dosis, String fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dosis = dosis;
        this.fabricante = fabricante;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dosis
     */
    public int getDosis() {
        return dosis;
    }

    /**
     * @param dosis the dosis to set
     */
    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
