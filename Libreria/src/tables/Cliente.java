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
public class Cliente {
    
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String email;
    private String password;

    public Cliente(String nombre, String apellido1, String apellido2, String direccion, String email, String password, String telefono, int id_localidad_cliente) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.id_localidad_cliente = id_localidad_cliente;
    }

    public Cliente() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private int id_localidad_cliente;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getId_localidad_cliente() {
        return id_localidad_cliente;
    }

    public void setId_localidad_cliente(int id_localidad_cliente) {
        this.id_localidad_cliente = id_localidad_cliente;
    }
    
    
    
    
     public void insert_cliente() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO `cliente` "
                + "(`id`, `nombre`, `apellido1`, `apellido2`, `direccion`, `email`, password, `telefono`, `id_localidad_cliente`)"
                + " VALUES "
                + "(NULL, '"+this.nombre+"', '"+this.apellido1+"', '"+this.apellido2+"', '"+this.direccion+"', '"+this.email+"', '"+this.password+"','"+this.telefono+"',"+this.id_localidad_cliente+" )"

                        + "");
        statement.close();  
        myConnection.close();
    }
    
    public void delete_cliente(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM cliente WHERE id="+id);
        JOptionPane.showMessageDialog(null, "cliente eliminado");  
        statement.close();  
        myConnection.close();
    }
    public void update_cliente(int id, String nombre, String apellido1, String apellido2, String direccion, String email,String password, String telefono, int localidad_cliente) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE cliente SET "
                + "nombre='"+nombre+"',apellido1='"+apellido1+"', apellido2='"+apellido2+"', direccion='"+direccion+"',"
                        + " email='"+email+"', password='"+password+"', telefono='"+telefono+"', id_localidad_cliente="+localidad_cliente+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "cliente actualizado");  
        statement.close();  
        myConnection.close();
    }
    
       public int select_id(String search_email) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id FROM cliente WHERE email='"+search_email+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        }
        return this.id;
    }
    
    public String select_email(String search_email) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT email FROM cliente WHERE email='"+search_email+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.email=rs.getString("email");
        }
        return this.email;
    }
    
    public String select_pass(String search_pass) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT password FROM cliente WHERE password='"+search_pass+"'";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.password=rs.getString("password");
        }
        return this.password;
    }
    
    public Cliente select_one_cliente(int id) throws SQLException{
        Cliente provincia = new Cliente();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, nombre, `apellido1`, `apellido2`, `direccion`, `email`, password, `telefono`, `id_localidad_cliente` FROM cliente WHERE id="+id;
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
        this.email=rs.getString("email");
        provincia.setEmail(this.email);
        this.password=rs.getString("password");
        provincia.setPassword(this.password);
        this.telefono=rs.getString("telefono");
        provincia.setTelefono(this.telefono);
        this.id_localidad_cliente=rs.getInt("id_localidad_cliente");
        provincia.setId_localidad_cliente(this.id_localidad_cliente);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    
    public List<Cliente> select_cliente() throws SQLException{
      List<Cliente> provincias = new ArrayList<Cliente>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, nombre, apellido1, apellido2, direccion, email, password, telefono, id_localidad_cliente FROM cliente";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Cliente provincia = new Cliente();
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
        this.email=rs.getString("email");
        provincia.setEmail(this.email);
        this.password=rs.getString("password");
        provincia.setPassword(this.password);
        this.telefono=rs.getString("telefono");
        provincia.setTelefono(this.telefono);
        this.id_localidad_cliente=rs.getInt("id_localidad_cliente");
        provincia.setId_localidad_cliente(this.id_localidad_cliente);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }
    
}
