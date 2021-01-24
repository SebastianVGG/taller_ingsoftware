/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;



import java.util.ArrayList;
import java.util.List;
import tables.Ebook;
import tables.Libro;
import tables.Papel;

public class element_list {
     List<Papel> papeles = new ArrayList<Papel>();  
     List<Ebook> ebooks = new ArrayList<Ebook>();  
     element_list list;

    public element_list getList() {
        return list;
    }

    public void setList(element_list list) {
        this.list = list;
    }

    public List<Papel> getPapeles() {
        return papeles;
    }

    public void setPapeles(List<Papel> papeles) {
        this.papeles = papeles;
    }

    public List<Ebook> getEbooks() {
        return ebooks;
    }

    public void setEbooks(List<Ebook> ebooks) {
        this.ebooks = ebooks;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(List<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    public List<String> getBools() {
        return bools;
    }

    public void setBools(List<String> bools) {
        this.bools = bools;
    }
     List<Libro> libros = new ArrayList<Libro>();  
     List<Integer> cantidades = new ArrayList<Integer>();
     List<String> bools = new ArrayList<String>();
     
   void agregar_papel(Papel papel, Libro libro,String bool, int cantidad){
            this.libros.add(libro);
            this.papeles.add(papel);
            this.bools.add(bool);
            this.cantidades.add(cantidad);
    }
    
    void agregar_ebook(Ebook ebook, Libro libro,String bool, int cantidad){
           this.libros.add(libro);
            this.ebooks.add(ebook);
            this.bools.add(bool);
            this.cantidades.add(cantidad);
    } 
}
