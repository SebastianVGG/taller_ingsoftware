/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tables.Autor;
import tables.Ebook;
import tables.Editorial;
import tables.Libro;
import tables.Papel;



/**
 *
 * @author Sebastian
 */
public class JF_Libro extends javax.swing.JFrame {

    Autor autor = new Autor();
    Editorial editorial = new Editorial();
    JF_Papel papel = new JF_Papel();
    JF_Ebook ebook = new JF_Ebook();
    Libro libro = new Libro();
    
    public JF_Libro() throws SQLException {
        initComponents();
        agregarItem_cbx();
        agregarItem_tbl();
        restringir();
    }

    public void get_libro_dates(int id_libro) throws SQLException{
        
        Libro datos_libro = libro.select_one_libro(id_libro);
        label_id.setText(String.valueOf(datos_libro.getId()));
        txt_update_titulo.setText(datos_libro.getTitulo());
        txt_update_descripcion.setText(datos_libro.getDescripcion());
        txt_update_isbn.setText(datos_libro.getIsbn());
        txt_update_paginas.setText(datos_libro.getPaginas());
        txt_update_idioma.setText(datos_libro.getIdioma());
        chs_update_year.setValue(Integer.parseInt(datos_libro.getAño_publicacion()));
        
        
        Autor datos_autor = autor.select_one_autor(datos_libro.getId_autor());
        Editorial datos_editorial = editorial.select_one_editorial(datos_libro.getId_editorial());
        
        cbx_update_autor.setSelectedItem(datos_autor.getNombre());
        cbx_update_editorial.setSelectedItem(datos_editorial.getNombre());
    }
    
