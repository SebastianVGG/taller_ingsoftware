/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class Cesta {
    
    private int id;
    private Date fecha_compra;
    private String fecha_compraS;
    private int cantidad;
    private int id_cliente;
    private int id_libro;
    
    public Cesta(Date fecha_compra,int cantidad, int id_cliente, int id_libro){
        this.fecha_compra = fecha_compra;
        this.cantidad=cantidad;
        this.id_cliente = id_cliente;
        this.id_libro = id_libro;
    }

    public Cesta(String fecha_compraS, int cantidad, int id_cliente, int id_libro) {
        this.fecha_compraS = fecha_compraS;
        this.cantidad = cantidad;
        this.id_cliente = id_cliente;
        this.id_libro = id_libro;
    }
    
    public Cesta(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getFecha_compraS() {
        return fecha_compraS;
    }

    public void setFecha_compraS(String fecha_compraS) {
        this.fecha_compraS = fecha_compraS;
    }
    
    
   public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }
    
    public int insert_cesta_s() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        String SQL_INSERT = "INSERT INTO cesta (id, fecha_compra, cantidad, id_cliente, id_libro) VALUES (NULL, '"+this.fecha_compraS+"',"+this.cantidad+","+this.id_cliente+","+this.id_libro+")";
        PreparedStatement statement = myConnection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
        statement.execute();
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()) {
            this.id = rs.getInt(1);
        }
        statement.close();  
        myConnection.close();
        return this.id;
    }
    
       public int insert_cesta() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        String SQL_INSERT = "INSERT INTO cesta (id, fecha_compra, cantidad, id_cliente, id_libro) VALUES (NULL, '"+this.fecha_compra+"',"+this.cantidad+","+this.id_cliente+","+this.id_libro+")";
        PreparedStatement statement = myConnection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
        statement.execute();
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()) {
            this.id = rs.getInt(1);
        }
        statement.close();  
        myConnection.close();
        return this.id;
    }
    
    
    public void delete_cesta(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM cesta WHERE id="+id);
        JOptionPane.showMessageDialog(null, "cesta eliminado");  
        statement.close();  
        myConnection.close();
    }
    
    public void update_cesta(int id,Date fecha_compra, int cantidad1,int id_cliente, int id_libro) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE cesta SET fecha_compra='"+fecha_compra+"', cantidad="+cantidad1+", id_cliente="+id_cliente+", id_libro="+id_libro+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "cesta actualizada");  
        statement.close();  
        myConnection.close();
    }
    
    public Cesta select_one_cesta(int id) throws SQLException{
        Cesta provincia = new Cesta();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, fecha_compra, cantidad, id_cliente, id_libro FROM cesta WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.fecha_compra=rs.getDate("fecha_compra");
        provincia.setFecha_compra(this.fecha_compra);
        this.cantidad=rs.getInt("cantidad");
        provincia.setCantidad(this.cantidad);
        this.id_cliente=rs.getInt("id_cliente");
        provincia.setId_cliente(this.id_cliente);
        this.id_libro=rs.getInt("id_libro");
        provincia.setId_libro(this.id_libro);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    public List<Cesta> select() throws SQLException{
      List<Cesta> provincias = new ArrayList<Cesta>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, fecha_compra, cantidad, id_cliente, id_libro FROM cesta";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Cesta provincia = new Cesta();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.fecha_compra=rs.getDate("fecha_compra");
        provincia.setFecha_compra(this.fecha_compra);
        this.cantidad=rs.getInt("cantidad");
        provincia.setCantidad(this.cantidad);
        this.id_cliente=rs.getInt("id_cliente");
        provincia.setId_cliente(this.id_cliente);
        this.id_libro=rs.getInt("id_libro");
        provincia.setId_libro(this.id_libro);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }

    
}
