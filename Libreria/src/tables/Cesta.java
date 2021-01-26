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
    private int id_venta;
    private int id_papel;
    private int id_ebook;
    
    public Cesta(int id_venta,Date fecha_compra,int cantidad, int id_cliente, int id_libro, int id_papel, int id_ebook){
        this.fecha_compra = fecha_compra;
        this.cantidad=cantidad;
        this.id_cliente = id_cliente;
        this.id_libro = id_libro;
        this.id_venta=id_venta;
        this.id_papel=id_papel;
        this.id_ebook=id_ebook;
    }

    public Cesta(int id_venta,String fecha_compraS, int cantidad, int id_cliente, int id_libro, int id_papel, int id_ebook) {
        this.fecha_compraS = fecha_compraS;
        this.cantidad = cantidad;
        this.id_cliente = id_cliente;
        this.id_libro = id_libro;
        this.id_venta=id_venta;
        this.id_papel=id_papel;
        this.id_ebook=id_ebook;
        
    }

    public int getId_papel() {
        return id_papel;
    }

    public void setId_papel(int id_papel) {
        this.id_papel = id_papel;
    }

    public int getId_ebook() {
        return id_ebook;
    }

    public void setId_ebook(int id_ebook) {
        this.id_ebook = id_ebook;
    }
    
    public Cesta(){
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
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
        String SQL_INSERT = "INSERT INTO cesta (id, id_venta, fecha_compra, cantidad, id_cliente, id_libro, id_papel, id_ebook) VALUES (NULL,"+this.id_venta+", '"+this.fecha_compraS+"',"+this.cantidad+","+this.id_cliente+","+this.id_libro+","+this.id_papel+","+this.id_ebook+")";
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
    
    public int get_last_id() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
             Statement statement = myConnection.createStatement();  
            String sql = "SELECT MAX(id) from cesta";
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                this.id = rs.getInt(1);
            }
        statement.close();  
        myConnection.close();
        return this.id;
    }
    
      public int select_id_venta(int idid) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
             Statement statement = myConnection.createStatement();  
            String sql = "SELECT id_venta from cesta where id="+idid;
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                this.id_venta = rs.getInt(1);
            }
        statement.close();  
        myConnection.close();
        return this.id_venta;
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
    
    public void update_cesta(int id,int id_ventas,Date fecha_compra, int cantidad1,int id_cliente, int id_libro) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE cesta SET id_venta="+id_ventas+", fecha_compra='"+fecha_compra+"', cantidad="+cantidad1+", id_cliente="+id_cliente+", id_libro="+id_libro+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "cesta actualizada");  
        statement.close();  
        myConnection.close();
    }
    
    public void update_cesta_venta(int id,int id_ventas) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE cesta SET id_venta="+id_ventas+" WHERE id="+id);
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
      String sql = "SELECT id, id_venta, fecha_compra, cantidad, id_cliente, id_libro,id_papel,id_ebook FROM cesta";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Cesta provincia = new Cesta();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.id_venta=rs.getInt("id_venta");
        provincia.setId_venta(this.id_venta);
        this.fecha_compra=rs.getDate("fecha_compra");
        provincia.setFecha_compra(this.fecha_compra);
        this.cantidad=rs.getInt("cantidad");
        provincia.setCantidad(this.cantidad);
        this.id_cliente=rs.getInt("id_cliente");
        provincia.setId_cliente(this.id_cliente);
        this.id_libro=rs.getInt("id_libro");
        provincia.setId_libro(this.id_libro);
        this.id_papel=rs.getInt("id_papel");
        provincia.setId_papel(this.id_papel);
        this.id_ebook=rs.getInt("id_ebook");
        provincia.setId_ebook(this.id_ebook);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }

    
}
