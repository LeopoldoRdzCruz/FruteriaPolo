
package InterfazGrafica;

import AccesoDatos.ConexionBase;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import Clases.ReabastecerObj;
import Clases.ProductoObj;
import Clases.ReabastecerHasProductoObj;
import ManipulacionObjetos.LoginManObj;

import ManipulacionObjetos.ReabastecerManObj;

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
import java.util.Date;

import javax.swing.DefaultListModel;

public class ReabastecerFrut extends javax.swing.JFrame {
    

    ReabastecerManObj reabaManObj = new ReabastecerManObj();
    private DefaultListModel listaCompra = new DefaultListModel();
    
    private LoginManObj loginman = new LoginManObj();
    
    ArrayList<ReabastecerHasProductoObj> carrito = new ArrayList<ReabastecerHasProductoObj>();
    
    ArrayList<String> codigos = new ArrayList<String>();
    ArrayList<String> nombres = new ArrayList<String>();
    ArrayList<String> cantidades = new ArrayList<String>();
    ArrayList<String> unidadesMedida = new ArrayList<String>();
    ArrayList<String> preciosUnidad = new ArrayList<String>();
    ArrayList<String> totalesProd = new ArrayList<String>();
    ArrayList<Float> totalesProdF = new ArrayList<Float>();
    ArrayList<String> existencias = new ArrayList<String>();
    
