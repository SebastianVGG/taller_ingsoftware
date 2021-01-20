/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Carrito.JF_View_Libro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tables.Cliente;
import tables.Libro;

/**
 *
 * @author Sebastian
 */
public class Main_view extends javax.swing.JFrame {

    Libro libros = new Libro();
    Cliente cliente = new Cliente();
    
    public Main_view() {
        initComponents();
    }
        public Main_view(Cliente cliente) {
        initComponents();
        this.cliente=cliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        pnl_1 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        lbl_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 238, 218));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(120, 79, 37), 20, true));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ERIAN LIBRARY");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 0), 10, true));

        jScrollPane1.setBackground(new java.awt.Color(251, 238, 218));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel5.setBackground(new java.awt.Color(251, 238, 218));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 12));
        jPanel5.setDoubleBuffered(false);
        jPanel5.setEnabled(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 800));

        pnl_1.setBackground(new java.awt.Color(251, 238, 218));

        btn_1.setBackground(new java.awt.Color(251, 238, 218));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Harry Potter_La piedra filosofal.jpg"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        lbl_1.setBackground(new java.awt.Color(251, 238, 218));
        lbl_1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1.setText("Harry Potter y la piedra filosofal");
        lbl_1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_1.setAutoscrolls(true);
        lbl_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_1.setOpaque(true);

        javax.swing.GroupLayout pnl_1Layout = new javax.swing.GroupLayout(pnl_1);
        pnl_1.setLayout(pnl_1Layout);
        pnl_1Layout.setHorizontalGroup(
            pnl_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_1Layout.setVerticalGroup(
            pnl_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_1Layout.createSequentialGroup()
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(681, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel5);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        try {
            int id = libros.select_id(lbl_1.getText());
            Libro libro = libros.select_one_libro(id);
            String url = "../images/Harry Potter_La piedra filosofal.jpg";
            JF_View_Libro ver_libro = new JF_View_Libro(url,libro,this.cliente);
            ver_libro.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Main_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JPanel pnl_1;
    // End of variables declaration//GEN-END:variables
}
