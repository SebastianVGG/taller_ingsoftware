/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrito;

import java.awt.Font;
import views.element_list;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tables.Cliente;
import tables.Ebook;
import tables.Libro;
import tables.Papel;

/**
 *
 * @author Sebastian
 */
public class JF_View_Carrito extends javax.swing.JFrame {

     List<List<Papel>> papeles = new ArrayList<List<Papel>>();  
     List<List<Ebook>> ebooks = new ArrayList<List<Ebook>>();  
    Cliente cliente = new Cliente();
     List<List<Libro>> libros = new ArrayList<List<Libro>>();  
     List<List<Integer>> cantidades = new ArrayList<List<Integer>>();
     List<List<String>> bools = new ArrayList<List<String>>();
     List<element_list> list = new ArrayList<element_list>();  
    float costo_total;
     String tipo;
     String tarjeta;
     int i_papel=0;
     int i_ebook=0;
     boolean info;
    public JF_View_Carrito() {
        initComponents();
    }
 
       public JF_View_Carrito( Cliente cliente, List<element_list> list) throws SQLException {
        initComponents();
        Font fuente = new Font("Monospaced", Font.PLAIN,10);
        txt_cesta.setFont(fuente);
        this.cliente=cliente;
        this.list=list;
        agregar_elementos();
        txt_cesta.setText(agregarItem_cbx());
        
        //lbl_costo_total.setText(String.valueOf(this.costo_total));
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_cesta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        btn_pagar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_costo_total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad");

        txt_cesta.setEditable(false);
        txt_cesta.setColumns(20);
        txt_cesta.setRows(5);
        jScrollPane1.setViewportView(txt_cesta);
        Font fuente = new Font("Monospaced", Font.PLAIN,10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Titulo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Importe");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Eliminar cesta");

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_pagar.setText("Pagar cesta");
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total");

        txt_costo_total.setEditable(false);
        txt_costo_total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_costo_total.setText("jTextField1");
        txt_costo_total.setBorder(null);
        txt_costo_total.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219)
                .addComponent(jLabel3)
                .addGap(83, 83, 83)
                .addComponent(jLabel4)
                .addGap(193, 193, 193)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_costo_total, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_costo_total, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(btn_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 void agregar_elementos(){
     for (int i = 0; i < this.list.size(); i++) {
        this.libros.add(this.list.get(i).getLibros());
        this.papeles.add(this.list.get(i).getPapeles());
        this.ebooks.add(this.list.get(i).getEbooks());
        this.bools.add(this.list.get(i).getBools());
        this.cantidades.add(this.list.get(i).getCantidades());
//     this.libros= this.list.get(i).getLibros();
//     this.papeles=this.list.get(i).getPapeles();
//     this.ebooks=this.list.get(i).getEbooks();
//     this.bools=this.list.get(i).getBools();
//     this.cantidades=this.list.get(i).getCantidades();
     }
 }
    boolean info_get(){
        return this.info;
    }
    
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        this.list.clear();
        this.libros.clear();
        this.papeles.clear();
        this.ebooks.clear();
        this.bools.clear();
        this.cantidades.clear();
        txt_cesta.setText("");
        txt_costo_total.setText(" 0.00");
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
        if(this.list.isEmpty())
            JOptionPane.showMessageDialog(null, "La cesta está vacía!");
        else{
        JF_Pago pago = new JF_Pago(this, true,this.cliente,this.costo_total,this.list);
        pago.setLocationRelativeTo(null);
        pago.setVisible(true);
         this.info = pago.get_info();
        if(info){
            try {
                list.clear();
                agregar_elementos();
                txt_cesta.setText(agregarItem_cbx());
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(JF_View_Carrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_btn_pagarActionPerformed

    void costo_total(){
        this.costo_total=0;
        for(int i = 0; i < this.libros.size(); i++){
        int papel=0;
        int ebook=0;
        for (int j = 0; j < this.libros.get(i).size(); j++) {
            if(this.bools.get(i).get(j).equals("Papel")){
                this.costo_total+=this.papeles.get(i).get(papel).getPrecio();
                papel+=1;
            }
            else{
                this.costo_total+=this.ebooks.get(j).get(ebook).getPrecio();
                ebook+=1;
            }
        }
        }

    }
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
            java.util.logging.Logger.getLogger(JF_View_Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_View_Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_View_Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_View_Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_View_Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_pagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_cesta;
    private javax.swing.JTextField txt_costo_total;
    // End of variables declaration//GEN-END:variables
    public String agregarItem_cbx() throws SQLException{
        String todo = "";
        for (int i = 0; i <list.size(); i++) {
            int countPapel = 0;
            int countEbook = 0;
            for (int j = 0; j < list.get(i).getLibros().size(); j++) {  
            String aux = "                                  ";
            String datos=aux;
                if(this.list.get(i).getBools().get(j).equals("Papel")){
                    datos = datos.substring(0, 4) + list.get(i).getCantidades().get(j) + aux;
                    datos = datos.substring(0, 14) + list.get(i).getLibros().get(j).getTitulo() + aux;
                    datos = datos.substring(0, 59) + (papeles.get(i).get(countPapel).getPrecio()*cantidades.get(i).get(j)) + aux;
                    datos = datos.substring(0, 81) + "Libro Fisico\n";
    //              datos+=String.valueOf(list.get(i).getCantidades().get(j)) + " "+list.get(i).getLibros().get(j).getTitulo()+" "+list.get(i).getLibros().get(j).getIsbn()+" Libro fisico \n";
                    todo += datos;
                    this.costo_total= this.costo_total + (cantidades.get(i).get(j)*papeles.get(i).get(countPapel).getPrecio());
                    countPapel += 1;
                }
                else{
                    datos = datos.substring(0, 4) + list.get(i).getCantidades().get(j) + aux;
                    datos = datos.substring(0, 14) + list.get(i).getLibros().get(j).getTitulo() + aux;
                    datos = datos.substring(0, 59) + (ebooks.get(i).get(countEbook).getPrecio()*cantidades.get(i).get(j)) + aux;
                    datos = datos.substring(0, 81) + "Libro Digital\n";
    //              datos+=String.valueOf(list.get(i).getCantidades().get(j)) + " "+list.get(i).getLibros().get(j).getTitulo()+" "+list.get(i).getLibros().get(j).getIsbn()+" Libro digital \n";
                    todo += datos;
                    this.costo_total = this.costo_total + (cantidades.get(i).get(j)*ebooks.get(i).get(countEbook).getPrecio());
                    countEbook += 1;
                }
        }
        }
        //costo_total();
        txt_costo_total.setText("" + this.costo_total);
        return todo;
    }
     
}
