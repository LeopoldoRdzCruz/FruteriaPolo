
package InterfazGrafica;

import Clases.LoginObj;
import ManipulacionObjetos.UnidadMedManObj;
import Clases.UnidadMedObj;
import ManipulacionObjetos.LoginManObj;

import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class UnidadesMedFrut extends javax.swing.JFrame {
    
    private UnidadMedManObj unidadMedManObj = new UnidadMedManObj();
    
    private DefaultListModel listaUnidadMed = new DefaultListModel(); 
    
    private LoginManObj loginman = new LoginManObj();

    
    public UnidadesMedFrut() {
        initComponents();
        jListUnidadesMed.setModel(listaUnidadMed);
        jListUnidadesMedNUm.setModel(listaUnidadMed);
        
        unidadMedManObj.listarUnidadMedDesc(jListUnidadesMed);
        unidadMedManObj.listarUnidadMedNUmm(jListUnidadesMedNUm);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPasteles = new javax.swing.JLabel();
        tablaTamPas = new javax.swing.JScrollPane();
        jListUnidadesMed = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        fieldUnidadDesc = new javax.swing.JTextField();
        btnAgregarUnid = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fieldEliminar = new javax.swing.JTextField();
        tablaTamPas1 = new javax.swing.JScrollPane();
        jListUnidadesMedNUm = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        fieldActUniMed = new javax.swing.JTextField();
        btnActualizarUM = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPasteles.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblPasteles.setText("Unidades de Medida");
        getContentPane().add(lblPasteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        tablaTamPas.setToolTipText("");
        tablaTamPas.setVerifyInputWhenFocusTarget(false);

        jListUnidadesMed.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUnidadesMedValueChanged(evt);
            }
        });
        tablaTamPas.setViewportView(jListUnidadesMed);

        getContentPane().add(tablaTamPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 380, 240));

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 150, 40));

        fieldUnidadDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUnidadDescActionPerformed(evt);
            }
        });
        getContentPane().add(fieldUnidadDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 190, 30));

        btnAgregarUnid.setText("AGREGAR");
        btnAgregarUnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUnidActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Unidad de Medida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 130, 20));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, 190));

        fieldEliminar.setEditable(false);
        getContentPane().add(fieldEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 170, 30));

        tablaTamPas1.setToolTipText("");
        tablaTamPas1.setVerifyInputWhenFocusTarget(false);

        jListUnidadesMedNUm.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUnidadesMedNUmValueChanged(evt);
            }
        });
        tablaTamPas1.setViewportView(jListUnidadesMedNUm);

        getContentPane().add(tablaTamPas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, 240));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Unidad de Medida");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 130, 20));

        fieldActUniMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldActUniMedActionPerformed(evt);
            }
        });
        getContentPane().add(fieldActUniMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 140, 30));

        btnActualizarUM.setText("ACTUALIZAR");
        btnActualizarUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUMActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1920x1080-Fondo-de-pantalla-verde-simple.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUnidActionPerformed

        if(fieldUnidadDesc.getText().isEmpty()){
           
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
            
            try {
                UnidadMedObj unidadMedObj= new UnidadMedObj();
                
                unidadMedObj.setDescripcion(fieldUnidadDesc.getText());               
                String mensaje = unidadMedManObj.agregarUnidadMed(unidadMedObj);
                
                JOptionPane.showMessageDialog(null, mensaje);         
                
                unidadMedManObj.listarUnidadMedDesc(jListUnidadesMed);
                unidadMedManObj.listarUnidadMedNUmm(jListUnidadesMedNUm);
                
                fieldUnidadDesc.setText("");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo completar el registro \n"+ e.getMessage() );

            }
        }
        
    }//GEN-LAST:event_btnAgregarUnidActionPerformed

    private void fieldUnidadDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUnidadDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUnidadDescActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
            try {
                UnidadMedObj unidadMedObj= new UnidadMedObj();
                unidadMedObj.setDescripcion(jListUnidadesMed.getSelectedValue());
                String  mensaje = unidadMedManObj.eliminarUnidadMed(unidadMedObj);
                JOptionPane.showMessageDialog(null, mensaje);
                
                unidadMedManObj.listarUnidadMedDesc(jListUnidadesMed);
                unidadMedManObj.listarUnidadMedNUmm(jListUnidadesMedNUm);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro \n" + e.getMessage());
            }
        
     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(loginman.tipoUserPan() == 1){
            MenuFrutAdmin  menu= new MenuFrutAdmin();
            menu.setVisible(true);
            this.setVisible(false);
        }
            
        if(loginman.tipoUserPan() == 2){
            MenuFrut  menu= new MenuFrut();
            menu.setVisible(true);
            this.setVisible(false);
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jListUnidadesMedValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUnidadesMedValueChanged
        // TODO add your handling code here:
        
        if(jListUnidadesMed.getSelectedIndex()>-1){
            int indx = jListUnidadesMed.getSelectedIndex();
        
            jListUnidadesMedNUm.setSelectedIndex(indx);
        }
        
        fieldActUniMed.setText(jListUnidadesMed.getSelectedValue());
        fieldEliminar.setText(jListUnidadesMed.getSelectedValue());
        
        
        
    }//GEN-LAST:event_jListUnidadesMedValueChanged

    private void jListUnidadesMedNUmValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUnidadesMedNUmValueChanged
        // TODO add your handling code here:
        
        if(jListUnidadesMedNUm.getSelectedIndex()>-1){
            int indx = jListUnidadesMedNUm.getSelectedIndex();
        
            jListUnidadesMed.setSelectedIndex(indx);
        }
        
    }//GEN-LAST:event_jListUnidadesMedNUmValueChanged

    private void btnActualizarUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUMActionPerformed
        // TODO add your handling code here:
        
        if(!fieldActUniMed.getText().isEmpty()){
            String nuevo = fieldActUniMed.getText();
            
            UnidadMedObj unidadMedObj= new UnidadMedObj();
            unidadMedObj.setDescripcion(jListUnidadesMed.getSelectedValue());
            String  mensaje = unidadMedManObj.actualizarUnidadMed(unidadMedObj, nuevo);
            JOptionPane.showMessageDialog(null, mensaje);
                
            unidadMedManObj.listarUnidadMedDesc(jListUnidadesMed);
            unidadMedManObj.listarUnidadMedNUmm(jListUnidadesMedNUm);
            
        }
        
    }//GEN-LAST:event_btnActualizarUMActionPerformed

    private void fieldActUniMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldActUniMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldActUniMedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnidadesMedFrut().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnActualizarUM;
    private javax.swing.JButton btnAgregarUnid;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField fieldActUniMed;
    private javax.swing.JTextField fieldEliminar;
    private javax.swing.JTextField fieldUnidadDesc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListUnidadesMed;
    private javax.swing.JList<String> jListUnidadesMedNUm;
    private javax.swing.JLabel lblPasteles;
    private javax.swing.JScrollPane tablaTamPas;
    private javax.swing.JScrollPane tablaTamPas1;
    // End of variables declaration//GEN-END:variables
}
