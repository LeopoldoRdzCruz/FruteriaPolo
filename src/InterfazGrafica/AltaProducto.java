
package InterfazGrafica;

import ManipulacionObjetos.ProductoManObj;
import Clases.ProductoObj;
import ManipulacionObjetos.LoginManObj;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import javax.swing.DefaultComboBoxModel;

public class AltaProducto extends javax.swing.JFrame {
    
    ProductoManObj prodManObj = new ProductoManObj();
    
    private DefaultListModel listaProd = new DefaultListModel(); 
    
    private DefaultComboBoxModel comboProd = new DefaultComboBoxModel();
    
    private LoginManObj loginman = new LoginManObj();
    
  

    public AltaProducto() {
        initComponents();
        
        
        jListNum.setModel(listaProd);
        jListDesc.setModel(listaProd);
        jListTiPro.setModel(listaProd);
        jListPrecio.setModel(listaProd);
        jListUniMed.setModel(listaProd);
        jListExis.setModel(listaProd);
        jListEstatus.setModel(listaProd);
        
        
        prodManObj.listarProductoNum(jListNum);
        prodManObj.listarProductoDesc(jListDesc);
        prodManObj.listarProductoTipoPro(jListTiPro);
        prodManObj.listarProductoPrecio(jListPrecio);
        prodManObj.listarProductoUniMed(jListUniMed);
        prodManObj.listarProductoExi(jListExis);
        prodManObj.listarProductoEst(jListEstatus);
        
        
        jComboBoxTipoProd.setModel(comboProd);
        jComboBoxTipoProd.setModel(comboProd);
        
        
            prodManObj.listComboTiPro(jComboBoxTipoProd);
        prodManObj.listComboUnidMe(jComboBoxUnidadMed);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblProducto = new javax.swing.JLabel();
        lblElimDesc = new javax.swing.JLabel();
        lblAgDescrip = new javax.swing.JLabel();
        lblAgUniMed = new javax.swing.JLabel();
        btnAgregaProd = new javax.swing.JButton();
        btnEliminaProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEstatus = new javax.swing.JList<>();
        fieldDescripcion = new javax.swing.JTextField();
        lblAgTipoProd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIDPastel2 = new javax.swing.JLabel();
        lblAgPrecio = new javax.swing.JLabel();
        fieldElimDescripcion = new javax.swing.JTextField();
        btnRegresa1 = new javax.swing.JButton();
        fieldPrecio = new javax.swing.JTextField();
        jComboBoxUnidadMed = new javax.swing.JComboBox<>();
        jComboBoxTipoProd = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTiPro = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListUniMed = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListNum = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListPrecio = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListDesc = new javax.swing.JList<>();
        lblAgPrecio1 = new javax.swing.JLabel();
        lblAgPrecio2 = new javax.swing.JLabel();
        lblAgPrecio3 = new javax.swing.JLabel();
        lblAgPrecio4 = new javax.swing.JLabel();
        lblAgPrecio5 = new javax.swing.JLabel();
        lblAgPrecio6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListExis = new javax.swing.JList<>();
        lblAgPrecio7 = new javax.swing.JLabel();
        btnActuProd = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProducto.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblProducto.setText("Productos");
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        lblElimDesc.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblElimDesc.setText("Nombre");
        getContentPane().add(lblElimDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 490, 100, 30));

        lblAgDescrip.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAgDescrip.setText("Descripcion/Nombre");
        getContentPane().add(lblAgDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblAgUniMed.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAgUniMed.setText("Unidad de Medida");
        getContentPane().add(lblAgUniMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 260, 30));

