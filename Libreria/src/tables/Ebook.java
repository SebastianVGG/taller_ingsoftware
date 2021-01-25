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
public class Ebook {
    
    private int id;
    private String tamaño;
    private float precio;
    private int id_libro_ebook;

    public Ebook(String tamaño, float precio, int id_libro_ebook) {
        this.tamaño = tamaño;
        this.precio = precio;
        this.id_libro_ebook = id_libro_ebook;
    }

    public Ebook() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId_libro_ebook() {
        return id_libro_ebook;
    }

    public void setId_libro_ebook(int id_libro_ebook) {
        this.id_libro_ebook = id_libro_ebook;
    }
    
        public void insert_ebook() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO ebook "
                + "(id, tamaño, precio, id_libro_ebook) VALUES "
                + "(NULL, '"+this.tamaño+"', "+this.precio+","+this.id_libro_ebook+")"

                        + "");
        JOptionPane.showMessageDialog(null, "Nuevo Ebook");  
        statement.close();  
        myConnection.close();
    }
    
    public void delete_ebook(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM ebook WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Ebook eliminado");  
        statement.close();  
        myConnection.close();
    }
    public void update_ebook(int id, String tamaño, float precio, int id_libro_ebook) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE ebook SET tamaño='"+tamaño+"', precio="+precio+", id_libro_ebook="+id_libro_ebook+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Ebook actualizado");  
        statement.close();  
        myConnection.close();
    }
    
       public Ebook select_id_libro(int id) throws SQLException{
        Ebook provincia = new Ebook();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, tamaño, precio, id_libro_ebook FROM ebook WHERE id_libro_ebook="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.tamaño=rs.getString("tamaño");
        provincia.setTamaño(this.tamaño);
        this.precio=rs.getInt("precio");
        provincia.setPrecio(this.precio);
        this.id_libro_ebook=rs.getInt("id_libro_ebook");
        provincia.setId_libro_ebook(this.id_libro_ebook);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    public Ebook select_one_ebook(int id) throws SQLException{
        Ebook provincia = new Ebook();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, tamaño, precio, id_libro_ebook FROM ebook WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.tamaño=rs.getString("tamaño");
        provincia.setTamaño(this.tamaño);
        this.precio=rs.getInt("precio");
        provincia.setPrecio(this.precio);
        this.id_libro_ebook=rs.getInt("id_libro_ebook");
        provincia.setId_libro_ebook(this.id_libro_ebook);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
     public List<Ebook> select_id_ebook(int id_libro) throws SQLException{
      List<Ebook> provincias = new ArrayList<Ebook>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, tamaño, precio, id_libro_ebook FROM ebook Where id_libro_ebook="+id_libro;
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Ebook provincia = new Ebook();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.tamaño=rs.getString("tamaño");
        provincia.setTamaño(this.tamaño);
        this.precio=rs.getInt("precio");
        provincia.setPrecio(this.precio);
        this.id_libro_ebook=rs.getInt("id_libro_ebook");
        provincia.setId_libro_ebook(this.id_libro_ebook);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    } 
    public List<Ebook> select_ebook() throws SQLException{
      List<Ebook> provincias = new ArrayList<Ebook>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, tamaño, precio, id_libro_ebook FROM ebook";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Ebook provincia = new Ebook();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.tamaño=rs.getString("tamaño");
        provincia.setTamaño(this.tamaño);
        this.precio=rs.getInt("precio");
        provincia.setPrecio(this.precio);
        this.id_libro_ebook=rs.getInt("id_libro_ebook");
        provincia.setId_libro_ebook(this.id_libro_ebook);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }
}
