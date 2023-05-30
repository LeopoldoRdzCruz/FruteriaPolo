
package InterfazGrafica;

import AccesoDatos.ConexionBase;
import ManipulacionObjetos.LoginManObj;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import Clases.MermaObj;
import Clases.ProductoObj;
import Clases.MermaHasProductoObj;
import Clases.ReabastecerHasProductoObj;
import ManipulacionObjetos.LoginManObj;
import ManipulacionObjetos.MermaManObj;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CaducadoFrut extends javax.swing.JFrame {
    

   
    private LoginManObj loginman = new LoginManObj();
    
    MermaManObj mermaManObj = new MermaManObj();
    private DefaultListModel listaCompra = new DefaultListModel();
    
    ArrayList<MermaHasProductoObj> carritoMerma = new ArrayList<MermaHasProductoObj>();
    
    
    
    ArrayList<String> codigos = new ArrayList<String>();
    ArrayList<String> nombres = new ArrayList<String>();
    ArrayList<String> cantidades = new ArrayList<String>();
    ArrayList<String> unidadesMedida = new ArrayList<String>();
    ArrayList<String> descripciones = new ArrayList<String>();
    
    
    public CaducadoFrut() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPasteles = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tablaTamPas6 = new javax.swing.JScrollPane();
        jListMermaNomProd = new javax.swing.JList<>();
        tablaTamPas7 = new javax.swing.JScrollPane();
        jListMermaDescripcion = new javax.swing.JList<>();
        tablaTamPas10 = new javax.swing.JScrollPane();
        jListMermaCantidad = new javax.swing.JList<>();
        tablaTamPas12 = new javax.swing.JScrollPane();
        jListMermaCodigo = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tablaTamPas13 = new javax.swing.JScrollPane();
        jListMermaBuscaProducto = new javax.swing.JList<>();
        fieldMermaBusq = new javax.swing.JTextField();
        btnBusqMerma = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fielDescMerma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnConfirmarMerma = new javax.swing.JButton();
        jSpinnerCant = new javax.swing.JSpinner();
        btnVaciarCarro = new javax.swing.JButton();
        fieldEliminaCarrito = new javax.swing.JTextField();
        btnEliminaCarro = new javax.swing.JButton();
        tablaTamPas11 = new javax.swing.JScrollPane();
        jListMermaUnidadMedida = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        tablaTamPas14 = new javax.swing.JScrollPane();
        jListMermaBuscaExistencia = new javax.swing.JList<>();
        tablaTamPas16 = new javax.swing.JScrollPane();
        jListMermaBuscaUMProd = new javax.swing.JList<>();
        tablaTamPas15 = new javax.swing.JScrollPane();
        jListMermaBuscaIDProd = new javax.swing.JList<>();
        tablaTamPas17 = new javax.swing.JScrollPane();
        jListMermaBuscaUMID = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPasteles.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblPasteles.setText("Merma Producto");
        getContentPane().add(lblPasteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 250, -1));

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 720, 210, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, -20, -1, -1));

        tablaTamPas6.setToolTipText("");
        tablaTamPas6.setVerifyInputWhenFocusTarget(false);

        jListMermaNomProd.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaNomProdValueChanged(evt);
            }
        });
        tablaTamPas6.setViewportView(jListMermaNomProd);

        getContentPane().add(tablaTamPas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 280, 240));

        tablaTamPas7.setToolTipText("");
        tablaTamPas7.setVerifyInputWhenFocusTarget(false);

        jListMermaDescripcion.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaDescripcionValueChanged(evt);
            }
        });
        tablaTamPas7.setViewportView(jListMermaDescripcion);

        getContentPane().add(tablaTamPas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 320, 240));

        tablaTamPas10.setToolTipText("");
        tablaTamPas10.setVerifyInputWhenFocusTarget(false);

        jListMermaCantidad.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaCantidadValueChanged(evt);
            }
        });
        tablaTamPas10.setViewportView(jListMermaCantidad);

        getContentPane().add(tablaTamPas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 70, 240));

        tablaTamPas12.setToolTipText("");
        tablaTamPas12.setVerifyInputWhenFocusTarget(false);

        jListMermaCodigo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaCodigoValueChanged(evt);
            }
        });
        tablaTamPas12.setViewportView(jListMermaCodigo);

        getContentPane().add(tablaTamPas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 70, 240));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 70, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 70, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Descripcion de Merma");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 170, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Cod");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, 30));

        tablaTamPas13.setToolTipText("");
        tablaTamPas13.setVerifyInputWhenFocusTarget(false);

        jListMermaBuscaProducto.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaBuscaProductoValueChanged(evt);
            }
        });
        tablaTamPas13.setViewportView(jListMermaBuscaProducto);

        getContentPane().add(tablaTamPas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 200, 160));
        getContentPane().add(fieldMermaBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 190, 30));

        btnBusqMerma.setText("BUSCAR");
        btnBusqMerma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusqMermaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusqMerma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 60, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Producto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 80, -1));
        getContentPane().add(fielDescMerma, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 210, 80));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Cantidad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 70, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Descripcion de Merma");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, 190, 30));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 570, 120, 40));

        btnConfirmarMerma.setText("CONFIRMAR  MERMA");
        btnConfirmarMerma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarMermaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarMerma, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 250, 160, 50));

        jSpinnerCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        jSpinnerCant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCantStateChanged(evt);
            }
        });
        getContentPane().add(jSpinnerCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 160, 30));

        btnVaciarCarro.setText("VACIAR");
        getContentPane().add(btnVaciarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 150, 40));

        fieldEliminaCarrito.setEditable(false);
        getContentPane().add(fieldEliminaCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 160, 40));

        btnEliminaCarro.setText("ELIMINAR");
        getContentPane().add(btnEliminaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 110, 40));

        tablaTamPas11.setToolTipText("");
        tablaTamPas11.setVerifyInputWhenFocusTarget(false);

        jListMermaUnidadMedida.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaUnidadMedidaValueChanged(evt);
            }
        });
        tablaTamPas11.setViewportView(jListMermaUnidadMedida);

        getContentPane().add(tablaTamPas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 100, 240));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Unidad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 60, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Medida");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 60, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1920x1080-Fondo-de-pantalla-verde-simple.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 770));

        tablaTamPas14.setToolTipText("");
        tablaTamPas14.setVerifyInputWhenFocusTarget(false);

        jListMermaBuscaExistencia.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaBuscaExistenciaValueChanged(evt);
            }
        });
        tablaTamPas14.setViewportView(jListMermaBuscaExistencia);

        getContentPane().add(tablaTamPas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 60, 140));

        tablaTamPas16.setToolTipText("");
        tablaTamPas16.setVerifyInputWhenFocusTarget(false);

        jListMermaBuscaUMProd.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaBuscaUMProdValueChanged(evt);
            }
        });
        tablaTamPas16.setViewportView(jListMermaBuscaUMProd);

        getContentPane().add(tablaTamPas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 60, 140));

        tablaTamPas15.setToolTipText("");
        tablaTamPas15.setVerifyInputWhenFocusTarget(false);

        jListMermaBuscaIDProd.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaBuscaIDProdValueChanged(evt);
            }
        });
        tablaTamPas15.setViewportView(jListMermaBuscaIDProd);

        getContentPane().add(tablaTamPas15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 60, 140));

        tablaTamPas17.setToolTipText("");
        tablaTamPas17.setVerifyInputWhenFocusTarget(false);

        jListMermaBuscaUMID.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMermaBuscaUMIDValueChanged(evt);
            }
        });
        tablaTamPas17.setViewportView(jListMermaBuscaUMID);

        getContentPane().add(tablaTamPas17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 60, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
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
        
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jListMermaNomProdValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaNomProdValueChanged
        // TODO add your handling code here:

        if(jListMermaNomProd.getSelectedIndex()>-1){
            int ix = jListMermaNomProd.getSelectedIndex();
            
            jListMermaDescripcion.setSelectedIndex(ix);
            jListMermaCodigo.setSelectedIndex(ix);
            jListMermaCantidad.setSelectedIndex(ix);
            
            fieldEliminaCarrito.setText(jListMermaNomProd.getSelectedValue());
            
        }

    }//GEN-LAST:event_jListMermaNomProdValueChanged

    private void jListMermaDescripcionValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaDescripcionValueChanged
        // TODO add your handling code here:
        
        if(jListMermaDescripcion.getSelectedIndex()>-1){
            int ix = jListMermaDescripcion.getSelectedIndex();
            
            jListMermaNomProd.setSelectedIndex(ix);
            jListMermaCodigo.setSelectedIndex(ix);
            jListMermaCantidad.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListMermaDescripcionValueChanged

    private void jListMermaCantidadValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaCantidadValueChanged
        // TODO add your handling code here:
        
        if(jListMermaNomProd.getSelectedIndex()>-1){
            int ix = jListMermaNomProd.getSelectedIndex();
            
            jListMermaDescripcion.setSelectedIndex(ix);
            jListMermaCodigo.setSelectedIndex(ix);
            jListMermaCantidad.setSelectedIndex(ix);
            jListMermaUnidadMedida.setSelectedIndex(ix);
            
        }
        
        
    }//GEN-LAST:event_jListMermaCantidadValueChanged

    private void jListMermaCodigoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaCodigoValueChanged
        // TODO add your handling code here:
        
        if(jListMermaCodigo.getSelectedIndex()>-1){
            int ix = jListMermaCodigo.getSelectedIndex();
            
            jListMermaDescripcion.setSelectedIndex(ix);
            jListMermaNomProd.setSelectedIndex(ix);
            jListMermaCantidad.setSelectedIndex(ix);
            jListMermaUnidadMedida.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListMermaCodigoValueChanged

    private void jListMermaBuscaProductoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaBuscaProductoValueChanged
        // TODO add your handling code here:
        
        if(jListMermaBuscaProducto.getSelectedIndex()>-1){
            int ix = jListMermaBuscaProducto.getSelectedIndex();
            
            jListMermaBuscaExistencia.setSelectedIndex(ix);
            jListMermaBuscaUMProd.setSelectedIndex(ix);
            jListMermaBuscaIDProd.setSelectedIndex(ix);
            jListMermaBuscaUMID.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListMermaBuscaProductoValueChanged

    private void jListMermaBuscaExistenciaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaBuscaExistenciaValueChanged
        // TODO add your handling code here:
        
        if(jListMermaBuscaExistencia.getSelectedIndex()>-1){
            int ix = jListMermaBuscaExistencia.getSelectedIndex();
            
            jListMermaBuscaProducto.setSelectedIndex(ix);
            jListMermaBuscaUMProd.setSelectedIndex(ix);
            jListMermaBuscaIDProd.setSelectedIndex(ix);
            jListMermaBuscaUMID.setSelectedIndex(ix);
            
        }
    }//GEN-LAST:event_jListMermaBuscaExistenciaValueChanged

    private void jSpinnerCantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantStateChanged
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jSpinnerCantStateChanged

    private void btnBusqMermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusqMermaActionPerformed
        // TODO add your handling code here:
        
        String busq = fieldMermaBusq.getText();
        
        mermaManObj.listarMermaBusqProd(jListMermaBuscaProducto, busq);
        mermaManObj.productoBusqExis(jListMermaBuscaExistencia, busq);
        mermaManObj.productoBusqUMDesc(jListMermaBuscaUMProd, busq);
        mermaManObj.listarMermaBusqID(jListMermaBuscaIDProd, busq);
        mermaManObj.productoBusqUM(jListMermaBuscaUMID, busq);
        
        
    }//GEN-LAST:event_btnBusqMermaActionPerformed

    private void jListMermaUnidadMedidaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaUnidadMedidaValueChanged
        // TODO add your handling code here:
        
        
        if(jListMermaUnidadMedida.getSelectedIndex()>-1){
            int ix = jListMermaUnidadMedida.getSelectedIndex();
            
            jListMermaDescripcion.setSelectedIndex(ix);
            jListMermaNomProd.setSelectedIndex(ix);
            jListMermaCantidad.setSelectedIndex(ix);
            jListMermaCodigo.setSelectedIndex(ix);
            
        }
        
        
    }//GEN-LAST:event_jListMermaUnidadMedidaValueChanged

    private void jListMermaBuscaIDProdValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaBuscaIDProdValueChanged
        // TODO add your handling code here:
        if(jListMermaBuscaIDProd.getSelectedIndex()>-1){
            int ix = jListMermaBuscaIDProd.getSelectedIndex();
            
            jListMermaBuscaProducto.setSelectedIndex(ix);
            jListMermaBuscaUMProd.setSelectedIndex(ix);
            jListMermaBuscaExistencia.setSelectedIndex(ix);
            jListMermaBuscaUMID.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListMermaBuscaIDProdValueChanged

    private void jListMermaBuscaUMProdValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaBuscaUMProdValueChanged
        // TODO add your handling code here:
        
        if(jListMermaBuscaUMProd.getSelectedIndex()>-1){
            int ix = jListMermaBuscaUMProd.getSelectedIndex();
            
            jListMermaBuscaProducto.setSelectedIndex(ix);
            jListMermaBuscaIDProd.setSelectedIndex(ix);
            jListMermaBuscaExistencia.setSelectedIndex(ix);
            jListMermaBuscaUMID.setSelectedIndex(ix);
            
        }
        
        
    }//GEN-LAST:event_jListMermaBuscaUMProdValueChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        if(!fielDescMerma.getText().isEmpty()){
        if(!codigos.contains(jListMermaBuscaIDProd.getSelectedValue())){
        
        //Objde producto
        ProductoObj productoNuevo = new ProductoObj();        
        
        productoNuevo.setIdProducto(Integer.valueOf(jListMermaBuscaIDProd.getSelectedValue()));
        productoNuevo.setDescripcionProd(jListMermaBuscaProducto.getSelectedValue());
        productoNuevo.setIdUnidadMedida(Integer.valueOf(jListMermaBuscaUMID.getSelectedValue()));
        
        
        //objeto de MermaHasProducto
        
        MermaHasProductoObj mermaHProd = new MermaHasProductoObj();
        mermaHProd.setIdProductoM(Integer.valueOf(jListMermaBuscaIDProd.getSelectedValue()));
        mermaHProd.setCantidad(Float.valueOf(jSpinnerCant.getValue().toString()));
        mermaHProd.setDescripcionM(jListMermaBuscaProducto.getSelectedValue());
        mermaHProd.setDescripcionDetalle(fielDescMerma.getText());
        
        carritoMerma.add(mermaHProd);
        
        //lista de codigo   
            
        //se añade el producto al carrito.
        
        DefaultListModel modelCod= new DefaultListModel(); 
        codigos.add(jListMermaBuscaIDProd.getSelectedValue());
        
        for(String elemento: codigos){
            modelCod.addElement(elemento);
        }        
        jListMermaCodigo.setModel(modelCod);
        
        //
        //Lista de nombre Producto
        DefaultListModel modelNomProd= new DefaultListModel(); 
        nombres.add(jListMermaBuscaProducto.getSelectedValue());
        
        for(String elemento: nombres){
            modelNomProd.addElement(elemento);
        }        
        jListMermaNomProd.setModel(modelNomProd);
        
        //
        //Lista de Cantidad
        
        DefaultListModel modelCant= new DefaultListModel(); 
        cantidades.add(String.valueOf(jSpinnerCant.getValue()));
        
        for(String elemento: cantidades){
            modelCant.addElement(elemento);
        }        
        jListMermaCantidad.setModel(modelCant);
        
        //
        //Lista de Unidadmedida
        
        DefaultListModel modelUniMed= new DefaultListModel(); 
        unidadesMedida.add(jListMermaBuscaUMProd.getSelectedValue());
        
        for(String elemento: unidadesMedida){
            modelUniMed.addElement(elemento);
        }        
        jListMermaUnidadMedida.setModel(modelUniMed);
        
         //
        //Lista de Unidadmedida
        
        DefaultListModel modelDescripciones= new DefaultListModel(); 
        descripciones.add(fielDescMerma.getText());
        
        for(String elemento: descripciones){
            modelDescripciones.addElement(elemento);
        }        
        jListMermaDescripcion.setModel(modelDescripciones);
        
        
//
        //Listas de Existencias
        /*DefaultListModel modelExistenncias= new DefaultListModel(); 
        existencias.add(jListReabBusqExis.getSelectedValue());
        
        for(String elemento: existencias){
            modelExistenncias.addElement(elemento);
        }        
        jListReabExistencia.setModel(modelExistenncias);
       
        */
        ///
        }
        }else{
            JOptionPane.showMessageDialog(null,"Descripcion de Merma Vacio");
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jListMermaBuscaUMIDValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMermaBuscaUMIDValueChanged
        // TODO add your handling code here:
        
        if(jListMermaBuscaUMID.getSelectedIndex()>-1){
            int ix = jListMermaBuscaUMID.getSelectedIndex();
            
            jListMermaBuscaProducto.setSelectedIndex(ix);
            jListMermaBuscaIDProd.setSelectedIndex(ix);
            jListMermaBuscaExistencia.setSelectedIndex(ix);
            jListMermaBuscaUMID.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListMermaBuscaUMIDValueChanged

    private void btnConfirmarMermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarMermaActionPerformed
        // TODO add your handling code here:
        
        MermaObj mermaObj = new MermaObj();
        JOptionPane.showMessageDialog(null,mermaManObj.agregarMerma(mermaObj));
        
        for(MermaHasProductoObj prodCarro : carritoMerma){           
            MermaHasProductoObj mermaHProdAñadir = new MermaHasProductoObj();
            mermaHProdAñadir.setIdProductoM(prodCarro.getIdProductoM());
            mermaHProdAñadir.setCantidad(prodCarro.getCantidad());
            mermaHProdAñadir.setDescripcionDetalle(prodCarro.getDescripcionDetalle());
            
            mermaManObj.agregarMermaProductos(prodCarro);
            
            Connection conn = ConexionBase.getConnection();
            
            try {
                String sql = "UPDATE Producto SET Existencia =((SELECT Existencia FROM Producto WHERE id_Producto= "+(mermaHProdAñadir.getIdProductoM())+" AND id_Estatus = 1)-"+ mermaHProdAñadir.getCantidad()+") WHERE id_Producto="+(mermaHProdAñadir.getIdProductoM())+" AND id_Estatus = 1";                 
        
                Statement st = null;
                ResultSet rs = null;
        
                try {
                    st = conn.createStatement();
                    rs = st.executeQuery(sql);
                                  
            
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "NO Se pudo atcualizar el stock");
            
                }
                conn.close();
            } catch (SQLException ex) {
                System.out.print(ex.getMessage());
            }

        }
        
        String Empleado ="";
        
        try{
             Connection conn = ConexionBase.getConnection();
                    String sqlS = "SELECT NombreEmpleado from Usuarios u, UsuarioUso s where s.id_Usuario = u.id_Usuario";                 
        
                    Statement st = null;
                    ResultSet rs = null;
                    
                    st = conn.createStatement();
                    rs = st.executeQuery(sqlS);
                    if(rs.next())
                    Empleado = rs.getString(1);
        
        }catch (SQLException e) {           
            JOptionPane.showMessageDialog(null, "NO se pudo encontar al piloto" + e.getMessage());
                        
        }
        
        int numCadu = 0;
        
        try{
             Connection conn = ConexionBase.getConnection();
                    String sqlS = "SELECT id_Merma FROM (select * from Merma ORDER BY id_Merma desc ) WHERE rownum = 1";                 
        
                    Statement st = null;
                    ResultSet rs = null;
                    
                    st = conn.createStatement();
                    rs = st.executeQuery(sqlS);
                    if(rs.next())
                    numCadu = rs.getInt(1);
        
        }catch (SQLException e) {           
            JOptionPane.showMessageDialog(null, "NO se pudo encontar al piloto" + e.getMessage());
                        
        }
        
        
        
        try{

                    FileOutputStream archivoPdfN;            
                    File file = new File("src/pdfss/merma.pdf");           
                    archivoPdfN = new FileOutputStream(file);
            
            
                    Document doc = new Document();
                    PdfWriter.getInstance(doc,archivoPdfN);
            
            
                    doc.open();
                    
                    Font negrita = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK);
                    Image logo = Image.getInstance("src/Imagenes/logo.png");
            
                    
                    Paragraph fecha = new Paragraph();
                    
                    fecha.add(Chunk.NEWLINE);
            
                    java.util.Date date= new java.util.Date();
                    fecha.add("Empleado: "+Empleado+"Numero de Merma: "+numCadu+ "\nFecha: "+ new SimpleDateFormat("dd-MM-yyyy").format(date)+"\n\n");
            
                    
                    //Encabezado
                    PdfPTable encabezado = new PdfPTable(4);            
                    encabezado.setWidthPercentage(100);
                    encabezado.getDefaultCell().setBorder(0);
            
                    float[] columnaEncabezado = new float[]{20f,30f,70f,40f};
            
                    encabezado.setWidths(columnaEncabezado);
                    encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);                 
            
                    encabezado.addCell(logo);
            
                    String nom = "FRUTERIA POLO";
                    String tel = "844-298-2625";
                    String dir = "SALTILLO-COAHUILA";
            
                    encabezado.addCell("");
                    encabezado.addCell(nom + "\nREPORTE DE MERMA\nTelefono: "+tel + "\nDireccion: "+dir);
                    encabezado.addCell(fecha);
            
                    doc.add(encabezado);
                    
                    //Termina encabezado
                    
                    //Empiezan Productos
                    
                    PdfPTable productos = new PdfPTable(4);            
                    encabezado.setWidthPercentage(100);
                    encabezado.getDefaultCell().setBorder(0);
                    
                    float[] columnaProductos = new float[]{20f,30f,70f,80f};
            
                    encabezado.setWidths(columnaEncabezado);
                    encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);        
                    
                    PdfPCell pro1 = new PdfPCell(new Phrase("Codigo", negrita));
                    PdfPCell pro2 = new PdfPCell(new Phrase("Producto", negrita));
                    PdfPCell pro3 = new PdfPCell(new Phrase("Cantidad", negrita));
                    PdfPCell pro4 = new PdfPCell(new Phrase("Descripcion", negrita));
                    
                    pro1.setBorder(0);
                    pro2.setBorder(0);
                    pro3.setBorder(0);
                    pro4.setBorder(0);
                    
                    productos.addCell(pro1);
                    productos.addCell(pro2);
                    productos.addCell(pro3);
                    productos.addCell(pro4);
                    
                    
                    for(MermaHasProductoObj prodCarro : carritoMerma){
                        
                        String cod = String.valueOf(prodCarro.getIdProductoM());
                        String nombre = prodCarro.getDescripcionM();
                        String cant = String.valueOf(prodCarro.getCantidad());
                        String descDet = String.valueOf(prodCarro.getDescripcionDetalle());
                     
                        productos.addCell(cod);
                        productos.addCell(nombre);
                        productos.addCell(cant);
                        productos.addCell(descDet);

                    }
                    
                    doc.add(productos);
                    
                    //Terminan Productos
                    
            
                    doc.close();
            
                    archivoPdfN.close();
               
                }catch(Exception e){
        
                }
        
        try{
            File fileAbrir = new File("src/pdfss/merma.pdf");
            
            if(fileAbrir.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(fileAbrir);
                }else{
                    JOptionPane.showMessageDialog(null, "Pelas Soporte");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Pelas Archivo");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnConfirmarMermaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaducadoFrut().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBusqMerma;
    private javax.swing.JButton btnConfirmarMerma;
    private javax.swing.JButton btnEliminaCarro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVaciarCarro;
    private javax.swing.JTextField fielDescMerma;
    private javax.swing.JTextField fieldEliminaCarrito;
    private javax.swing.JTextField fieldMermaBusq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListMermaBuscaExistencia;
    private javax.swing.JList<String> jListMermaBuscaIDProd;
    private javax.swing.JList<String> jListMermaBuscaProducto;
    private javax.swing.JList<String> jListMermaBuscaUMID;
    private javax.swing.JList<String> jListMermaBuscaUMProd;
    private javax.swing.JList<String> jListMermaCantidad;
    private javax.swing.JList<String> jListMermaCodigo;
    private javax.swing.JList<String> jListMermaDescripcion;
    private javax.swing.JList<String> jListMermaNomProd;
    private javax.swing.JList<String> jListMermaUnidadMedida;
    private javax.swing.JSpinner jSpinnerCant;
    private javax.swing.JLabel lblPasteles;
    private javax.swing.JScrollPane tablaTamPas10;
    private javax.swing.JScrollPane tablaTamPas11;
    private javax.swing.JScrollPane tablaTamPas12;
    private javax.swing.JScrollPane tablaTamPas13;
    private javax.swing.JScrollPane tablaTamPas14;
    private javax.swing.JScrollPane tablaTamPas15;
    private javax.swing.JScrollPane tablaTamPas16;
    private javax.swing.JScrollPane tablaTamPas17;
    private javax.swing.JScrollPane tablaTamPas6;
    private javax.swing.JScrollPane tablaTamPas7;
    // End of variables declaration//GEN-END:variables
}