    public ReabastecerFrut() {
        initComponents();
        fieldTotalCompra.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPasteles = new javax.swing.JLabel();
        fieldCompraBusq = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        tablaTamPas = new javax.swing.JScrollPane();
        jListReabNombre = new javax.swing.JList<>();
        tablaTamPas1 = new javax.swing.JScrollPane();
        jListReabCod = new javax.swing.JList<>();
        tablaTamPas2 = new javax.swing.JScrollPane();
        jListReabCant = new javax.swing.JList<>();
        tablaTamPas3 = new javax.swing.JScrollPane();
        jListReabUniMed = new javax.swing.JList<>();
        tablaTamPas5 = new javax.swing.JScrollPane();
        jListReabProdBuscDesc = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSpinnerCant = new javax.swing.JSpinner();
        tablaTamPas6 = new javax.swing.JScrollPane();
        jListReabPrecio = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        tablaTamPas7 = new javax.swing.JScrollPane();
        jListReabTotal = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        fieldReabAggPrecio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tablaTamPas13 = new javax.swing.JScrollPane();
        jListReabBusqExis = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fieldTotalCompra = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tablaTamPas14 = new javax.swing.JScrollPane();
        jListReabExistencia = new javax.swing.JList<>();
        tablaTamPas12 = new javax.swing.JScrollPane();
        jListReabProdIDTipo = new javax.swing.JList<>();
        tablaTamPas8 = new javax.swing.JScrollPane();
        jListReabProdBuscID = new javax.swing.JList<>();
        tablaTamPas9 = new javax.swing.JScrollPane();
        jListReabProdBuscPrecio = new javax.swing.JList<>();
        tablaTamPas10 = new javax.swing.JScrollPane();
        jListReabProdBuscUM = new javax.swing.JList<>();
        tablaTamPas11 = new javax.swing.JScrollPane();
        jListReabProdBuscUMDes = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPasteles.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblPasteles.setText("Reabastecer Producto");
        getContentPane().add(lblPasteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));
        getContentPane().add(fieldCompraBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 190, 30));

        btnConfirmar.setText("CONFIRMAR REABASTECIMIENTO");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 220, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, -10, -1, -1));

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 670, 190, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 60, 30));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, 130, 40));

        tablaTamPas.setToolTipText("");
        tablaTamPas.setVerifyInputWhenFocusTarget(false);

        jListReabNombre.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabNombreValueChanged(evt);
            }
        });
        tablaTamPas.setViewportView(jListReabNombre);

        getContentPane().add(tablaTamPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 230, 240));

        tablaTamPas1.setToolTipText("");
        tablaTamPas1.setVerifyInputWhenFocusTarget(false);

        jListReabCod.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabCodValueChanged(evt);
            }
        });
        tablaTamPas1.setViewportView(jListReabCod);

        getContentPane().add(tablaTamPas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, 240));

        tablaTamPas2.setToolTipText("");
        tablaTamPas2.setVerifyInputWhenFocusTarget(false);

        jListReabCant.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabCantValueChanged(evt);
            }
        });
        tablaTamPas2.setViewportView(jListReabCant);

        getContentPane().add(tablaTamPas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 70, 240));

        tablaTamPas3.setToolTipText("");
        tablaTamPas3.setVerifyInputWhenFocusTarget(false);

        jListReabUniMed.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabUniMedValueChanged(evt);
            }
        });
        tablaTamPas3.setViewportView(jListReabUniMed);

        getContentPane().add(tablaTamPas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 110, 240));

        tablaTamPas5.setToolTipText("");
        tablaTamPas5.setVerifyInputWhenFocusTarget(false);

        jListReabProdBuscDesc.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabProdBuscDescValueChanged(evt);
            }
        });
        tablaTamPas5.setViewportView(jListReabProdBuscDesc);

        getContentPane().add(tablaTamPas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 290, 90));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Producto");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 90, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Producto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 80, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Unidad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 60, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Unidad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 60, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("  Productos");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 90, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Precio ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 50, 30));

        jSpinnerCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        jSpinnerCant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCantStateChanged(evt);
            }
        });
        getContentPane().add(jSpinnerCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 160, 30));

        tablaTamPas6.setToolTipText("");
        tablaTamPas6.setVerifyInputWhenFocusTarget(false);

        jListReabPrecio.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabPrecioValueChanged(evt);
            }
        });
        tablaTamPas6.setViewportView(jListReabPrecio);

        getContentPane().add(tablaTamPas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 90, 240));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Medida");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 60, 40));

        tablaTamPas7.setToolTipText("");
        tablaTamPas7.setVerifyInputWhenFocusTarget(false);

        jListReabTotal.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabTotalValueChanged(evt);
            }
        });
        tablaTamPas7.setViewportView(jListReabTotal);

        getContentPane().add(tablaTamPas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 90, 240));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Total");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 40, 30));

        fieldReabAggPrecio.setEditable(false);
        getContentPane().add(fieldReabAggPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 160, 30));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Cantidad de producto Añadido");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 220, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Cod");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 40, 30));

        tablaTamPas13.setToolTipText("");
        tablaTamPas13.setVerifyInputWhenFocusTarget(false);

        jListReabBusqExis.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabBusqExisValueChanged(evt);
            }
        });
        tablaTamPas13.setViewportView(jListReabBusqExis);

        getContentPane().add(tablaTamPas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 50, 90));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Cantidad");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 70, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Existencia");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 80, 30));

        jButton1.setText("VACIAR TODO ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 140, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1920x1080-Fondo-de-pantalla-verde-simple.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 720));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("TOTAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 70, 30));

        fieldTotalCompra.setEditable(false);
        fieldTotalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTotalCompraActionPerformed(evt);
            }
        });
        getContentPane().add(fieldTotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 160, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Existencia");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 80, 30));

        tablaTamPas14.setToolTipText("");
        tablaTamPas14.setVerifyInputWhenFocusTarget(false);

        jListReabExistencia.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabExistenciaValueChanged(evt);
            }
        });
        tablaTamPas14.setViewportView(jListReabExistencia);

        getContentPane().add(tablaTamPas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 90, 240));

        tablaTamPas12.setToolTipText("");
        tablaTamPas12.setVerifyInputWhenFocusTarget(false);

        jListReabProdIDTipo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabProdIDTipoValueChanged(evt);
            }
        });
        tablaTamPas12.setViewportView(jListReabProdIDTipo);

        getContentPane().add(tablaTamPas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 20, 20));

        tablaTamPas8.setToolTipText("");
        tablaTamPas8.setVerifyInputWhenFocusTarget(false);

        jListReabProdBuscID.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabProdBuscIDValueChanged(evt);
            }
        });
        tablaTamPas8.setViewportView(jListReabProdBuscID);

        getContentPane().add(tablaTamPas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 20, 20));

        tablaTamPas9.setToolTipText("");
        tablaTamPas9.setVerifyInputWhenFocusTarget(false);

        jListReabProdBuscPrecio.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabProdBuscPrecioValueChanged(evt);
            }
        });
        tablaTamPas9.setViewportView(jListReabProdBuscPrecio);

        getContentPane().add(tablaTamPas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 20, 20));

        tablaTamPas10.setToolTipText("");
        tablaTamPas10.setVerifyInputWhenFocusTarget(false);

        jListReabProdBuscUM.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabProdBuscUMValueChanged(evt);
            }
        });
        tablaTamPas10.setViewportView(jListReabProdBuscUM);

        getContentPane().add(tablaTamPas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 20, 20));

        tablaTamPas11.setToolTipText("");
        tablaTamPas11.setVerifyInputWhenFocusTarget(false);

        jListReabProdBuscUMDes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListReabProdBuscUMDesValueChanged(evt);
            }
        });
        tablaTamPas11.setViewportView(jListReabProdBuscUMDes);

        getContentPane().add(tablaTamPas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 20, 20));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 680, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        
        

        ReabastecerObj reabaObj = new ReabastecerObj();
        reabaObj.setPrecioCompra(Float.valueOf(jSpinnerCant.getValue().toString()));
        JOptionPane.showMessageDialog(null,reabaManObj.agregarCompra(reabaObj));
        
        
        
        for(ReabastecerHasProductoObj prodCarro : carrito){           
            ReabastecerHasProductoObj reabaHProdAñadir = new ReabastecerHasProductoObj();
            reabaHProdAñadir.setIdProducto(prodCarro.getIdProducto());
            reabaHProdAñadir.setCantidad(prodCarro.getCantidad());           
            reabaManObj.agregarCompraProductos(prodCarro);
            
            Connection conn = ConexionBase.getConnection();
            
            try {
                String sql = "UPDATE Producto SET Existencia =((SELECT Existencia FROM Producto WHERE id_Producto= "+(reabaHProdAñadir.getIdProducto())+" AND id_Estatus = 1)+"+ reabaHProdAñadir.getCantidad()+") WHERE id_Producto="+(reabaHProdAñadir.getIdProducto())+" AND id_Estatus = 1";                 
        
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
        
        
        int numReaba = 0;
        
        try{
             Connection conn = ConexionBase.getConnection();
                    String sqlS = "SELECT id_compra  FROM (select * from Compra ORDER BY id_compra  desc ) WHERE rownum = 1";                 
        
                    Statement st = null;
                    ResultSet rs = null;
                    
                    st = conn.createStatement();
                    rs = st.executeQuery(sqlS);
                    if(rs.next())
                    numReaba = rs.getInt(1);
        
        }catch (SQLException e) {           
            JOptionPane.showMessageDialog(null, "NO se pudo encontar al piloto" + e.getMessage());
                        
        }
        
        try{

            

                    FileOutputStream archivoPdfN;            
                    File file = new File("src/pdfss/compra.pdf");           
                    archivoPdfN = new FileOutputStream(file);
            
            
                    Document doc = new Document();
                    PdfWriter.getInstance(doc,archivoPdfN);
            
            
                    doc.open();
                    
                    Font negrita = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK);
                    Image logo = Image.getInstance("src/Imagenes/logo.png");
            
                    
                    Paragraph fecha = new Paragraph();
                    
                    fecha.add(Chunk.NEWLINE);
            
                    java.util.Date date= new java.util.Date();
                    fecha.add("Empleado: "+Empleado+"\nNumero de Compra: "+numReaba+"\nFecha: "+ new SimpleDateFormat("dd-MM-yyyy").format(date)+"\n\n");
            
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
                    encabezado.addCell(nom + "\nREABASTECIMIENTO DE PRODUCTO\nTelefono: "+tel + "\nDireccion: "+dir);
                    encabezado.addCell(fecha);
            
                    doc.add(encabezado);
                    
                    //Termina encabezado
                    
                    //Empiezan Productos
                    
                    PdfPTable productos = new PdfPTable(3);            
                    encabezado.setWidthPercentage(100);
                    encabezado.getDefaultCell().setBorder(0);
                    
                    float[] columnaProductos = new float[]{20f,30f,70f,};
            
                    encabezado.setWidths(columnaEncabezado);
                    encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);        
                    
                    PdfPCell pro1 = new PdfPCell(new Phrase("Codigo", negrita));
                    PdfPCell pro2 = new PdfPCell(new Phrase("Descripcion", negrita));
                    PdfPCell pro3 = new PdfPCell(new Phrase("Cantidad", negrita));
                    
                    pro1.setBorder(0);
                    pro2.setBorder(0);
                    pro3.setBorder(0);
                    
                    productos.addCell(pro1);
                    productos.addCell(pro2);
                    productos.addCell(pro3);
                    
                    for(ReabastecerHasProductoObj prodCarro : carrito){

                        String cod = String.valueOf(prodCarro.getIdProducto());
                        String desc = prodCarro.getDescripcion();
                        String cant = String.valueOf(prodCarro.getCantidad());
                     
                        productos.addCell(cod);
                        productos.addCell(desc);
                        productos.addCell(cant);
                    }
                    
                    doc.add(productos);
                    
                    //Terminan Productos
                    
            
                    doc.close();
            
                    archivoPdfN.close();
               
                }catch(Exception e){
        
                }
        
        
        try{
            File fileAbrir = new File("src/pdfss/compra.pdf");
            
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
        
        
        jListReabBusqExis.setModel(listaCompra);
        jListReabCant.setModel(listaCompra);
        jListReabCod.setModel(listaCompra);
        jListReabExistencia.setModel(listaCompra);
        jListReabNombre.setModel(listaCompra);
        jListReabPrecio.setModel(listaCompra);
        jListReabProdBuscDesc.setModel(listaCompra);
        jListReabProdBuscID.setModel(listaCompra);
        jListReabProdBuscPrecio.setModel(listaCompra);
        jListReabProdBuscUM.setModel(listaCompra);
        jListReabProdIDTipo.setModel(listaCompra);
        jListReabProdBuscUMDes.setModel(listaCompra);
        jListReabTotal.setModel(listaCompra);
        jListReabUniMed.setModel(listaCompra);

        fieldTotalCompra.setText("");
        
        fieldReabAggPrecio.setText("");
    
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        ProductoObj productoNuevo = new ProductoObj();        
        productoNuevo.setIdProducto(Integer.valueOf(jListReabProdBuscID.getSelectedValue()));
        productoNuevo.setDescripcionProd(jListReabProdBuscDesc.getSelectedValue());
        productoNuevo.setIdUnidadMedida(Integer.valueOf(jListReabProdBuscUM.getSelectedValue()));
        productoNuevo.setPrecio(Float.valueOf(jListReabProdBuscPrecio.getSelectedValue()));
        productoNuevo.setIdTipoProducto(Integer.parseInt(jListReabProdIDTipo.getSelectedValue()));
        productoNuevo.setExistencia(Float.valueOf(jListReabBusqExis.getSelectedValue()));
        
        
        //Objeto de ReabaHasProducto
        ReabastecerHasProductoObj reabaHProd = new ReabastecerHasProductoObj();
        reabaHProd.setIdProducto(Integer.parseInt(jListReabProdBuscID.getSelectedValue()));
        reabaHProd.setCantidad(Float.valueOf(jSpinnerCant.getValue().toString()));
        reabaHProd.setDescripcion(jListReabProdBuscDesc.getSelectedValue());
        
        
        carrito.add(reabaHProd);
        
        
        
        //lista de codigo       
        if(!codigos.contains(jListReabProdBuscID.getSelectedValue())){
            
        //se añade el producto al carrito.
        
        DefaultListModel modelCod= new DefaultListModel(); 
        codigos.add(jListReabProdBuscID.getSelectedValue());
        
        for(String elemento: codigos){
            modelCod.addElement(elemento);
        }        
        jListReabCod.setModel(modelCod);
        
        //
        //Lista de nombre Producto
        DefaultListModel modelNomProd= new DefaultListModel(); 
        nombres.add(jListReabProdBuscDesc.getSelectedValue());
        
        for(String elemento: nombres){
            modelNomProd.addElement(elemento);
        }        
        jListReabNombre.setModel(modelNomProd);
        
        //
        //Lista de Cantidad
        
        DefaultListModel modelCant= new DefaultListModel(); 
        cantidades.add(String.valueOf(jSpinnerCant.getValue()));
        
        for(String elemento: cantidades){
            modelCant.addElement(elemento);
        }        
        jListReabCant.setModel(modelCant);
        
        //
        //Lista de Unidadmedida
        
        DefaultListModel modelUniMed= new DefaultListModel(); 
        unidadesMedida.add(jListReabProdBuscUMDes.getSelectedValue());
        
        for(String elemento: unidadesMedida){
            modelUniMed.addElement(elemento);
        }        
        jListReabUniMed.setModel(modelUniMed);
        
        //
        //Lista de Precio Unidad
        
        DefaultListModel modelPrecios= new DefaultListModel(); 
        preciosUnidad.add(jListReabProdBuscPrecio.getSelectedValue());
        
        for(String elemento: preciosUnidad){
            modelPrecios.addElement(elemento);
        }        
        jListReabPrecio.setModel(modelPrecios);
        
        //
        //Lista de precio Total
        
        DefaultListModel modelTotales= new DefaultListModel(); 
        totalesProd.add(fieldReabAggPrecio.getText());
        
        for(String elemento: totalesProd){
            modelTotales.addElement(elemento);
        }        
        jListReabTotal.setModel(modelTotales);
        
        
        DefaultListModel modelTotalesF= new DefaultListModel(); 
        totalesProdF.add(Float.parseFloat(fieldReabAggPrecio.getText()));
        
        for(String elemento: totalesProd){
            modelTotalesF.addElement(elemento);
        }        
        jListReabTotal.setModel(modelTotalesF);
        
//
        //Listas de Existencias
        DefaultListModel modelExistenncias= new DefaultListModel(); 
        existencias.add(jListReabBusqExis.getSelectedValue());
        
        for(String elemento: existencias){
            modelExistenncias.addElement(elemento);
        }        
        jListReabExistencia.setModel(modelExistenncias);
       
        
        ///
        }
        
        float totalCompra = 0;
        
        for(float suma : totalesProdF){          
            totalCompra+=suma;   
        }
        
        fieldTotalCompra.setText(String.valueOf(totalCompra));
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jListReabNombreValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabNombreValueChanged
        // TODO add your handling code here:
        
        if(jListReabNombre.getSelectedIndex()>-1){
            int ix = jListReabNombre.getSelectedIndex();
            jListReabCod.setSelectedIndex(ix);
            jListReabCant.setSelectedIndex(ix);
            jListReabUniMed.setSelectedIndex(ix);
            jListReabTotal.setSelectedIndex(ix);
            jListReabPrecio.setSelectedIndex(ix);
            
        }


    }//GEN-LAST:event_jListReabNombreValueChanged

    private void jListReabCodValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabCodValueChanged
        // TODO add your handling code here:
        
        if(jListReabCod.getSelectedIndex()>-1){
            int ix = jListReabCod.getSelectedIndex();
            jListReabNombre.setSelectedIndex(ix);
            jListReabCant.setSelectedIndex(ix);
            jListReabUniMed.setSelectedIndex(ix);
            jListReabTotal.setSelectedIndex(ix);
            jListReabPrecio.setSelectedIndex(ix);
            jListReabExistencia.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListReabCodValueChanged

    private void jListReabCantValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabCantValueChanged
        // TODO add your handling code here:
        
        if(jListReabCant.getSelectedIndex()>-1){
            int ix = jListReabCant.getSelectedIndex();
            jListReabCod.setSelectedIndex(ix);
            jListReabNombre.setSelectedIndex(ix);
            jListReabUniMed.setSelectedIndex(ix);
            jListReabTotal.setSelectedIndex(ix);
            jListReabPrecio.setSelectedIndex(ix);
            
        }

    }//GEN-LAST:event_jListReabCantValueChanged

    private void jListReabUniMedValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabUniMedValueChanged
        // TODO add your handling code here:
        
        if(jListReabUniMed.getSelectedIndex()>-1){
            int ix = jListReabUniMed.getSelectedIndex();
            jListReabCod.setSelectedIndex(ix);
            jListReabCant.setSelectedIndex(ix);
            jListReabNombre.setSelectedIndex(ix);
            jListReabTotal.setSelectedIndex(ix);
            jListReabPrecio.setSelectedIndex(ix);
            
        }

    }//GEN-LAST:event_jListReabUniMedValueChanged

    private void jListReabProdBuscDescValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabProdBuscDescValueChanged
        // TODO add your handling code here:
        
        if(jListReabProdBuscDesc.getSelectedIndex()>-1){
            
            int ix = jListReabProdBuscDesc.getSelectedIndex();
            
            jListReabProdBuscID.setSelectedIndex(ix);
            jListReabProdBuscPrecio.setSelectedIndex(ix);
            jListReabProdBuscUM.setSelectedIndex(ix);
            jListReabProdBuscUMDes.setSelectedIndex(ix);
            jListReabProdIDTipo.setSelectedIndex(ix);
            jListReabBusqExis.setSelectedIndex(ix);
            
            float precio;
            precio = Float.valueOf(jListReabProdBuscPrecio.getSelectedValue());
            
            fieldReabAggPrecio.setText(String.valueOf(precio));
            
            jSpinnerCant.setValue(1);
            
            
        }
        
    }//GEN-LAST:event_jListReabProdBuscDescValueChanged

    private void jListReabPrecioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabPrecioValueChanged
        // TODO add your handling code here:
        
        if(jListReabPrecio.getSelectedIndex()>-1){
            int ix = jListReabPrecio.getSelectedIndex();
            jListReabCod.setSelectedIndex(ix);
            jListReabCant.setSelectedIndex(ix);
            jListReabNombre.setSelectedIndex(ix);
            jListReabTotal.setSelectedIndex(ix);
            jListReabUniMed.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListReabPrecioValueChanged

    private void jListReabTotalValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabTotalValueChanged
        // TODO add your handling code here:
        
        if(jListReabTotal.getSelectedIndex()>-1){
            int ix = jListReabTotal.getSelectedIndex();
            jListReabCod.setSelectedIndex(ix);
            jListReabCant.setSelectedIndex(ix);
            jListReabNombre.setSelectedIndex(ix);
            jListReabPrecio.setSelectedIndex(ix);
            jListReabUniMed.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListReabTotalValueChanged

    private void jListReabProdBuscIDValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabProdBuscIDValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListReabProdBuscIDValueChanged

    private void jListReabProdBuscPrecioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabProdBuscPrecioValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListReabProdBuscPrecioValueChanged

    private void jListReabProdBuscUMValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabProdBuscUMValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListReabProdBuscUMValueChanged

    private void jListReabProdBuscUMDesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabProdBuscUMDesValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListReabProdBuscUMDesValueChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        String busq = fieldCompraBusq.getText();
        
        reabaManObj.listarCompraBusqProd(jListReabProdBuscDesc, busq);
        reabaManObj.productoBusqPrecio(jListReabProdBuscPrecio, busq);
        reabaManObj.listarCompraBusqID(jListReabProdBuscID, busq);
        reabaManObj.productoBusqUM(jListReabProdBuscUM, busq);
        reabaManObj.productoBusqUMDesc(jListReabProdBuscUMDes, busq);       
        reabaManObj.productoBusqIDTipo(jListReabProdIDTipo, busq);
        
        
        reabaManObj.productoBusqExis(jListReabBusqExis, busq);
        
        jListReabProdBuscPrecio.setVisible(false);
        jListReabProdBuscID.setVisible(false);
        jListReabProdBuscUM.setVisible(false);
        jListReabProdBuscUMDes.setVisible(false);
        jListReabProdIDTipo.setVisible(false);        
        jListReabBusqExis.setVisible(true);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jSpinnerCantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantStateChanged
        // TODO add your handling code here:
        float precio = (Float.valueOf(jListReabProdBuscPrecio.getSelectedValue()))*(Float.parseFloat(jSpinnerCant.getValue().toString()));

        fieldReabAggPrecio.setText(String.valueOf(precio));
    }//GEN-LAST:event_jSpinnerCantStateChanged

    private void jListReabProdIDTipoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabProdIDTipoValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListReabProdIDTipoValueChanged

    private void jListReabBusqExisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabBusqExisValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListReabBusqExisValueChanged

    private void jListReabExistenciaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListReabExistenciaValueChanged
        // TODO add your handling code here:
        
        if(jListReabExistencia.getSelectedIndex()>-1){
            int ix = jListReabExistencia.getSelectedIndex();
            jListReabNombre.setSelectedIndex(ix);
            jListReabCant.setSelectedIndex(ix);
            jListReabUniMed.setSelectedIndex(ix);
            jListReabTotal.setSelectedIndex(ix);
            jListReabPrecio.setSelectedIndex(ix);
            jListReabCod.setSelectedIndex(ix);
            
        }
        
    }//GEN-LAST:event_jListReabExistenciaValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultListModel modelCod= new DefaultListModel();
        
        carrito.removeAll(carrito);
        codigos.removeAll(codigos);
        nombres.removeAll(nombres);
        cantidades.removeAll(cantidades);
        unidadesMedida.removeAll(unidadesMedida);
        preciosUnidad.removeAll(preciosUnidad);
        totalesProd.removeAll(totalesProd);
        totalesProdF.removeAll(totalesProdF);
        
        jListReabExistencia.setModel(modelCod);
        jListReabNombre.setModel(modelCod);
        jListReabCant.setModel(modelCod);
        jListReabUniMed.setModel(modelCod);
        jListReabTotal.setModel(modelCod);
        jListReabPrecio.setModel(modelCod);
        jListReabCod.setModel(modelCod);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fieldTotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTotalCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTotalCompraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReabastecerFrut().setVisible(true);  
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField fieldCompraBusq;
    private javax.swing.JTextField fieldReabAggPrecio;
    private javax.swing.JTextField fieldTotalCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListReabBusqExis;
    private javax.swing.JList<String> jListReabCant;
    private javax.swing.JList<String> jListReabCod;
    private javax.swing.JList<String> jListReabExistencia;
    private javax.swing.JList<String> jListReabNombre;
    private javax.swing.JList<String> jListReabPrecio;
    private javax.swing.JList<String> jListReabProdBuscDesc;
    private javax.swing.JList<String> jListReabProdBuscID;
    private javax.swing.JList<String> jListReabProdBuscPrecio;
    private javax.swing.JList<String> jListReabProdBuscUM;
    private javax.swing.JList<String> jListReabProdBuscUMDes;
    private javax.swing.JList<String> jListReabProdIDTipo;
    private javax.swing.JList<String> jListReabTotal;
    private javax.swing.JList<String> jListReabUniMed;
    private javax.swing.JSpinner jSpinnerCant;
    private javax.swing.JLabel lblPasteles;
    private javax.swing.JScrollPane tablaTamPas;
    private javax.swing.JScrollPane tablaTamPas1;
    private javax.swing.JScrollPane tablaTamPas10;
    private javax.swing.JScrollPane tablaTamPas11;
    private javax.swing.JScrollPane tablaTamPas12;
    private javax.swing.JScrollPane tablaTamPas13;
    private javax.swing.JScrollPane tablaTamPas14;
    private javax.swing.JScrollPane tablaTamPas2;
    private javax.swing.JScrollPane tablaTamPas3;
    private javax.swing.JScrollPane tablaTamPas5;
    private javax.swing.JScrollPane tablaTamPas6;
    private javax.swing.JScrollPane tablaTamPas7;
    private javax.swing.JScrollPane tablaTamPas8;
    private javax.swing.JScrollPane tablaTamPas9;
    // End of variables declaration//GEN-END:variables
}
