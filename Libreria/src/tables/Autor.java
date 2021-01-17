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
public class Autor {
    
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String telefono;
    private String url;
    private int id_localidad_autor;

    public Autor(String nombre, String apellido1, String apellido2, String direccion, String telefono, String url, int id_localidad_autor) {
    this.nombre=nombre;
    this.apellido1=apellido1;
    this.apellido2 =apellido2;
    this.direccion=direccion;
    this.telefono=telefono;
    this.url=url;
    this.id_localidad_autor=id_localidad_autor;
    }

    public Autor() {
     int id = this.id;
    String nombre=this.nombre;
    String apellido1=this.apellido1;
    String apellido2 =this.apellido2;
    String direccion=this.direccion;
    String telefono=this.telefono;
    String url=this.url;
    int id_localidad_autor=this.id_localidad_autor;
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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId_localidad_autor() {
        return id_localidad_autor;
    }

    public void setId_localidad_autor(int id_localidad_autor) {
        this.id_localidad_autor = id_localidad_autor;
    }
    
    
    public void insert_autor() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO autor "
                + "(id, nombre, apellido1, apellido2, direccion, telefono, url, id_localidad_autor) VALUES "
                + "(NULL, '"+this.nombre+"', '"+this.apellido1+"', '"+this.apellido2+"', '"+this.direccion+"', '"+this.telefono+"', '"+this.url+"', "+this.id_localidad_autor+")"

                        + "");
        JOptionPane.showMessageDialog(null, "Nuevo autor");  
        statement.close();  
        myConnection.close();
    }
    
    public void delete_autor(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM autor WHERE id="+id);
        JOptionPane.showMessageDialog(null, "autor eliminado");  
        statement.close();  
        myConnection.close();
    }
    
    public void update_autor(int id, String nombre, String apellido1,String apellido2,String direccion,String telefono,String url, int id_localidad_autor) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE autor SET "
                + "nombre='"+nombre+"',apellido1='"+apellido1+"',apellido2='"+apellido2+"',direccion='"+direccion+"',telefono='"+telefono+"',url='"+url+"',id_localidad_autor="+id_localidad_autor+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Autor actualizado");  
        statement.close();  
        myConnection.close();
    }
    
    public Autor select_one_autor(int id) throws SQLException{
        Autor provincia = new Autor();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, nombre, apellido1, apellido2, direccion, telefono, url, id_localidad_autor FROM autor WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.nombre=rs.getString("nombre");
        provincia.setNombre(this.nombre);
        this.apellido1=rs.getString("apellido1");
        provincia.setApellido1(this.apellido1);
        this.apellido2=rs.getString("apellido2");
        provincia.setApellido2(this.apellido2);
        this.direccion=rs.getString("direccion");
        provincia.setDireccion(this.direccion);
        this.telefono=rs.getString("telefono");
        provincia.setTelefono(this.telefono);
        this.url=rs.getString("url");
        provincia.setUrl(this.url);
        this.id_localidad_autor=rs.getInt("id_localidad_autor");
        provincia.setId_localidad_autor(this.id_localidad_autor);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    public List<Autor> select_all() throws SQLException{
      List<Autor> provincias = new ArrayList<Autor>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, nombre, apellido1, apellido2, direccion, telefono, url, id_localidad_autor FROM autor";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Autor provincia = new Autor();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.nombre=rs.getString("nombre");
        provincia.setNombre(this.nombre);
        this.apellido1=rs.getString("apellido1");
        provincia.setApellido1(this.apellido1);
        this.apellido2=rs.getString("apellido2");
        provincia.setApellido2(this.apellido2);
        this.direccion=rs.getString("direccion");
        provincia.setDireccion(this.direccion);
        this.telefono=rs.getString("telefono");
        provincia.setTelefono(this.telefono);
        this.url=rs.getString("url");
        provincia.setUrl(this.url);
        this.id_localidad_autor=rs.getInt("id_localidad_autor");
        provincia.setId_localidad_autor(this.id_localidad_autor);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }
    
}