        btnAgregaProd.setText("AGREGAR");
        btnAgregaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 110, 40));

        btnEliminaProd.setText("ELIMINAR");
        btnEliminaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 570, -1, -1));

        jListEstatus.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListEstatusValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListEstatus);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 110, 100, 340));
        getContentPane().add(fieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 200, 30));

        lblAgTipoProd.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAgTipoProd.setText("Tipo Producto");
        getContentPane().add(lblAgTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 200, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        lblIDPastel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(lblIDPastel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        lblAgPrecio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAgPrecio.setText("Precio");
        getContentPane().add(lblAgPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        fieldElimDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldElimDescripcionActionPerformed(evt);
            }
        });
        getContentPane().add(fieldElimDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 530, 190, 30));

        btnRegresa1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnRegresa1.setText("REGRESAR");
        btnRegresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 720, 210, 40));

        fieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(fieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 200, 30));

        jComboBoxUnidadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUnidadMedActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxUnidadMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 200, 30));

        jComboBoxTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoProdActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 200, 30));

        jListTiPro.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTiProValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListTiPro);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 160, 340));

        jListUniMed.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUniMedValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListUniMed);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 100, 340));

        jListNum.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListNumValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jListNum);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 70, 340));

        jListPrecio.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPrecioValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(jListPrecio);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 100, 340));

        jListDesc.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListDescValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(jListDesc);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 180, 340));

        lblAgPrecio1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAgPrecio1.setText("Tipo Producto");
        getContentPane().add(lblAgPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 120, 20));

        lblAgPrecio2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAgPrecio2.setText("Descripcion");
        getContentPane().add(lblAgPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 100, 20));

        lblAgPrecio3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAgPrecio3.setText("Precio");
        getContentPane().add(lblAgPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 50, 20));

        lblAgPrecio4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAgPrecio4.setText("Unidad Medida");
        getContentPane().add(lblAgPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 110, 20));

        lblAgPrecio5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAgPrecio5.setText("Estatus");
        getContentPane().add(lblAgPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 90, 80, 20));

        lblAgPrecio6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAgPrecio6.setText("Num");
        getContentPane().add(lblAgPrecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 50, 20));

        jListExis.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListExisValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(jListExis);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 110, 120, 340));

        lblAgPrecio7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAgPrecio7.setText("Existencia");
        getContentPane().add(lblAgPrecio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, 80, 20));

        btnActuProd.setText("ACTUALIZAR");
        btnActuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnActuProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 110, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1920x1080-Fondo-de-pantalla-verde-simple.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 1540, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaProdActionPerformed
        
        if(fieldDescripcion.getText().isEmpty()|| fieldPrecio.getText().isEmpty()){
           
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
            
            try {
                ProductoObj prodObj= new ProductoObj();
                

                prodObj.setDescripcionProd(fieldDescripcion.getText());   
                prodObj.setPrecio(Float.valueOf(fieldPrecio.getText()));
                
                prodObj.setIdTipoProducto(prodManObj.buscarTipoProd(jComboBoxTipoProd.getSelectedItem().toString()));
                prodObj.setIdUnidadMedida((jComboBoxUnidadMed.getSelectedIndex()+1));
                String mensaje = prodManObj.agregarProducto(prodObj);
                
                JOptionPane.showMessageDialog(null, mensaje);         
                
                prodManObj.listarProductoNum(jListNum);
                prodManObj.listarProductoDesc(jListDesc);
                prodManObj.listarProductoTipoPro(jListTiPro);
                prodManObj.listarProductoPrecio(jListPrecio);
                prodManObj.listarProductoUniMed(jListUniMed);
                prodManObj.listarProductoExi(jListExis);
                prodManObj.listarProductoEst(jListEstatus);
                
                fieldDescripcion.setText("");
                fieldPrecio.setText("");
                jComboBoxTipoProd.setSelectedIndex(-1);
                jComboBoxUnidadMed.setSelectedIndex(-1);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo completar el registro \n"+ e.getMessage() );

            }
        }
        
    }//GEN-LAST:event_btnAgregaProdActionPerformed

    private void btnEliminaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaProdActionPerformed
        
        if(!fieldElimDescripcion.getText().isEmpty()){
            
            ProductoObj prodObj= new ProductoObj();
            
            prodObj.setDescripcionProd(fieldElimDescripcion.getText());
            
            prodManObj.eliminarProducto(prodObj);
            
            prodManObj.listarProductoNum(jListNum);
            prodManObj.listarProductoDesc(jListDesc);
            prodManObj.listarProductoTipoPro(jListTiPro);
            prodManObj.listarProductoPrecio(jListPrecio);
            prodManObj.listarProductoUniMed(jListUniMed);
            prodManObj.listarProductoExi(jListExis);
            prodManObj.listarProductoEst(jListEstatus);
            
        }
       
    }//GEN-LAST:event_btnEliminaProdActionPerformed

    private void fieldElimDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldElimDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldElimDescripcionActionPerformed

    private void btnRegresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresa1ActionPerformed
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
        
        
    }//GEN-LAST:event_btnRegresa1ActionPerformed

    private void fieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPrecioActionPerformed

    private void jListNumValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListNumValueChanged
        // TODO add your handling code here:
        
        if(jListNum.getSelectedIndex()>-1){
            int inx = jListNum.getSelectedIndex();
            
            jListDesc.setSelectedIndex(inx);
            jListTiPro.setSelectedIndex(inx);
            jListUniMed.setSelectedIndex(inx);
            jListPrecio.setSelectedIndex(inx);
            jListExis.setSelectedIndex(inx);
            jListEstatus.setSelectedIndex(inx);
            
            fieldDescripcion.setText(jListDesc.getSelectedValue());
            
            fieldElimDescripcion.setText(jListDesc.getSelectedValue());
            
        }
        
        
        
    }//GEN-LAST:event_jListNumValueChanged

    private void jListDescValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListDescValueChanged
        // TODO add your handling code here:
        
        if(jListDesc.getSelectedIndex()>-1){
            int inx = jListDesc.getSelectedIndex();
            
            jListNum.setSelectedIndex(inx);
            jListTiPro.setSelectedIndex(inx);
            jListUniMed.setSelectedIndex(inx);
            jListPrecio.setSelectedIndex(inx);
            jListExis.setSelectedIndex(inx);
            jListEstatus.setSelectedIndex(inx);
            
        }
    }//GEN-LAST:event_jListDescValueChanged

    private void jListTiProValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTiProValueChanged
        // TODO add your handling code here:
        
        if(jListTiPro.getSelectedIndex()>-1){
            int inx = jListTiPro.getSelectedIndex();
            
            jListDesc.setSelectedIndex(inx);
            jListNum.setSelectedIndex(inx);
            jListUniMed.setSelectedIndex(inx);
            jListPrecio.setSelectedIndex(inx);
            jListExis.setSelectedIndex(inx);
            jListEstatus.setSelectedIndex(inx);
            
            
            String tex = jListTiPro.getSelectedValue();
            
            jComboBoxTipoProd.setSelectedItem(tex);
                
            
            
        }
    }//GEN-LAST:event_jListTiProValueChanged

    private void jListPrecioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPrecioValueChanged
        // TODO add your handling code here:
        
        if(jListPrecio.getSelectedIndex()>-1){
            int inx = jListPrecio.getSelectedIndex();
            
            jListDesc.setSelectedIndex(inx);
            jListTiPro.setSelectedIndex(inx);
            jListUniMed.setSelectedIndex(inx);
            jListNum.setSelectedIndex(inx);
            jListExis.setSelectedIndex(inx);
            jListEstatus.setSelectedIndex(inx);
            
            fieldPrecio.setText(jListPrecio.getSelectedValue());
            
        }
    }//GEN-LAST:event_jListPrecioValueChanged

    private void jListUniMedValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUniMedValueChanged
        // TODO add your handling code here:
        
        if(jListUniMed.getSelectedIndex()>-1){
            int inx = jListUniMed.getSelectedIndex();
            
            jListDesc.setSelectedIndex(inx);
            jListTiPro.setSelectedIndex(inx);
            jListNum.setSelectedIndex(inx);
            jListPrecio.setSelectedIndex(inx);
            jListExis.setSelectedIndex(inx);
            jListEstatus.setSelectedIndex(inx);
            
            
            String tex = jListUniMed.getSelectedValue();
            
            jComboBoxUnidadMed.setSelectedItem(tex);
            
        }
    }//GEN-LAST:event_jListUniMedValueChanged

    private void jListEstatusValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEstatusValueChanged
        // TODO add your handling code here:
        
        if(jListEstatus.getSelectedIndex()>-1){
            int inx = jListEstatus.getSelectedIndex();
            
            jListDesc.setSelectedIndex(inx);
            jListTiPro.setSelectedIndex(inx);
            jListUniMed.setSelectedIndex(inx);
            jListPrecio.setSelectedIndex(inx);
            jListExis.setSelectedIndex(inx);
            jListNum.setSelectedIndex(inx);
            
        }
    }//GEN-LAST:event_jListEstatusValueChanged

    private void jListExisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListExisValueChanged
        // TODO add your handling code here:
        
        if(jListExis.getSelectedIndex()>-1){
            int inx = jListExis.getSelectedIndex();
            
            jListDesc.setSelectedIndex(inx);
            jListTiPro.setSelectedIndex(inx);
            jListUniMed.setSelectedIndex(inx);
            jListPrecio.setSelectedIndex(inx);
            jListNum.setSelectedIndex(inx);
            jListEstatus.setSelectedIndex(inx);
            
        }
        
    }//GEN-LAST:event_jListExisValueChanged

    private void jComboBoxTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoProdActionPerformed

    private void btnActuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuProdActionPerformed
        // TODO add your handling code here:
        
        String desc = fieldDescripcion.getText();     
        String tipoProd = jComboBoxTipoProd.getSelectedItem().toString();       
        String uniMed = jComboBoxUnidadMed.getSelectedItem().toString();
        
        String precio = fieldPrecio.getText();
        
        if((jListNum.getSelectedIndex()>-1)&&(!desc.equals(jListDesc.getSelectedValue()))||(!tipoProd.equals(jListTiPro.getSelectedValue()))||(!uniMed.equals(jListUniMed.getSelectedValue()))
                || (!precio.equals(jListPrecio))){
            
            try{
                
                ProductoObj prodObj= new ProductoObj();
            
                prodObj.setDescripcionProd(desc);
                prodObj.setIdTipoProducto(jComboBoxTipoProd.getSelectedIndex()+1);
                prodObj.setIdUnidadMedida(jComboBoxUnidadMed.getSelectedIndex()+1);
                prodObj.setPrecio(Float.valueOf(fieldPrecio.getText()));
            
                
                String mensaje = prodManObj.actuProducto(prodObj, jListDesc.getSelectedValue());
                
                JOptionPane.showMessageDialog(null, mensaje);
                
                prodManObj.listarProductoNum(jListNum);
                prodManObj.listarProductoDesc(jListDesc);
                prodManObj.listarProductoTipoPro(jListTiPro);
                prodManObj.listarProductoPrecio(jListPrecio);
                prodManObj.listarProductoUniMed(jListUniMed);
                prodManObj.listarProductoExi(jListExis);
                prodManObj.listarProductoEst(jListEstatus);
                
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo completar el registro \n"+ e.getMessage() );
            }
            
        }
        
    }//GEN-LAST:event_btnActuProdActionPerformed

    private void jComboBoxUnidadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUnidadMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUnidadMedActionPerformed

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
            java.util.logging.Logger.getLogger(AltaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnActuProd;
    private javax.swing.JButton btnAgregaProd;
    private javax.swing.JButton btnEliminaProd;
    private javax.swing.JButton btnRegresa1;
    private javax.swing.JTextField fieldDescripcion;
    private javax.swing.JTextField fieldElimDescripcion;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxTipoProd;
    private javax.swing.JComboBox<String> jComboBoxUnidadMed;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListDesc;
    private javax.swing.JList<String> jListEstatus;
    private javax.swing.JList<String> jListExis;
    private javax.swing.JList<String> jListNum;
    private javax.swing.JList<String> jListPrecio;
    private javax.swing.JList<String> jListTiPro;
    private javax.swing.JList<String> jListUniMed;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAgDescrip;
    private javax.swing.JLabel lblAgPrecio;
    private javax.swing.JLabel lblAgPrecio1;
    private javax.swing.JLabel lblAgPrecio2;
    private javax.swing.JLabel lblAgPrecio3;
    private javax.swing.JLabel lblAgPrecio4;
    private javax.swing.JLabel lblAgPrecio5;
    private javax.swing.JLabel lblAgPrecio6;
    private javax.swing.JLabel lblAgPrecio7;
    private javax.swing.JLabel lblAgTipoProd;
    private javax.swing.JLabel lblAgUniMed;
    private javax.swing.JLabel lblElimDesc;
    private javax.swing.JLabel lblIDPastel2;
    private javax.swing.JLabel lblProducto;
    // End of variables declaration//GEN-END:variables
}
