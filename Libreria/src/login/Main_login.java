/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tables.Administracion;
import tables.Cliente;
import views.JF_Administracion;
import views.Main_view;

/**
 *
 * @author Sebastian
 */

public class Main_login extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    Cliente cliente = new Cliente();
    Administracion admin = new Administracion();
    Main_view view = new Main_view();
    JF_Administracion view_admin = new JF_Administracion();
    public Main_login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_iniciar_sesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_contraseña = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtp_pass = new javax.swing.JPasswordField();
        btn_crear_cuenta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnl_move_brown = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setMinimumSize(new java.awt.Dimension(789, 550));
        jPanel4.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(406, 550));
        jPanel2.setLayout(null);

        btn_iniciar_sesion.setBackground(new java.awt.Color(255, 255, 255));
        btn_iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniciar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_iniciar_sesion.png"))); // NOI18N
        btn_iniciar_sesion.setBorder(null);
        btn_iniciar_sesion.setBorderPainted(false);
        btn_iniciar_sesion.setContentAreaFilled(false);
        btn_iniciar_sesion.setDefaultCapable(false);
        btn_iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_sesionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_iniciar_sesion);
        btn_iniciar_sesion.setBounds(86, 357, 221, 57);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        lbl_contraseña.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lbl_contraseña.setText("Contraseña");
        lbl_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_contraseñaMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_contraseña);
        lbl_contraseña.setBounds(40, 120, 100, 20);

        txt_pass.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(41, 32, 18));
        txt_pass.setText("Contraseña");
        txt_pass.setBorder(null);
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passMouseClicked(evt);
            }
        });
        jPanel3.add(txt_pass);
        txt_pass.setBounds(40, 150, 290, 20);

        txt_correo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(41, 32, 18));
        txt_correo.setText("Correo Electrónico");
        txt_correo.setBorder(null);
        txt_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_correoMouseClicked(evt);
            }
        });
        jPanel3.add(txt_correo);
        txt_correo.setBounds(40, 30, 290, 20);

        jSeparator1.setForeground(new java.awt.Color(41, 32, 18));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(40, 50, 330, 2);

        jSeparator2.setForeground(new java.awt.Color(41, 32, 18));
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(39, 140, 330, 10);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(340, 20, 24, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlock.png"))); // NOI18N
        jPanel3.add(jLabel10);
        jLabel10.setBounds(340, 110, 24, 25);

        txtp_pass.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtp_pass.setBorder(null);
        txtp_pass.setOpaque(false);
        txtp_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtp_passMouseClicked(evt);
            }
        });
        jPanel3.add(txtp_pass);
        txtp_pass.setBounds(40, 120, 290, 22);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 162, 406, 177);

        btn_crear_cuenta.setBackground(new java.awt.Color(255, 255, 255));
        btn_crear_cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_crear_cuenta.png"))); // NOI18N
        btn_crear_cuenta.setBorder(null);
        btn_crear_cuenta.setContentAreaFilled(false);
        btn_crear_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_cuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_crear_cuenta);
        btn_crear_cuenta.setBounds(71, 440, 255, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter (2).png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(235, 25, 64, 64);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(54, 25, 147, 64);

        btn_close.setBackground(new java.awt.Color(255, 255, 255));
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close.setBorder(null);
        btn_close.setContentAreaFilled(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_close);
        btn_close.setBounds(364, 0, 42, 33);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(380, 0, 410, 550);

        jPanel1.setBackground(new java.awt.Color(41, 32, 18));
        jPanel1.setMinimumSize(new java.awt.Dimension(365, 550));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Erick Daniel Villafuerte Zavala");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 154, 345, 60);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Integrantes");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 37, 345, 60);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sebastián Valente García García");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 364, 345, 60);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 246, 345, 107);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(0, 0, 365, 550);

        pnl_move_brown.setBackground(new java.awt.Color(255, 255, 255));
        pnl_move_brown.setOpaque(false);
        pnl_move_brown.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_move_brownMouseDragged(evt);
            }
        });
        pnl_move_brown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_move_brownMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_move_brownLayout = new javax.swing.GroupLayout(pnl_move_brown);
        pnl_move_brown.setLayout(pnl_move_brownLayout);
        pnl_move_brownLayout.setHorizontalGroup(
            pnl_move_brownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnl_move_brownLayout.setVerticalGroup(
            pnl_move_brownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(pnl_move_brown);
        pnl_move_brown.setBounds(0, 0, 750, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
       java.lang.System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void pnl_move_brownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_move_brownMousePressed
                 mousepX=evt.getX();
       mousepY=evt.getY();
    }//GEN-LAST:event_pnl_move_brownMousePressed

    private void pnl_move_brownMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_move_brownMouseDragged
       Point point = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(point.x-mousepX, point.y-mousepY);
    }//GEN-LAST:event_pnl_move_brownMouseDragged

    private void txt_correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_correoMouseClicked
        if (txt_correo.getText().equals("Correo Electrónico"))
                         txt_correo.setText("");

    }//GEN-LAST:event_txt_correoMouseClicked

    private void txt_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseClicked
         if (txt_pass.getText().equals("Contraseña"))
                         txt_pass.setText("");
    }//GEN-LAST:event_txt_passMouseClicked

    private void txtp_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtp_passMouseClicked
        if (lbl_contraseña.getText().equals("Contraseña"))
                         lbl_contraseña.setText("");

    }//GEN-LAST:event_txtp_passMouseClicked

    private void lbl_contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_contraseñaMouseClicked
             if (lbl_contraseña.getText().equals("Contraseña"))
                         lbl_contraseña.setText("");

    }//GEN-LAST:event_lbl_contraseñaMouseClicked

    private void btn_iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_sesionActionPerformed
        
        if(txt_correo.getText().isEmpty() || txtp_pass.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "El correo o la contraseña no son correctas");
        
        else{
            try {
                String email_admin = admin.select_email(txt_correo.getText());
                String pass_admin = admin.select_pass(txtp_pass.getText());
                String email = cliente.select_email(txt_correo.getText());
                String pass = cliente.select_pass(txtp_pass.getText());
                System.out.println(txt_correo.getText().equals(email));

                        if (txt_correo.getText().equals(email)  & txtp_pass.getText().equals(pass) ){

                            int id_cliente = cliente.select_id(txt_correo.getText());
                            this.cliente=cliente.select_one_cliente(id_cliente);
                            dispose();
                            Main_view main_view = new Main_view(this.cliente);
                            main_view.setVisible(true);
                            
                        }
                        else if(txt_correo.getText().equals(email_admin) & txtp_pass.getText().equals(pass_admin)){
                           dispose();
                            view.setVisible(true);
                            view_admin.setVisible(true);
                        }
                        else
                           JOptionPane.showMessageDialog(null, "El correo o la contraseña no son correctas"); 
  
            } catch (SQLException ex) {
                Logger.getLogger(Main_login.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
    }//GEN-LAST:event_btn_iniciar_sesionActionPerformed

    private void btn_crear_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_cuentaActionPerformed
        try {
            JF_Crear_cuenta cuenta_nueva = new JF_Crear_cuenta();
            cuenta_nueva.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Main_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_crear_cuentaActionPerformed

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
            java.util.logging.Logger.getLogger(Main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_crear_cuenta;
    private javax.swing.JButton btn_iniciar_sesion;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JPanel pnl_move_brown;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JPasswordField txtp_pass;
    // End of variables declaration//GEN-END:variables
}
