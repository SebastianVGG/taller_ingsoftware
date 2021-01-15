/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class Provincia {
    
    private int id;
    private String nombre;

    public Provincia(String nombre) {
      this.nombre=nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public void insert_provincia() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO provincia (id, nombre) VALUES (NULL, '"+this.nombre+"')"

                        + "");
        JOptionPane.showMessageDialog(null, "Nueva Provincia");  
        statement.close();  
        myConnection.close();
    }
    
    
}
