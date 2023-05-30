
package InterfazGrafica;

import AccesoDatos.ConexionBase;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import Clases.VentaObj;
import Clases.ProductoObj;
import Clases.VentaHasProductosObj;
import ManipulacionObjetos.LoginManObj;

import ManipulacionObjetos.VentaManObj;
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

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.colorchooser.AbstractColorChooserPanel;


public class VentaGraf extends javax.swing.JFrame {
    
    VentaManObj ventaManObj = new VentaManObj();
    private DefaultListModel listaVenta = new DefaultListModel();
    
    private LoginManObj loginman = new LoginManObj();
    
    ArrayList<String> codigos = new ArrayList<String>();
    ArrayList<String> nombres = new ArrayList<String>();
    ArrayList<String> cantidades = new ArrayList<String>();
    ArrayList<String> unidadesMedida = new ArrayList<String>();
    ArrayList<String> preciosUnidad = new ArrayList<String>();
    ArrayList<String> totalesProd = new ArrayList<String>();
    
    ArrayList<Float> totalesProdF = new ArrayList<Float>();
    
    ArrayList<VentaHasProductosObj> carrito = new ArrayList<VentaHasProductosObj>();
    
    public VentaGraf() {
        initComponents();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lblPasteles = new javax.swing.JLabel();
        btnEliminaCarro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblIDPastel2 = new javax.swing.JLabel();
        btnRegresa1 = new javax.swing.JButton();
        lblIDPastel4 = new javax.swing.JLabel();
        lblIDPastel5 = new javax.swing.JLabel();
        lblIDPastel6 = new javax.swing.JLabel();
        fieldIDPagaCon = new javax.swing.JTextField();
        fieldEliminaProdCarro = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnConfirmaVenta = new javax.swing.JButton();
        lblIDPastel7 = new javax.swing.JLabel();
        lblIDPastel8 = new javax.swing.JLabel();
        lblIDPastel9 = new javax.swing.JLabel();
        lblIDPastel10 = new javax.swing.JLabel();
        fieldVentaBusq = new javax.swing.JTextField();
        btnAgregaVenta = new javax.swing.JButton();
        btnBuscaProd = new javax.swing.JButton();
        tablaTamPas = new javax.swing.JScrollPane();
        jListVentaCant = new javax.swing.JList<>();
        tablaTamPas1 = new javax.swing.JScrollPane();
        jListVentaUM = new javax.swing.JList<>();
        tablaTamPas2 = new javax.swing.JScrollPane();
        jListVentaTotProd = new javax.swing.JList<>();
        tablaTamPas3 = new javax.swing.JScrollPane();
        jListVentaNomProd = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tablaTamPas4 = new javax.swing.JScrollPane();
        jListVentaPrecioUni = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        tablaTamPas5 = new javax.swing.JScrollPane();
        jListVentaCod = new javax.swing.JList<>();
        tablaTamPas6 = new javax.swing.JScrollPane();
        jListVentaBuscaProducto = new javax.swing.JList<>();
        jSpinnerCant = new javax.swing.JSpinner();
        fieldPrecioProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldTotalAPagar = new javax.swing.JTextField();
        fieldCambio = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();
        tablaProdUMDes = new javax.swing.JScrollPane();
        jListVentaBuscaUMDes = new javax.swing.JList<>();
        tablaPrecioo = new javax.swing.JScrollPane();
        jListVentaBuscaPrecio = new javax.swing.JList<>();
        tablaProdID = new javax.swing.JScrollPane();
        jListVentaBuscaID = new javax.swing.JList<>();
        tablaProdID1 = new javax.swing.JScrollPane();
        jListVentaBuscaUM = new javax.swing.JList<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPasteles.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblPasteles.setText("Venta");
        getContentPane().add(lblPasteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 150, 70));

