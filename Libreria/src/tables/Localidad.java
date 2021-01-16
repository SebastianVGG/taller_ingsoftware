
package tables;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Localidad {
    
    private int id;
    private String nombre;
    private int id_provincia;

    public void Localidad(){
     int id = this.id;
    String nombre = this.nombre;
    int id_provincia = this.id_provincia;
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

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }
    
    public void insert_localidad() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO localidad (id, nombre, id_provincia) VALUES (NULL, '"+this.nombre+"',"+this.id_provincia+")"

                        + "");
        JOptionPane.showMessageDialog(null, "Nueva localidad");  
        statement.close();  
        myConnection.close();
    }
    
    public void delete_localidad(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM localidad WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Localidad eliminada");  
        statement.close();  
        myConnection.close();
    }
    
    public void update_localidad(int id, String nombre, int id_provincia) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE localidad SET nombre='"+nombre+"' id_localidad="+this.id_provincia+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "Localidad actualizada");  
        statement.close();  
        myConnection.close();
    }
    
    public Localidad select_one_localidad(int id) throws SQLException{
        Localidad provincia = new Localidad();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, nombre, id_provincia FROM localidad WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.nombre=rs.getString("nombre");
        provincia.setNombre(this.nombre);
        this.id_provincia=rs.getInt("id_provincia");
        provincia.setId_provincia(this.id_provincia);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    
    public List<Localidad> select() throws SQLException{
      List<Localidad> provincias = new ArrayList<Localidad>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, nombre, id_provincia FROM localidad";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         Localidad provincia = new Localidad();
         this.id  = rs.getInt("id");
         provincia.setId(this.id);
        this.nombre = rs.getString("nombre");
        provincia.setNombre(this.nombre);
        this.id_provincia = rs.getInt("id_provincia");
        provincia.setId_provincia(this.id_provincia);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }
    
    public String toString(){
        String provincia ="|"+this.id+"|"+" Nombre: "+this.nombre+" id_provincia: "+this.id_provincia;
        return provincia;
    }
    
    
}
