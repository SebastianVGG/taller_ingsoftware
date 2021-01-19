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
public class Libro {
    
    private int id;
    private String titulo;
    private String descripcion;
    private String isbn;
    private String año_publicacion;
    private String paginas;
    private String idioma;
    private int id_autor;
    private int id_editorial;

    public Libro(int id, String titulo, String descripcion, String isbn, String año_publicacion, String paginas, String idioma, int id_autor, int id_editorial) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.isbn = isbn;
        this.año_publicacion = año_publicacion;
        this.paginas = paginas;
        this.idioma=idioma;
        this.id_autor = id_autor;
        this.id_editorial = id_editorial;
    }

    public Libro(String titulo, String descripcion, String isbn, String año_publicacion,String paginas, String idioma, int id_autor, int id_editorial) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.isbn = isbn;
        this.año_publicacion = año_publicacion;
         this.paginas = paginas;
        this.idioma=idioma;
        this.id_autor = id_autor;
        this.id_editorial = id_editorial;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Libro() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(String año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public int getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(int id_editorial) {
        this.id_editorial = id_editorial;
    }
    
    public void insert_libro() throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("INSERT INTO `libro` (`id`, `titulo`, `descripcion`, `isbn`, `año_publicacion`, paginas, idioma, `id_autor`, `id_editorial`) VALUES "
                + "(NULL, '"+this.titulo+"','"+this.descripcion+"','"+this.isbn+"','"+this.año_publicacion+"','"+this.paginas+"','"+this.idioma+"','"+this.id_autor+","+this.id_editorial+")"

                        + "");
        JOptionPane.showMessageDialog(null, "Nuevo libro");  
        statement.close();  
        myConnection.close();
    }
    
    public void delete_libro(int id) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("DELETE FROM libro WHERE id="+id);
        JOptionPane.showMessageDialog(null, "libro eliminado");  
        statement.close();  
        myConnection.close();
    }
    
    public void update_libro(int id, String titulo, String descripcion,String isbn, String año_publicacion,String paginas, String idioma, int id_autor, int id_editorial) throws SQLException{
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        statement.executeUpdate("UPDATE libro SET titulo='"+titulo+"', descripcion='"+descripcion+"',"
                + "isbn='"+isbn+"', año_publicacion='"+año_publicacion+"',paginas='"+paginas+"',idioma='"+idioma+"',id_autor="+id_autor+",id_editorial="+id_editorial+" WHERE id="+id);
        JOptionPane.showMessageDialog(null, "libro actualizado");  
        statement.close();  
        myConnection.close();
    }
    
    public Libro select_one_libro(int id) throws SQLException{
        Libro provincia = new Libro();
        Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
        Statement statement = myConnection.createStatement();  
        String sql= "SELECT id, titulo, descripcion, isbn, año_publicacion,paginas,idioma, id_autor, id_editorial  FROM libro WHERE id="+id;
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.titulo=rs.getString("titulo");
        provincia.setTitulo(this.titulo);
        this.descripcion=rs.getString("descripcion");
        provincia.setDescripcion(this.descripcion);
        this.isbn=rs.getString("isbn");
        provincia.setIsbn(this.isbn);
        this.año_publicacion=rs.getString("año_publicacion");
        provincia.setAño_publicacion(this.año_publicacion);
        this.paginas=rs.getString("paginas");
        provincia.setPaginas(this.paginas);
        this.idioma=rs.getString("idioma");
        provincia.setIdioma(this.idioma);
        this.id_autor=rs.getInt("id_autor");
        provincia.setId_autor(this.id_autor);
        this.id_editorial=rs.getInt("id_editorial");
        provincia.setId_editorial(this.id_editorial);
        }
        statement.close();  
        myConnection.close();
        rs.close();
        return provincia;
    }
    
    
    public List<Libro> select() throws SQLException{
      List<Libro> provincias = new ArrayList<Libro>();  
      Connection myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/libreria","root", ""
                );
      Statement stmt = myConnection.createStatement(); 
      String sql = "SELECT id, titulo, descripcion, isbn, año_publicacion, paginas, idioma, id_autor, id_editorial FROM libro";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
        Libro provincia = new Libro();
        this.id=rs.getInt("id");
        provincia.setId(this.id);
        this.titulo=rs.getString("titulo");
        provincia.setTitulo(this.titulo);
        this.descripcion=rs.getString("descripcion");
        provincia.setDescripcion(this.descripcion);
        this.isbn=rs.getString("isbn");
        provincia.setIsbn(this.isbn);
        this.año_publicacion=rs.getString("año_publicacion");
        provincia.setAño_publicacion(this.año_publicacion);
        this.paginas=rs.getString("paginas");
        provincia.setPaginas(this.paginas);
        this.idioma=rs.getString("idioma");
        provincia.setIdioma(this.idioma);
        this.id_autor=rs.getInt("id_autor");
        provincia.setId_autor(this.id_autor);
        this.id_editorial=rs.getInt("id_editorial");
        provincia.setId_editorial(this.id_editorial);
        provincias.add(provincia);
        }
      
      rs.close();
      return provincias;
    }
    
}