        btnEliminaCarro.setText("ELIMINAR");
        btnEliminaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaCarroActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 210, 190));

        lblIDPastel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(lblIDPastel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        btnRegresa1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnRegresa1.setText("REGRESAR");
        btnRegresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 220, 50));

        lblIDPastel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblIDPastel4.setText("Cambio");
        getContentPane().add(lblIDPastel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 120, -1));

        lblIDPastel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblIDPastel5.setText("Precio");
        getContentPane().add(lblIDPastel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        lblIDPastel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblIDPastel6.setText("Eliminar producto");
        getContentPane().add(lblIDPastel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        fieldIDPagaCon.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                fieldIDPagaConComponentAdded(evt);
            }
        });
        fieldIDPagaCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDPagaConActionPerformed(evt);
            }
        });
        fieldIDPagaCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldIDPagaConKeyPressed(evt);
            }
        });
        getContentPane().add(fieldIDPagaCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 240, 40));

        fieldEliminaProdCarro.setEditable(false);
        fieldEliminaProdCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEliminaProdCarroActionPerformed(evt);
            }
        });
        getContentPane().add(fieldEliminaProdCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 270, 30));

        jButton2.setText("BORRAR TODO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 180, 50));

        btnConfirmaVenta.setText("GENERAR TICKET");
        btnConfirmaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 610, 160, 70));

        lblIDPastel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblIDPastel7.setText("Cantidad");
        getContentPane().add(lblIDPastel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        lblIDPastel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblIDPastel8.setText("Total");
        getContentPane().add(lblIDPastel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 90, -1));

        lblIDPastel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblIDPastel9.setText("Paga con");
        getContentPane().add(lblIDPastel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, 120, -1));

        lblIDPastel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblIDPastel10.setText("Producto");
        getContentPane().add(lblIDPastel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        fieldVentaBusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldVentaBusqActionPerformed(evt);
            }
        });
        getContentPane().add(fieldVentaBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 270, 30));

        btnAgregaVenta.setText("AGREGAR");
        btnAgregaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 120, 50));

        btnBuscaProd.setText("BUSCAR");
        btnBuscaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 90, 30));

        tablaTamPas.setToolTipText("");
        tablaTamPas.setVerifyInputWhenFocusTarget(false);

        jListVentaCant.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaCantValueChanged(evt);
            }
        });
        tablaTamPas.setViewportView(jListVentaCant);

        getContentPane().add(tablaTamPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 110, 300));

        tablaTamPas1.setToolTipText("");
        tablaTamPas1.setVerifyInputWhenFocusTarget(false);

        jListVentaUM.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaUMValueChanged(evt);
            }
        });
        tablaTamPas1.setViewportView(jListVentaUM);

        getContentPane().add(tablaTamPas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 130, 300));

        tablaTamPas2.setToolTipText("");
        tablaTamPas2.setVerifyInputWhenFocusTarget(false);

        jListVentaTotProd.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaTotProdValueChanged(evt);
            }
        });
        tablaTamPas2.setViewportView(jListVentaTotProd);

        getContentPane().add(tablaTamPas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 120, 120, 300));

        tablaTamPas3.setToolTipText("");
        tablaTamPas3.setVerifyInputWhenFocusTarget(false);

        jListVentaNomProd.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaNomProdValueChanged(evt);
            }
        });
        tablaTamPas3.setViewportView(jListVentaNomProd);

        getContentPane().add(tablaTamPas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 170, 300));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Total Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 90, 120, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Unidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 70, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 80, 60, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Codigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 60, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("   Medida");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 100, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("por Unidad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 90, 20));

        tablaTamPas4.setToolTipText("");
        tablaTamPas4.setVerifyInputWhenFocusTarget(false);

        jListVentaPrecioUni.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaPrecioUniValueChanged(evt);
            }
        });
        tablaTamPas4.setViewportView(jListVentaPrecioUni);

        getContentPane().add(tablaTamPas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 120, 120, 300));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("Cantidad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 80, 20));

        tablaTamPas5.setToolTipText("");
        tablaTamPas5.setVerifyInputWhenFocusTarget(false);

        jListVentaCod.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaCodValueChanged(evt);
            }
        });
        tablaTamPas5.setViewportView(jListVentaCod);

        getContentPane().add(tablaTamPas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 60, 300));

        tablaTamPas6.setToolTipText("");
        tablaTamPas6.setVerifyInputWhenFocusTarget(false);

        jListVentaBuscaProducto.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaBuscaProductoValueChanged(evt);
            }
        });
        tablaTamPas6.setViewportView(jListVentaBuscaProducto);

        getContentPane().add(tablaTamPas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 270, 120));

        jSpinnerCant.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jSpinnerCant.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(20.0f), Float.valueOf(1.0f)));
        jSpinnerCant.setToolTipText("");
        jSpinnerCant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCantStateChanged(evt);
            }
        });
        getContentPane().add(jSpinnerCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 386, 270, 40));

        fieldPrecioProducto.setEditable(false);
        fieldPrecioProducto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(fieldPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 270, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("Producto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 80, 20));

        fieldTotalAPagar.setEditable(false);
        getContentPane().add(fieldTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 460, 240, 40));

        fieldCambio.setEditable(false);
        getContentPane().add(fieldCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 560, 240, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1920x1080-Fondo-de-pantalla-verde-simple.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 700));

        tablaProdUMDes.setToolTipText("");
        tablaProdUMDes.setVerifyInputWhenFocusTarget(false);

        jListVentaBuscaUMDes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaBuscaUMDesValueChanged(evt);
            }
        });
        tablaProdUMDes.setViewportView(jListVentaBuscaUMDes);

        getContentPane().add(tablaProdUMDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 40, 120));

        tablaPrecioo.setToolTipText("");
        tablaPrecioo.setVerifyInputWhenFocusTarget(false);

        jListVentaBuscaPrecio.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaBuscaPrecioValueChanged(evt);
            }
        });
        tablaPrecioo.setViewportView(jListVentaBuscaPrecio);

        getContentPane().add(tablaPrecioo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 40, 120));

        tablaProdID.setToolTipText("");
        tablaProdID.setVerifyInputWhenFocusTarget(false);

        jListVentaBuscaID.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaBuscaIDValueChanged(evt);
            }
        });
        tablaProdID.setViewportView(jListVentaBuscaID);

        getContentPane().add(tablaProdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 40, 120));

        tablaProdID1.setToolTipText("");
        tablaProdID1.setVerifyInputWhenFocusTarget(false);

        jListVentaBuscaUM.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListVentaBuscaUMValueChanged(evt);
            }
        });
        tablaProdID1.setViewportView(jListVentaBuscaUM);

        getContentPane().add(tablaProdID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 40, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaCarroActionPerformed

        int indx;
        indx = jListVentaCant.getSelectedIndex();
        
        DefaultListModel nvoVentaCant = (DefaultListModel) jListVentaCant.getModel();        
        nvoVentaCant.removeElementAt(indx);       
        jListVentaCant.setModel(nvoVentaCant);
        jListVentaCant.setSelectedIndex(-1);
        if(!cantidades.isEmpty()){ 
            int contador = 0;
            for(String elemento: cantidades){           
                if(elemento.equals(jListVentaCant.getSelectedValue())){
                    cantidades.remove(contador);
                    break;
                }                                
                contador++;
            }  
        }
        
        DefaultListModel nvoVentaNomP = (DefaultListModel) jListVentaNomProd.getModel();        
        nvoVentaNomP.removeElementAt(indx);       
        jListVentaNomProd.setModel(nvoVentaNomP);
        jListVentaNomProd.setSelectedIndex(-1);
        if(!nombres.isEmpty()){ 
            int contador = 0;
            for(String elemento: nombres){           
                if(elemento.equals(jListVentaNomProd.getSelectedValue())){
                    nombres.remove(contador);
                    break;
                }                                
                contador++;
            }  
        }
        
        
        DefaultListModel nvoVentaCod = (DefaultListModel) jListVentaCod.getModel();        
        nvoVentaCod.removeElementAt(indx);       
        jListVentaCod.setModel(nvoVentaCod);
        jListVentaCod.setSelectedIndex(-1);
        if(!codigos.isEmpty()){ 
            int contador = 0;
            for(String elemento: codigos){           
                if(elemento.equals(jListVentaCod.getSelectedValue())){
                    codigos.remove(contador);
                    break;
                }                                
                contador++;
            }  
        }
        
        
        DefaultListModel nvoVentaUM = (DefaultListModel) jListVentaUM.getModel();        
        nvoVentaUM.removeElementAt(indx);       
        jListVentaUM.setModel(nvoVentaUM);
        jListVentaUM.setSelectedIndex(-1);
        if(!unidadesMedida.isEmpty()){ 
            int contador = 0;
            for(String elemento: unidadesMedida){           
                if(elemento.equals(jListVentaUM.getSelectedValue())){
                    unidadesMedida.remove(contador);
                    break;
                }                                
                contador++;
            }  
        }
        
        DefaultListModel nvoVentaPreUni = (DefaultListModel) jListVentaPrecioUni.getModel();        
        nvoVentaPreUni.removeElementAt(indx);       
        jListVentaPrecioUni.setModel(nvoVentaPreUni);
        jListVentaPrecioUni.setSelectedIndex(-1);
        if(!preciosUnidad.isEmpty()){ 
            int contador = 0;
            for(String elemento: preciosUnidad){           
                if(elemento.equals(jListVentaPrecioUni.getSelectedValue())){
                    preciosUnidad.remove(contador);
                    break;
                }                                
                contador++;
            }  
        }
        
        DefaultListModel nvoVentaTot = (DefaultListModel) jListVentaTotProd.getModel();        
        nvoVentaTot.removeElementAt(indx);       
        jListVentaTotProd.setModel(nvoVentaTot);
        jListVentaTotProd.setSelectedIndex(-1);
        if(!totalesProd.isEmpty()){ 
            int contador = 0;
            for(String elemento: totalesProd){           
                if(elemento.equals(jListVentaTotProd.getSelectedValue())){
                    totalesProd.remove(contador);
                    carrito.remove(contador);
                    break;
                }                                
                contador++;
            }  
        }                            
    }//GEN-LAST:event_btnEliminaCarroActionPerformed

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

    private void fieldIDPagaConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDPagaConActionPerformed
        // TODO add your handling code here:
        float cambio;
        
        cambio = (Float.valueOf(fieldTotalAPagar.getText())-(Float.valueOf(fieldIDPagaCon.getText())));
        
        fieldCambio.setText(String.valueOf(cambio));
        
    }//GEN-LAST:event_fieldIDPagaConActionPerformed

    private void fieldEliminaProdCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEliminaProdCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEliminaProdCarroActionPerformed

    private void fieldVentaBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldVentaBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldVentaBusqActionPerformed

    private void btnAgregaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaVentaActionPerformed
        // TODO add your handling code here:
        
        //Agrega Productos
        ProductoObj productoNuevo = new ProductoObj();        
        productoNuevo.setIdProducto(Integer.valueOf(jListVentaBuscaID.getSelectedValue()));
        productoNuevo.setDescripcionProd(jListVentaBuscaProducto.getSelectedValue());
        productoNuevo.setIdUnidadMedida(Integer.valueOf(jListVentaBuscaUM.getSelectedValue()));
        productoNuevo.setPrecio(Float.valueOf(jListVentaBuscaPrecio.getSelectedValue()));
        
        
        //Objeto de ReabaHasProducto
        VentaHasProductosObj ventaHProd = new VentaHasProductosObj();
        ventaHProd.setIdProductoV(Integer.parseInt(jListVentaBuscaID.getSelectedValue()));
        ventaHProd.setCantidad(Float.valueOf(jSpinnerCant.getValue().toString()));
        ventaHProd.setDescripcion(jListVentaBuscaProducto.getSelectedValue());
        
        carrito.add(ventaHProd);
        
        
        //lista de codigo       
        if(!codigos.contains(jListVentaBuscaID.getSelectedValue())){
        DefaultListModel modelCod= new DefaultListModel(); 
        codigos.add(jListVentaBuscaID.getSelectedValue());
        
        for(String elemento: codigos){
            modelCod.addElement(elemento);
        }        
        jListVentaCod.setModel(modelCod);
        
        //
        //Lista de nombre Producto
        DefaultListModel modelNomProd= new DefaultListModel(); 
        nombres.add(jListVentaBuscaProducto.getSelectedValue());
        
        for(String elemento: nombres){
            modelNomProd.addElement(elemento);
        }        
        jListVentaNomProd.setModel(modelNomProd);
        
        //
        //Lista de Cantidad
        
        DefaultListModel modelCant= new DefaultListModel(); 
        cantidades.add(String.valueOf(jSpinnerCant.getValue()));
        
        for(String elemento: cantidades){
            modelCant.addElement(elemento);
        }        
        jListVentaCant.setModel(modelCant);
        
        //
        //Lista de Unidadmedida
        
        DefaultListModel modelUniMed= new DefaultListModel(); 
        unidadesMedida.add(jListVentaBuscaUMDes.getSelectedValue());
        
        for(String elemento: unidadesMedida){
            modelUniMed.addElement(elemento);
        }        
        jListVentaUM.setModel(modelUniMed);
        
        //
        //Lista de Precio Unidad
        
        DefaultListModel modelPrecios= new DefaultListModel(); 
        preciosUnidad.add(jListVentaBuscaPrecio.getSelectedValue());
        
        for(String elemento: preciosUnidad){
            modelPrecios.addElement(elemento);
        }        
        jListVentaPrecioUni.setModel(modelPrecios);
        
        //
        //Lista de precio Total
        
        DefaultListModel modelTotales= new DefaultListModel(); 
        totalesProd.add(fieldPrecioProducto.getText());
        
        for(String elemento: totalesProd){
            modelTotales.addElement(elemento);
        }        
        jListVentaTotProd.setModel(modelTotales);
        
        DefaultListModel modelTotalesF= new DefaultListModel(); 
        totalesProdF.add(Float.parseFloat(fieldPrecioProducto.getText()));
        
        for(Float elemento: totalesProdF){
            modelTotalesF.addElement(elemento);
        }        
        jListVentaTotProd.setModel(modelTotalesF);
        
        
        ///
        //Total de la compra
        
        float totalCompra = 0;
        
        for(float suma : totalesProdF){          
            totalCompra+=suma;   
        }
        
        fieldTotalAPagar.setText(String.valueOf(totalCompra));
        
        
        }
        
    }//GEN-LAST:event_btnAgregaVentaActionPerformed

    private void btnBuscaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdActionPerformed
        // TODO add your handling code here:
        
        ventaManObj.listarVentaBusqProd(jListVentaBuscaProducto, fieldVentaBusq.getText());
        ventaManObj.productoBusqPrecio(jListVentaBuscaPrecio, fieldVentaBusq.getText());
        ventaManObj.listarVentaBusqID(jListVentaBuscaID, fieldVentaBusq.getText());
        ventaManObj.productoBusqUM(jListVentaBuscaUM, fieldVentaBusq.getText());
        ventaManObj.productoBusqUMDesc(jListVentaBuscaUMDes, fieldVentaBusq.getText());
        
        jListVentaBuscaPrecio.setVisible(false);
        jListVentaBuscaID.setVisible(false);
        jListVentaBuscaUM.setVisible(false);
        jListVentaBuscaUMDes.setVisible(false);
        
    }//GEN-LAST:event_btnBuscaProdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        DefaultListModel modelCod= new DefaultListModel();
        
        //Borrar de carro
        
        carrito.removeAll(carrito);
        codigos.removeAll(codigos);
        nombres.removeAll(nombres);
        cantidades.removeAll(cantidades);
        unidadesMedida.removeAll(unidadesMedida);
        preciosUnidad.removeAll(preciosUnidad);
        totalesProd.removeAll(totalesProd);
        totalesProdF.removeAll(totalesProdF);
        
        //Borrar jList
        jListVentaCod.setModel(modelCod);
        jListVentaCant.setModel(modelCod);
        jListVentaNomProd.setModel(modelCod);
        jListVentaPrecioUni.setModel(modelCod);
        jListVentaTotProd.setModel(modelCod);
        jListVentaUM.setModel(modelCod);
        
        

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jListVentaCantValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaCantValueChanged
        // TODO add your handling code here:

        if(jListVentaCant.getSelectedIndex()>-1){
            int inx = jListVentaCant.getSelectedIndex();
            
            jListVentaCod.setSelectedIndex(inx);
            jListVentaNomProd.setSelectedIndex(inx);
            jListVentaUM.setSelectedIndex(inx);
            jListVentaPrecioUni.setSelectedIndex(inx);
            jListVentaTotProd.setSelectedIndex(inx);         
            
        }

    }//GEN-LAST:event_jListVentaCantValueChanged

    private void jListVentaUMValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaUMValueChanged
        // TODO add your handling code here:
        
        if(jListVentaUM.getSelectedIndex()>-1){
            int inx = jListVentaUM.getSelectedIndex();
            
            jListVentaNomProd.setSelectedIndex(inx);
            jListVentaCant.setSelectedIndex(inx);
            jListVentaCod.setSelectedIndex(inx);
            jListVentaPrecioUni.setSelectedIndex(inx);
            jListVentaTotProd.setSelectedIndex(inx);            
            
        }
        
    }//GEN-LAST:event_jListVentaUMValueChanged

    private void jListVentaTotProdValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaTotProdValueChanged
        // TODO add your handling code here:
        
        if(jListVentaTotProd.getSelectedIndex()>-1){
            int inx = jListVentaTotProd.getSelectedIndex();
            
            jListVentaNomProd.setSelectedIndex(inx);
            jListVentaCant.setSelectedIndex(inx);
            jListVentaUM.setSelectedIndex(inx);
            jListVentaPrecioUni.setSelectedIndex(inx);
            jListVentaCod.setSelectedIndex(inx);          
            
        }
        
    }//GEN-LAST:event_jListVentaTotProdValueChanged

    private void jListVentaNomProdValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaNomProdValueChanged
        // TODO add your handling code here:
        
        if(jListVentaNomProd.getSelectedIndex()>-1){
            int inx = jListVentaNomProd.getSelectedIndex();
            
            jListVentaCod.setSelectedIndex(inx);
            jListVentaCant.setSelectedIndex(inx);
            jListVentaUM.setSelectedIndex(inx);
            jListVentaPrecioUni.setSelectedIndex(inx);
            jListVentaTotProd.setSelectedIndex(inx);         
            
            fieldEliminaProdCarro.setText(jListVentaNomProd.getSelectedValue());
           
            
        }
    }//GEN-LAST:event_jListVentaNomProdValueChanged

    private void jListVentaPrecioUniValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaPrecioUniValueChanged
        // TODO add your handling code here:
        
        if(jListVentaPrecioUni.getSelectedIndex()>-1){
            int inx = jListVentaPrecioUni.getSelectedIndex();
            
            jListVentaNomProd.setSelectedIndex(inx);
            jListVentaCant.setSelectedIndex(inx);
            jListVentaUM.setSelectedIndex(inx);
            jListVentaCod.setSelectedIndex(inx);
            jListVentaTotProd.setSelectedIndex(inx);      
            
        }
    }//GEN-LAST:event_jListVentaPrecioUniValueChanged

    private void jListVentaCodValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaCodValueChanged
        // TODO add your handling code here:
        
        if(jListVentaCod.getSelectedIndex()>-1){
            int inx = jListVentaCod.getSelectedIndex();
            
            jListVentaNomProd.setSelectedIndex(inx);
            jListVentaCant.setSelectedIndex(inx);
            jListVentaUM.setSelectedIndex(inx);
            jListVentaPrecioUni.setSelectedIndex(inx);
            jListVentaBuscaUMDes.setSelectedIndex(inx);
            
        }
        
    }//GEN-LAST:event_jListVentaCodValueChanged

    private void jListVentaBuscaProductoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaBuscaProductoValueChanged
        // TODO add your handling code here:
        
        if(jListVentaBuscaProducto.getSelectedIndex()>-1){
            
            
            int ix = jListVentaBuscaProducto.getSelectedIndex(); 
            
            jListVentaBuscaPrecio.setSelectedIndex(ix);
            jListVentaBuscaID.setSelectedIndex(ix);
            jListVentaBuscaUM.setSelectedIndex(ix);
            
            float precio;
            precio = Float.valueOf(jListVentaBuscaPrecio.getSelectedValue());
            
            fieldPrecioProducto.setText(String.valueOf(precio));
            
            jSpinnerCant.setValue(1);
            
        } 
        
    }//GEN-LAST:event_jListVentaBuscaProductoValueChanged

    private void jSpinnerCantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantStateChanged
        // TODO add your handling code here:
        
        float precio = (Float.valueOf(jListVentaBuscaPrecio.getSelectedValue()))*(Float.parseFloat(jSpinnerCant.getValue().toString()));

        fieldPrecioProducto.setText(String.valueOf(precio));
        
    }//GEN-LAST:event_jSpinnerCantStateChanged

    private void jListVentaBuscaPrecioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaBuscaPrecioValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListVentaBuscaPrecioValueChanged

    private void jListVentaBuscaIDValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaBuscaIDValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListVentaBuscaIDValueChanged

    private void jListVentaBuscaUMValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaBuscaUMValueChanged
        // TODO add your handling code here:
        
        if(jListVentaBuscaUM.getSelectedIndex()>-1){
        
            jListVentaBuscaUMDes.setSelectedIndex(jListVentaBuscaUM.getSelectedIndex());
            
        }
        
    }//GEN-LAST:event_jListVentaBuscaUMValueChanged

    private void jListVentaBuscaUMDesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListVentaBuscaUMDesValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListVentaBuscaUMDesValueChanged

    private void fieldIDPagaConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIDPagaConKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDPagaConKeyPressed

    private void fieldIDPagaConComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_fieldIDPagaConComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDPagaConComponentAdded

    private void btnConfirmaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaVentaActionPerformed
        // TODO add your handling code here:
        
        if(!fieldIDPagaCon.getText().isEmpty()){
        
        VentaObj ventaObj = new VentaObj();
        ventaObj.setPrecioVenta(Float.valueOf(fieldTotalAPagar.getText()));
        JOptionPane.showMessageDialog(null,ventaManObj.agregarVenta(ventaObj));
        
        
        for(VentaHasProductosObj prodCarro : carrito){           
            VentaHasProductosObj bentaHProdAñadir = new VentaHasProductosObj();
            bentaHProdAñadir.setIdProductoV(prodCarro.getIdProductoV());
            bentaHProdAñadir.setCantidad(prodCarro.getCantidad());           
            ventaManObj.agregarVentaProductos(prodCarro);
            
            Connection conn = ConexionBase.getConnection();
            
            try {
                String sql = "UPDATE Producto SET Existencia =((SELECT Existencia FROM Producto WHERE id_Producto= "+(bentaHProdAñadir.getIdProductoV())+" AND id_Estatus = 1)-"+ bentaHProdAñadir.getCantidad()+") WHERE id_Producto="+(bentaHProdAñadir.getIdProductoV())+" AND id_Estatus = 1";                 
        
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
        
        float cambio;
        
        cambio = Math.abs(Float.valueOf(fieldTotalAPagar.getText())-(Float.valueOf(fieldIDPagaCon.getText())));
        
        fieldCambio.setText(String.valueOf(cambio));
        
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
        
        int numVenta = 0;
        
        try{
             Connection conn = ConexionBase.getConnection();
                    String sqlS = "SELECT id_Venta FROM (select * from Ventas ORDER BY id_Venta desc ) WHERE rownum = 1";                 
        
                    Statement st = null;
                    ResultSet rs = null;
                    
                    st = conn.createStatement();
                    rs = st.executeQuery(sqlS);
                    if(rs.next())
                    numVenta = rs.getInt(1);
        
        }catch (SQLException e) {           
            JOptionPane.showMessageDialog(null, "NO se pudo encontar al piloto" + e.getMessage());
                        
        }
        
        
        try{
                    

                    FileOutputStream archivoPdfN;            
                    File file = new File("src/pdfss/ticket.pdf");           
                    archivoPdfN = new FileOutputStream(file);
            
            
                    Document doc = new Document();
                    PdfWriter.getInstance(doc,archivoPdfN);
            
            
                    doc.open();
                    
                    Font negrita = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK);
                    Image logo = Image.getInstance("src/Imagenes/logo.png");
            
                    
                    Paragraph fecha = new Paragraph();
                    
                    fecha.add(Chunk.NEWLINE);
            
                    java.util.Date date= new java.util.Date();
                    fecha.add("Empleado: "+Empleado+"\nNumero de Ticket: "+numVenta+"\nFecha: "+ new SimpleDateFormat("dd-MM-yyyy").format(date)+"\n\n");
            
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
                    encabezado.addCell(nom + "\nTicket de Venta\nTelefono: "+tel + "\nDireccion: "+dir);
                    encabezado.addCell(fecha);
            
                    doc.add(encabezado);
                    
                    //Termina encabezado
                    
                    //Empiezan Productos
                    
                    PdfPTable productos = new PdfPTable(3);            
                    encabezado.setWidthPercentage(100);
                    encabezado.getDefaultCell().setBorder(0);
                    
                    float[] columnaProductos = new float[]{20f,70f,40f};
            
                    productos.setWidths(columnaProductos);
                    productos.setHorizontalAlignment(Element.ALIGN_CENTER);   
                    
                    
                    PdfPCell pro1 = new PdfPCell(new Phrase("CODIGO", negrita));
                    PdfPCell pro2 = new PdfPCell(new Phrase("DESCRIPCION", negrita));
                    PdfPCell pro3 = new PdfPCell(new Phrase("CANTIDAD", negrita));
                    
                    
                    
                    pro1.setBorder(0);
                    pro2.setBorder(0);
                    pro3.setBorder(0);
                    
                    productos.addCell(pro1);
                    productos.addCell(pro2);
                    productos.addCell(pro3);
                    
                    for(VentaHasProductosObj prodCarro : carrito){

                        String cod = String.valueOf(prodCarro.getIdProductoV());
                        String desc = prodCarro.getDescripcion();
                        String cant = String.valueOf(prodCarro.getCantidad());
                     
                        pro1 = new PdfPCell(new Phrase(cod));
                        pro2 = new PdfPCell(new Phrase(desc));
                        pro3 = new PdfPCell(new Phrase(cant));
                        
                        pro3.setHorizontalAlignment((int)(RIGHT_ALIGNMENT));
                        
                        productos.addCell(pro1);
                        productos.addCell(pro2);
                        productos.addCell(pro3);
                    }
                    
  
                    doc.add(productos);
                
                    //Terminan Productos
                    
                    //Inicia totales
                    
                    PdfPTable totales = new PdfPTable(3);            
                    totales.setWidthPercentage(50);
                    totales.getDefaultCell().setBorder(0);
                    
                    float[] columnaTotales = new float[]{30f,30f,30f};
            
                    totales.setWidths(columnaTotales);
                    totales.setHorizontalAlignment(Element.ALIGN_RIGHT);                 
                       
                    
                    PdfPCell tot1 = new PdfPCell(new Phrase("Total", negrita));
                    PdfPCell tot2 = new PdfPCell(new Phrase("Paga con ", negrita));
                    PdfPCell tot3 = new PdfPCell(new Phrase("Cambio", negrita));
                    
                    tot1.setBorder(0);
                    tot2.setBorder(0);
                    tot3.setBorder(0);
                    
                    
                    totales.addCell(tot1);
                    totales.addCell(tot2);
                    totales.addCell(tot3);
                    
                    totales.addCell(fieldTotalAPagar.getText());
                    totales.addCell(fieldIDPagaCon.getText());
                    totales.addCell(fieldCambio.getText());
            
                    doc.add(totales);
                    
            
                    doc.close();
            
                    archivoPdfN.close();
               
                }catch(Exception e){
        
                }
        
        
        try{
            File fileAbrir = new File("src/pdfss/ticket.pdf");
            
            if(fileAbrir.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(fileAbrir);
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede abrir el Ticket de venta");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "No se puede abrir el Ticket de venta");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
                DefaultListModel modelCod= new DefaultListModel();
        
        //Borrar de carro
        
        carrito.removeAll(carrito);
        codigos.removeAll(codigos);
        nombres.removeAll(nombres);
        cantidades.removeAll(cantidades);
        unidadesMedida.removeAll(unidadesMedida);
        preciosUnidad.removeAll(preciosUnidad);
        totalesProd.removeAll(totalesProd);
        totalesProdF.removeAll(totalesProdF);
        
        //Borrar jList
        jListVentaCod.setModel(modelCod);
        jListVentaCant.setModel(modelCod);
        jListVentaNomProd.setModel(modelCod);
        jListVentaPrecioUni.setModel(modelCod);
        jListVentaTotProd.setModel(modelCod);
        jListVentaUM.setModel(modelCod);
        
        }else{
            JOptionPane.showMessageDialog(null,"INTRODUCIR EL PAGO");
        }

    }//GEN-LAST:event_btnConfirmaVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaGraf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregaVenta;
    private javax.swing.JButton btnBuscaProd;
    private javax.swing.JButton btnConfirmaVenta;
    private javax.swing.JButton btnEliminaCarro;
    private javax.swing.JButton btnRegresa1;
    private javax.swing.JTextField fieldCambio;
    private javax.swing.JTextField fieldEliminaProdCarro;
    private javax.swing.JTextField fieldIDPagaCon;
    private javax.swing.JTextField fieldPrecioProducto;
    private javax.swing.JTextField fieldTotalAPagar;
    private javax.swing.JTextField fieldVentaBusq;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListVentaBuscaID;
    private javax.swing.JList<String> jListVentaBuscaPrecio;
    private javax.swing.JList<String> jListVentaBuscaProducto;
    private javax.swing.JList<String> jListVentaBuscaUM;
    private javax.swing.JList<String> jListVentaBuscaUMDes;
    private javax.swing.JList<String> jListVentaCant;
    private javax.swing.JList<String> jListVentaCod;
    private javax.swing.JList<String> jListVentaNomProd;
    private javax.swing.JList<String> jListVentaPrecioUni;
    private javax.swing.JList<String> jListVentaTotProd;
    private javax.swing.JList<String> jListVentaUM;
    private javax.swing.JSpinner jSpinnerCant;
    private javax.swing.JLabel lblIDPastel10;
    private javax.swing.JLabel lblIDPastel2;
    private javax.swing.JLabel lblIDPastel4;
    private javax.swing.JLabel lblIDPastel5;
    private javax.swing.JLabel lblIDPastel6;
    private javax.swing.JLabel lblIDPastel7;
    private javax.swing.JLabel lblIDPastel8;
    private javax.swing.JLabel lblIDPastel9;
    private javax.swing.JLabel lblPasteles;
    private javax.swing.JScrollPane tablaPrecioo;
    private javax.swing.JScrollPane tablaProdID;
    private javax.swing.JScrollPane tablaProdID1;
    private javax.swing.JScrollPane tablaProdUMDes;
    private javax.swing.JScrollPane tablaTamPas;
    private javax.swing.JScrollPane tablaTamPas1;
    private javax.swing.JScrollPane tablaTamPas2;
    private javax.swing.JScrollPane tablaTamPas3;
    private javax.swing.JScrollPane tablaTamPas4;
    private javax.swing.JScrollPane tablaTamPas5;
    private javax.swing.JScrollPane tablaTamPas6;
    // End of variables declaration//GEN-END:variables
}
