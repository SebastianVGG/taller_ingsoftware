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
public class Editorial {
    
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String url;
    private int id_localidad_editorial;

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

    public int getId_localidad_editorial() {
        return id_localidad_editorial;
    }

    public void setId_localidad_editorial(int id_localidad_editorial) {
        this.id_localidad_editorial = id_localidad_editorial;
    }
    
      public void insert_editorial() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO editorial "
                + "(id, nombre, direccion, telefono, url, id_localidad_editorial)"
                + " VALUES "
                + "(NULL, '"+this.nombre+"', '"+this.direccion+"', '"+this.telefono+"', '"+this.url+"', "+this.id_localidad_editorial+" )"

                        + "");
        JOptionPane.showMessageDialog(null, "Nueva editorial");  
        statement.close();  
        myConnection.close();
    }
    
    public void delete_editorial(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM editorial WHERE id="+id);
        JOptionPane.showMessageDialog(null, "editorial eliminada");  
        statement.close();  
        myConnection.close();
    }
    public void update_editorial(int id, String nombre, String direccion, String telefono, String url,int id_localidad_editorial) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE editorial SET "
                + "nombre='"+nombre+"', direccion='"+direccion+"',"
                        + " telefono='"+telefono+"', url='"+url+"', id_localidad_editorial="+id_localidad_editorial+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "editorial actualizada");  
        statement.close();  
        myConnection.close();
    }
    
    public Editorial select_one_editorial(int id) throws SQLException{
        Editorial provincia = new Editorial();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, nombre, direccion, telefono, url, id_localidad_editorial FROM editorial WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.nombre=rs.getString("nombre");
        provincia.setNombre(this.nombre);
        this.direccion=rs.getString("direccion");
        provincia.setDireccion(this.direccion);
        this.telefono=rs.getString("telefono");
        provincia.setTelefono(this.telefono);
        this.url=rs.getString("url");
        provincia.setUrl(this.url);
        this.id_localidad_editorial=rs.getInt("id_localidad_editorial");
        provincia.setId_localidad_editorial(this.id_localidad_editorial);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    
    public List<Editorial> select_editorial() throws SQLException{
      List<Editorial> provincias = new ArrayList<Editorial>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, nombre, direccion, telefono, url, id_localidad_editorial FROM editorial";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Editorial provincia = new Editorial();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.nombre=rs.getString("nombre");
        provincia.setNombre(this.nombre);
        this.direccion=rs.getString("direccion");
        provincia.setDireccion(this.direccion);
        this.telefono=rs.getString("telefono");
        provincia.setTelefono(this.telefono);
        this.url=rs.getString("url");
        provincia.setUrl(this.url);
        this.id_localidad_editorial=rs.getInt("id_localidad_editorial");
        provincia.setId_localidad_editorial(this.id_localidad_editorial);
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
