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
public class Provincia {
    
    private int id;
    private String nombre;

    public Provincia(String nombre) {
      this.nombre=nombre;
    }

    public Provincia() {
        int id = this.id;
        String nombre = this.nombre;
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
    
    public void delete_provincia(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM provincia WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Provincia eliminada");  
        statement.close();  
        myConnection.close();
    }
    public void update_provincia(int id, String nombre) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE provincia SET nombre='"+nombre+"' WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Provincia actualizada");  
        statement.close();  
        myConnection.close();
    }
    
    public Provincia select_one_provincia(int id) throws SQLException{
        Provincia provincia = new Provincia();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, nombre FROM provincia WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.nombre=rs.getString("nombre");
        provincia.setNombre(this.nombre);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    
    public List<Provincia> select_provincia() throws SQLException{
      List<Provincia> provincias = new ArrayList<Provincia>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, nombre FROM provincia";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         Provincia provincia = new Provincia();
         this.id  = rs.getInt("id");
         provincia.setId(this.id);
        this.nombre = rs.getString("nombre");
        provincia.setNombre(this.nombre);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }
    
    public String toString(){
        String provincia ="|"+this.id+"|"+" Nombre: "+this.nombre;
        return provincia;
    }
    
}

 

