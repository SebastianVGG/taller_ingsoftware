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
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class Papel {
    
    private int id;
    private Date fecha_impresion;
    private String lugar_impresion;
    private float precio;
    private int id_libro_papel;
    private int id_almacen;

    public Papel(Date fecha_impresion, String lugar_impresion, float precio, int id_libro_papel, int id_almacen) {
        this.fecha_impresion = fecha_impresion;
        this.lugar_impresion = lugar_impresion;
        this.precio = precio;
        this.id_libro_papel = id_libro_papel;
        this.id_almacen = id_almacen;
    }

    public Papel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_impresion() {
        return fecha_impresion;
    }

    public void setFecha_impresion(Date fecha_impresion) {
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
    
    public void insert_papel() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO papel (id, fecha_impresion, lugar_impresion, precio, id_libro_papel, id_almacen) VALUES (NULL, '"+this.fecha_impresion+"','"+this.lugar_impresion+"',"+this.precio+","+this.id_libro_papel+","+this.id_almacen+")"

                        + "");
        JOptionPane.showMessageDialog(null, "Nuevo libro fisico");  
        statement.close();  
        myConnection.close();
    }
    
    public void delete_papel(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM papel WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Libro fisico eliminado");  
        statement.close();  
        myConnection.close();
    }
    
    public void update_papel(int id, Date fecha_impresion, String lugar_impresion, float precio, int id_libro_papel, int id_almacen) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE papel SET fecha_impresion='"+fecha_impresion+"', lugar_impresion='"+lugar_impresion+"', precio="+precio+", id_libro_papel="+id_libro_papel+", id_almacen="+id_almacen+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Libro fisico actualizado");  
        statement.close();  
        myConnection.close();
    }
    
    public Papel select_one_papel(int id) throws SQLException{
        Papel provincia = new Papel();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, fecha_impresion, lugar_impresion, precio, id_libro_papel, id_almacen FROM papel WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.fecha_impresion=rs.getDate("fecha_impresion");
        provincia.setFecha_impresion(this.fecha_impresion);
        this.lugar_impresion=rs.getString("lugar_impresion");
        provincia.setLugar_impresion(this.lugar_impresion);
        this.precio=rs.getFloat("precio");
        provincia.setPrecio(this.precio);
        this.id_libro_papel=rs.getInt("id_libro_papel");
        provincia.setId_libro_papel(this.id_libro_papel);
        this.id_almacen=rs.getInt("id_almacen");
        provincia.setId_almacen(this.id_almacen);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    
    public List<Papel> select_papel() throws SQLException{
      List<Papel> provincias = new ArrayList<Papel>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, fecha_impresion, lugar_impresion, precio, id_libro_papel, id_almacen FROM papel";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Papel provincia = new Papel();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.fecha_impresion=rs.getDate("fecha_impresion");
        provincia.setFecha_impresion(this.fecha_impresion);
        this.lugar_impresion=rs.getString("lugar_impresion");
        provincia.setLugar_impresion(this.lugar_impresion);
        this.precio=rs.getFloat("precio");
        provincia.setPrecio(this.precio);
        this.id_libro_papel=rs.getInt("id_libro_papel");
        provincia.setId_libro_papel(this.id_libro_papel);
        this.id_almacen=rs.getInt("id_almacen");
        provincia.setId_almacen(this.id_almacen);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }
    
}
