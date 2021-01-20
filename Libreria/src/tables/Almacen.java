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
public class Almacen {
    
    private int id;
    private String direccion;
    private String telefono;
    private int id_localidad_almacen;

    public Almacen(String direccion, String telefono, int id_almacen_localidad) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_localidad_almacen = id_almacen_localidad;
    }

    public Almacen() {
        int id = this.id;
        String direccion = this.direccion;
        String telefono = this.telefono;
        int id_localidad_almacen = this.id_localidad_almacen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_localidad_almacen() {
        return id_localidad_almacen;
    }

    public void setId_localidad_almacen(int id_localidad_almacen) {
        this.id_localidad_almacen = id_localidad_almacen;
    }
    
    public void insert_almacen() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO almacen (id, direccion, telefono, id_localidad_almacen) VALUES (NULL, '"+this.direccion+"','"+this.telefono+"',"+this.id_localidad_almacen+")"

                        + "");
        JOptionPane.showMessageDialog(null, "Nuevo almacen");  
        statement.close();  
        myConnection.close();
    }
    
    public void delete_almacen(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM almacen WHERE id="+id);
        JOptionPane.showMessageDialog(null, "almacen eliminado");  
        statement.close();  
        myConnection.close();
    }
    
    public void update_almacen(int id, String direccion, String telefono, int id_localidad_almacen) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE almacen SET direccion='"+direccion+"', telefono='"+telefono+"', id_localidad_almacen="+id_localidad_almacen+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "almacen actualizada");  
        statement.close();  
        myConnection.close();
    }
    
    public Almacen select_one_almacen(int id) throws SQLException{
        Almacen provincia = new Almacen();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, direccion, telefono, id_localidad_almacen FROM almacen WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.direccion=rs.getString("direccion");
        provincia.setDireccion(this.direccion);
        this.telefono=rs.getString("telefono");
        provincia.setTelefono(this.telefono);
        this.id_localidad_almacen=rs.getInt("id_localidad_almacen");
        provincia.setId_localidad_almacen(this.id_localidad_almacen);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
        public Almacen select_id_papel(int id) throws SQLException{
        Almacen provincia = new Almacen();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, direccion, telefono, id_localidad_almacen FROM almacen WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.direccion=rs.getString("direccion");
        provincia.setDireccion(this.direccion);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    
    public List<Almacen> select_almacen() throws SQLException{
      List<Almacen> provincias = new ArrayList<Almacen>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, direccion, telefono, id_localidad_almacen FROM almacen";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         Almacen provincia = new Almacen();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.direccion=rs.getString("direccion");
        provincia.setDireccion(this.direccion);
        this.telefono=rs.getString("telefono");
        provincia.setTelefono(this.telefono);
        this.id_localidad_almacen=rs.getInt("id_localidad_almacen");
        provincia.setId_localidad_almacen(this.id_localidad_almacen);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }
    
    public String toString(){
        String provincia ="|"+this.id+"|"+" Direccion: "+this.direccion+" telefono: "+this.telefono;
        return provincia;
    }
    
}