    public void refrescar() throws SQLException{
            DefaultTableModel tblModel = (DefaultTableModel) tbl_libro.getModel();
            tblModel.setRowCount(0);
            agregarItem_tbl();
        txt_update_titulo.setText("");
        txt_insert_titulo.setText("");
        txt_update_idioma.setText("");
        txt_insert_idioma.setText("");
        txt_update_paginas.setText("");
        txt_insert_paginas.setText("");
        txt_update_descripcion.setText("");
        txt_insert_direccion.setText("");
        txt_update_isbn.setText("");
        txt_insert_isbn.setText("");
        label_id.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_insert_titulo = new javax.swing.JTextField();
        txt_insert_direccion = new javax.swing.JTextField();
        cbx_insert_autor = new javax.swing.JComboBox<>();
        btn_insert = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_insert_isbn = new javax.swing.JTextField();
        cbx_insert_editorial = new javax.swing.JComboBox<>();
        chs_insert_year = new com.toedter.calendar.JYearChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_insert_paginas = new javax.swing.JTextField();
        txt_insert_idioma = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_libro = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_update_titulo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbx_update_autor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbx_update_editorial = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_update_isbn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_update_descripcion = new javax.swing.JTextArea();
        chs_update_year = new com.toedter.calendar.JYearChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_update_paginas = new javax.swing.JTextField();
        txt_update_idioma = new javax.swing.JTextField();
        label_id = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btn_refrescar1 = new javax.swing.JButton();
        btn_update1 = new javax.swing.JButton();
        btn_delete1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1065, 600));
        setPreferredSize(new java.awt.Dimension(1065, 600));
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1068, 561));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1063, 533));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMinimumSize(new java.awt.Dimension(519, 461));

        jLabel2.setText("Descripcion");

        jLabel1.setText("Titulo");

        btn_insert.setText("Insert");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        jLabel4.setText("isbn");

        jLabel5.setText("Año de publicacion");

        jLabel6.setText("Autor");

        jLabel7.setText("Editorial");

        jLabel3.setText("Paginas");

        jLabel15.setText("Idioma");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_insert_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_insert_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(chs_insert_year, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1))
                            .addComponent(jLabel15)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_insert_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(txt_insert_titulo)
                            .addComponent(txt_insert_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_insert_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_insert_isbn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_insert_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_insert_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_insert_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(chs_insert_year, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_insert_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_insert_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbx_insert_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_insert_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("AGREGAR LIBRO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar libro", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_libro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Descripcion", "isbn", "Año de publicacion", "Páginas", "Idioma", "Autor", "Editorial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_libro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_libroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_libro);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("ID");

        jLabel9.setText("Titulo");

        jLabel10.setText("Autor");

        jLabel11.setText("Editorial");

        jLabel12.setText("Descripcion");

        jLabel13.setText("isbn");

        jLabel14.setText("Año de publicacion");

        txt_update_descripcion.setColumns(20);
        txt_update_descripcion.setRows(5);
        txt_update_descripcion.setLineWrap(true);
        jScrollPane2.setViewportView(txt_update_descripcion);

        jLabel16.setText("Páginas");

        jLabel17.setText("Idioma");

        label_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        label_id.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(30, 30, 30)
                        .addComponent(chs_update_year, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_update_isbn)
                            .addComponent(txt_update_idioma)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_update_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_update_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(label_id))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_update_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_update_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_update_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_update_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_update_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_update_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbx_update_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbx_update_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chs_update_year, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_refrescar1.setText("Refrescar");
        btn_refrescar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescar1ActionPerformed(evt);
            }
        });

        btn_update1.setText("Update");
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update1ActionPerformed(evt);
            }
        });

        btn_delete1.setText("Delete");
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refrescar1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_refrescar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar libro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
            if(label_id.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "No has seleccionado un campo");  
            else{
        try {
            List <Autor> autor_select = autor.select_all();
            List <Editorial> editorial_select = editorial.select_editorial();
            
            int r = tbl_libro.getSelectedRow();
            int id_libro = (int) tbl_libro.getValueAt(r, 0);
            
            int cbx_id_autor = cbx_update_autor.getSelectedIndex();
            int cbx_id_editorial = cbx_update_editorial.getSelectedIndex();
            int id_autor_libro = autor_select.get(cbx_id_autor).getId();
            int id_editorial_libro = editorial_select.get(cbx_id_editorial).getId();
            
            String titulo = txt_update_titulo.getText();
            String descripcion = txt_update_descripcion.getText();
            String isbn = txt_update_isbn.getText();
            String paginas = txt_update_paginas.getText();
            String idioma = txt_update_idioma.getText();
            String año = String.valueOf(chs_update_year.getYear());

            if(titulo.isEmpty() || descripcion.isEmpty() || isbn.isEmpty() || paginas.isEmpty() || idioma.isEmpty() || año.isEmpty())
                    JOptionPane.showMessageDialog(null, "Dejaste algún campo vacío, tienes que llenarlo");  
            else{
            boolean resultado;
            try {
                Integer.parseInt(paginas);
                resultado = true;
                char [] isbn2 = isbn.toCharArray();
                    for (int i = 0; i < isbn2.length; i++) {
                        if(!Character.isDigit(isbn2[i]))
                            resultado = false;
                    }

        } catch (NumberFormatException excepcion) { 
             resultado = false;
        }
            if(resultado){     
            
            libro.update_libro(id_libro, titulo, descripcion, isbn, año,paginas,idioma, id_autor_libro, id_editorial_libro);
            refrescar();
            }else
                 JOptionPane.showMessageDialog(null, "Revisa la información, el tipo de dato es incorrecto");  
            }
        } catch (SQLException ex) {
            Logger.getLogger(JF_Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
            if(label_id.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "No has seleccionado un campo");  
            else{
        try {
            int r = tbl_libro.getSelectedRow();
            int id_libro = (int) tbl_libro.getValueAt(r, 0);
            libro.delete_libro(id_libro);
            refrescar();
            label_id.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(JF_Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_refrescar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescar1ActionPerformed
        try {

            refrescar();
        } catch (SQLException ex) {
            Logger.getLogger(JF_Localidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_refrescar1ActionPerformed

    private void tbl_libroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_libroMouseClicked
         try {
            int r = tbl_libro.getSelectedRow();
            int id_libro = (int) tbl_libro.getValueAt(r, 0);
            get_libro_dates(id_libro);
        } catch (SQLException ex) {
            Logger.getLogger(JF_Localidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_libroMouseClicked

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        
        try {
            List <Autor> autor_select = autor.select_all();
            List <Editorial> editorial_select = editorial.select_editorial();
            

            String titulo = txt_insert_titulo.getText();
            String descripcion = txt_insert_direccion.getText();
            String isbn = txt_insert_isbn.getText();
            String paginas = txt_insert_paginas.getText();
            String idioma = txt_insert_idioma.getText();
            String año = String.valueOf(chs_insert_year.getYear());
            
             
            if(titulo.isEmpty() || descripcion.isEmpty() || isbn.isEmpty() || paginas.isEmpty() || idioma.isEmpty() || año.isEmpty())
                    JOptionPane.showMessageDialog(null, "Dejaste algún campo vacío, tienes que llenarlo");  
            else{
            boolean resultado;
            try {
                Integer.parseInt(paginas);
                resultado = true;
                char [] isbn2 = isbn.toCharArray();
                    for (int i = 0; i < isbn2.length; i++) {
                        if(!Character.isDigit(isbn2[i]))
                            resultado = false;
                    }

        } catch (NumberFormatException excepcion) { 
             resultado = false;
        }
            if(resultado){
            int cbx_id_autor = cbx_insert_autor.getSelectedIndex();
            int cbx_id_editorial = cbx_insert_editorial.getSelectedIndex();
            int id_autor_libro = autor_select.get(cbx_id_autor).getId();
            int id_editorial_libro = editorial_select.get(cbx_id_editorial).getId();
            
            Libro libro = new Libro(titulo,descripcion, isbn, año, paginas,idioma,id_autor_libro, id_editorial_libro);
            int id_libro = libro.insert_libro();
             JF_Libro_papel papel_libro = new JF_Libro_papel(id_libro);
             JF_Libro_ebook ebook_libro = new JF_Libro_ebook(id_libro);
            String[] options = new String[] {"Papel", "Ebook", "Ambos"};
            int response = JOptionPane.showOptionDialog(null, "Será libro formato fisico, ebook o ambos", "Agregar formato",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options, options[0]);
            if(response == 0)
                papel_libro.setVisible(true);
            if(response==1)
                ebook_libro.setVisible(true);
            if(response==2){
                papel_libro.setVisible(true);
                ebook_libro.setVisible(true);
            }
            }
            else
                JOptionPane.showMessageDialog(null, "Revisa la información, el tipo de dato es incorrecto");  
            }
        } catch (SQLException ex) {
            Logger.getLogger(JF_Localidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JF_Libro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JF_Libro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete1;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_refrescar1;
    private javax.swing.JButton btn_update1;
    private javax.swing.JComboBox<String> cbx_insert_autor;
    private javax.swing.JComboBox<String> cbx_insert_editorial;
    private javax.swing.JComboBox<String> cbx_update_autor;
    private javax.swing.JComboBox<String> cbx_update_editorial;
    private com.toedter.calendar.JYearChooser chs_insert_year;
    private com.toedter.calendar.JYearChooser chs_update_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField label_id;
    private javax.swing.JTable tbl_libro;
    private javax.swing.JTextField txt_insert_direccion;
    private javax.swing.JTextField txt_insert_idioma;
    private javax.swing.JTextField txt_insert_isbn;
    private javax.swing.JTextField txt_insert_paginas;
    private javax.swing.JTextField txt_insert_titulo;
    private javax.swing.JTextArea txt_update_descripcion;
    private javax.swing.JTextField txt_update_idioma;
    private javax.swing.JTextField txt_update_isbn;
    private javax.swing.JTextField txt_update_paginas;
    private javax.swing.JTextField txt_update_titulo;
    // End of variables declaration//GEN-END:variables
    public void agregarItem_cbx() throws SQLException{
        
        List <Autor> autor_select = autor.select_all();
        List <Editorial> editorial_select = editorial.select_editorial();
//        ArrayList<String> list_autor= new ArrayList<String>();
//        ArrayList<String> list_editorial= new ArrayList<String>();
//        
//        for (int i = 0; i < autor_select.size(); i++) 
//             list_autor.add(autor_select.get(i).getNombre());
//        Collections.sort(list_autor);
//        
//           for (int i = 0; i < editorial_select.size(); i++) 
//             list_editorial.add(editorial_select.get(i).getNombre());
//        Collections.sort(list_editorial);
        
        for (int i = 0; i < autor_select.size(); i++) {
            cbx_insert_autor.addItem(autor_select.get(i).getNombre());
            cbx_update_autor.addItem(autor_select.get(i).getNombre());
        } 
        
        for (int i = 0; i < editorial_select.size(); i++) {
            cbx_insert_editorial.addItem(editorial_select.get(i).getNombre());
            cbx_update_editorial.addItem(editorial_select.get(i).getNombre());
        }
        
    }
    
    public void agregarItem_tbl() throws SQLException{
        DefaultTableModel tblModel = (DefaultTableModel) tbl_libro.getModel();
        List <Libro> libro_select = libro.select();
        Object[] column = new Object[9];
        
        for (int i = 0; i < libro_select.size(); i++){
            
            column[0] = libro_select.get(i).getId();
            column[1] = libro_select.get(i).getTitulo();
            column[2] = libro_select.get(i).getDescripcion();
            column[3] = libro_select.get(i).getIsbn();
            column[4] = libro_select.get(i).getAño_publicacion();
            column[5] = libro_select.get(i).getPaginas();
            column[6] = libro_select.get(i).getIdioma();
            column[7] = libro_select.get(i).getId_autor();
            column[8] = libro_select.get(i).getId_editorial();
  
            
            tblModel.addRow(column);
            
            }
        
    } 

    void restringir(){
            RestrictedTextField restricted1 = new RestrictedTextField(txt_insert_isbn);
            RestrictedTextField restricted2 = new RestrictedTextField(txt_insert_paginas);
            RestrictedTextField restricted4 = new RestrictedTextField(txt_update_isbn);
            RestrictedTextField restricted5 = new RestrictedTextField(txt_update_paginas);
            restricted1.setLimit(13);
            restricted2.setLimit(4);
            restricted4.setLimit(13);
            restricted5.setLimit(4);
    }
}
