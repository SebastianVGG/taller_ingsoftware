/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class Papel {
    
    private int id;
    private String fecha_impresion;
    private String lugar_impresion;
    private float precio;
    private int id_libro_papel;
    private int id_almacen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_impresion() {
        return fecha_impresion;
    }

    public void setFecha_impresion(String fecha_impresion) {
        this.fecha_impresion = fecha_impresion;
    }

    public String getLugar_impresion() {
        return lugar_impresion;
    }

    public void setLugar_impresion(String lugar_impresion) {
        this.lugar_impresion = lugar_impresion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId_libro_papel() {
        return id_libro_papel;
    }

    public void setId_libro_papel(int id_libro_papel) {
        this.id_libro_papel = id_libro_papel;
    }

    public int getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(int id_almacen) {
        this.id_almacen = id_almacen;
    }
    
    
    
}
