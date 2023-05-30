
package InterfazGrafica;

import ManipulacionObjetos.TipoProdManObj;
import Clases.TipoProdObj;


import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class TipoProdFrut extends javax.swing.JFrame {
    
    private TipoProdManObj tipoProdManObj = new TipoProdManObj();
    
    private DefaultListModel listaTipoProd = new DefaultListModel(); 
    
    public TipoProdFrut() {
        initComponents();
        
        jListTiprodDesc.setModel(listaTipoProd);
        jListTiprodNum.setModel(listaTipoProd);
        
        tipoProdManObj.listarTipoProdDesc(jListTiprodDesc);
        tipoProdManObj.listarTipoProdNumm(jListTiprodNum);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPasteles = new javax.swing.JLabel();
        tablaTamPas = new javax.swing.JScrollPane();
        jListTiprodDesc = new javax.swing.JList<>();
        jButtonReg = new javax.swing.JButton();
        fieldDescTipoProd = new javax.swing.JTextField();
        btnAgregarTipProd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldElimDescTipoProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnElimTipProd = new javax.swing.JButton();
        tablaTamPas1 = new javax.swing.JScrollPane();
        jListTiprodNum = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        fieldActuTipoPu = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPasteles.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblPasteles.setText("Tipo de Producto");
        getContentPane().add(lblPasteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        tablaTamPas.setToolTipText("");
        tablaTamPas.setVerifyInputWhenFocusTarget(false);

        jListTiprodDesc.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTiprodDescValueChanged(evt);
            }
        });
        tablaTamPas.setViewportView(jListTiprodDesc);

        getContentPane().add(tablaTamPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 330, 150));

        jButtonReg.setText("REGRESAR");
        jButtonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 110, 30));

        fieldDescTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescTipoProdActionPerformed(evt);
            }
        });
        getContentPane().add(fieldDescTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 160, 30));

        btnAgregarTipProd.setText("AGREGAR");
        btnAgregarTipProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarTipProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 90, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Eliminar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 60, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 200, 170));

        fieldElimDescTipoProd.setEditable(false);
        fieldElimDescTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldElimDescTipoProdActionPerformed(evt);
            }
        });
        getContentPane().add(fieldElimDescTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 160, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tipo De Producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 140, 20));

        btnElimTipProd.setText("ELIMINAR");
        btnElimTipProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimTipProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnElimTipProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        tablaTamPas1.setToolTipText("");
        tablaTamPas1.setVerifyInputWhenFocusTarget(false);

        jListTiprodNum.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTiprodNumValueChanged(evt);
            }
        });
        tablaTamPas1.setViewportView(jListTiprodNum);

        getContentPane().add(tablaTamPas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, 150));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Tipo De Producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 140, 30));
        getContentPane().add(fieldActuTipoPu, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 290, 120, 30));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1920x1080-Fondo-de-pantalla-verde-simple.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTipProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipProdActionPerformed
        
        if(fieldDescTipoProd.getText().isEmpty()){
           
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
            
            try {
                TipoProdObj tipoProdObj= new TipoProdObj();
                
                tipoProdObj.setDescripcion(fieldDescTipoProd.getText());               
                String mensaje = tipoProdManObj.agregarUnidadMed(tipoProdObj);
                
                JOptionPane.showMessageDialog(null, mensaje);         
                
                tipoProdManObj.listarTipoProdDesc(jListTiprodDesc);
                tipoProdManObj.listarTipoProdNumm(jListTiprodNum);
                
                fieldDescTipoProd.setText("");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo completar el registro \n"+ e.getMessage() );

            }
        }
        
    }//GEN-LAST:event_btnAgregarTipProdActionPerformed

    private void fieldDescTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescTipoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDescTipoProdActionPerformed

    private void jButtonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegActionPerformed
        // TODO add your handling code here:
        
        MenuFrutAdmin menu = new MenuFrutAdmin();
        
        menu.setVisible(true);
        
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButtonRegActionPerformed

    private void fieldElimDescTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldElimDescTipoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldElimDescTipoProdActionPerformed

    private void btnElimTipProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimTipProdActionPerformed
        // TODO add your handling code here:
        
        try {
                TipoProdObj tipoProdObj= new TipoProdObj();
                tipoProdObj.setDescripcion(jListTiprodDesc.getSelectedValue());
                String  mensaje = tipoProdManObj.eliminarTipoProd(tipoProdObj);
                JOptionPane.showMessageDialog(null, mensaje);
                
                tipoProdManObj.listarTipoProdDesc(jListTiprodDesc);
                tipoProdManObj.listarTipoProdNumm(jListTiprodNum);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro \n" + e.getMessage());
            }
        
    }//GEN-LAST:event_btnElimTipProdActionPerformed

    private void jListTiprodDescValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTiprodDescValueChanged
        // TODO add your handling code here:
        
        if(jListTiprodDesc.getSelectedIndex()>-1){
            int indx = jListTiprodDesc.getSelectedIndex();
        
            jListTiprodNum.setSelectedIndex(indx);
        }
        
        fieldActuTipoPu.setText(jListTiprodDesc.getSelectedValue());
        fieldElimDescTipoProd.setText(jListTiprodDesc.getSelectedValue());
        
    }//GEN-LAST:event_jListTiprodDescValueChanged

    private void jListTiprodNumValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTiprodNumValueChanged
        // TODO add your handling code here:
        if(jListTiprodNum.getSelectedIndex()>-1){
            int indx = jListTiprodNum.getSelectedIndex();
        
            jListTiprodDesc.setSelectedIndex(indx);
        }
        
    }//GEN-LAST:event_jListTiprodNumValueChanged

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        
        if(!fieldActuTipoPu.getText().isEmpty()){
            String nuevo = fieldActuTipoPu.getText();
            
            TipoProdObj tipoProdObj= new TipoProdObj();
            tipoProdObj.setDescripcion(jListTiprodDesc.getSelectedValue());
            String  mensaje = tipoProdManObj.actualizarTipoProd(tipoProdObj, nuevo);
            JOptionPane.showMessageDialog(null, mensaje);
                
            tipoProdManObj.listarTipoProdDesc(jListTiprodDesc);
            tipoProdManObj.listarTipoProdNumm(jListTiprodNum);
            
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoProdFrut().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarTipProd;
    private javax.swing.JButton btnElimTipProd;
    private javax.swing.JTextField fieldActuTipoPu;
    private javax.swing.JTextField fieldDescTipoProd;
    private javax.swing.JTextField fieldElimDescTipoProd;
    private javax.swing.JButton jButtonReg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListTiprodDesc;
    private javax.swing.JList<String> jListTiprodNum;
    private javax.swing.JLabel lblPasteles;
    private javax.swing.JScrollPane tablaTamPas;
    private javax.swing.JScrollPane tablaTamPas1;
    // End of variables declaration//GEN-END:variables
}
