/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrito;

import Carrito.JF_Pago_credit;
import Carrito.JF_Pago_debit;
import Carrito.JF_Pago_paypal;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tables.Cliente;
import views.element_list;
public class JF_Pago extends javax.swing.JDialog {

    List<element_list> list = new ArrayList<element_list>();  
    Cliente cliente = new Cliente();
    int costo_total;
    boolean info;
    
    public JF_Pago(java.awt.Frame parent, boolean modal,Cliente cliente, int costo_total,List<element_list> list) {
        super(parent, modal);
         initComponents();
        this.cliente=cliente;
        this.costo_total=costo_total;
        this.list=list;
    }
    public JF_Pago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rbx_debit = new javax.swing.JRadioButton();
        rbx_credit = new javax.swing.JRadioButton();
        rbx_paypal = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta-de-credito.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 10, 64, 55);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TARJETA DE CRÉDITO");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(0, 30, 350, 40);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(60, 40, 350, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/debit_Card.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 140, 64, 55);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TARJETA DE DÉBITO");
        jPanel8.add(jLabel7);
        jLabel7.setBounds(0, 30, 340, 40);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(60, 170, 350, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paypal (2).png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(210, 270, 64, 64);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PAYPAL");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(0, 30, 350, 40);

        jPanel1.add(jPanel9);
        jPanel9.setBounds(60, 310, 350, 70);

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 400, 140, 30);

        rbx_debit.setContentAreaFilled(false);
        rbx_debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbx_debitActionPerformed(evt);
            }
        });
        jPanel1.add(rbx_debit);
        rbx_debit.setBounds(20, 190, 21, 21);

        rbx_credit.setContentAreaFilled(false);
        rbx_credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbx_creditActionPerformed(evt);
            }
        });
        jPanel1.add(rbx_credit);
        rbx_credit.setBounds(20, 70, 20, 21);

        rbx_paypal.setContentAreaFilled(false);
        rbx_paypal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbx_paypalActionPerformed(evt);
            }
        });
        jPanel1.add(rbx_paypal);
        rbx_paypal.setBounds(20, 330, 20, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
boolean get_info(){
    return this.info;
}
    private void rbx_debitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbx_debitActionPerformed
        JF_Pago_debit pago = new JF_Pago_debit(this, true,this.costo_total,this.list,this.cliente);
        if(rbx_debit.isSelected()){
            pago.setLocationRelativeTo(null);
            pago.setVisible(true);
        }else{
            pago.setVisible(false);
        }
    }//GEN-LAST:event_rbx_debitActionPerformed

    private void rbx_creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbx_creditActionPerformed
        JF_Pago_credit pago = new JF_Pago_credit(this, true,this.costo_total,this.list,this.cliente);
        if(rbx_credit.isSelected()){
            pago.setLocationRelativeTo(null);
            pago.setVisible(true);
        }else{
            pago.setVisible(false);
        }
    }//GEN-LAST:event_rbx_creditActionPerformed

    private void rbx_paypalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbx_paypalActionPerformed
        JF_Pago_paypal pago = new JF_Pago_paypal(this, true,this.costo_total,this.list,this.cliente);
        info=pago.get_info();
        if(rbx_paypal.isSelected()){
            pago.setLocationRelativeTo(null);
            pago.setVisible(true);
            if(info)
                dispose();
        }else{
            pago.setVisible(false);
        }
    }//GEN-LAST:event_rbx_paypalActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JF_Pago dialog = new JF_Pago(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton rbx_credit;
    private javax.swing.JRadioButton rbx_debit;
    private javax.swing.JRadioButton rbx_paypal;
    // End of variables declaration//GEN-END:variables
}
