
package AccesoDatos;

import java.sql.*;
import javax.swing.*;
import Clases.VentaObj;
import AccesoDatos.ConexionBase;
import Clases.VentaHasProductosObj;
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
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.JList;


public class VentaDatos {
    
    private String mensaje;
    
    public String agregarVenta(Connection con, VentaObj ventaObj){
        
        String sqlS = "SELECT id_venta FROM Ventas WHERE id_venta="+(ventaObj.getIdVenta())+"";                 
        
        Statement st = null;
        ResultSet rs = null;
        
        String sqlUsuario = "SELECT NombreEmpleado FROM UsuarioUso S, Usuarios U WHERE S.id_Usuario = U.id_Usuario AND S.id_Uso = 1";
        Statement stUsuario = null;
        ResultSet rsUsuario = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sqlS);
            if (!rs.next()) {
                
                stUsuario = con.createStatement();
                rsUsuario = st.executeQuery(sqlUsuario);
                
                //String usuariooo = rsUsuario.getString(1);
                
                PreparedStatement pst = null;
                String sql = "INSERT INTO Ventas(id_venta,id_Usuario,FechaVenta, precioVenta)" + " VALUES(seq_Venta_idVenta.nextval,?,SYSDATE,?)";  
                try {
            
                    pst = con.prepareStatement(sql);
                    pst.setInt(1,3);
                    pst.setFloat(2,ventaObj.getPrecioVenta());
                    
                      
                    mensaje = "Guardado Correctamente";
                    pst.execute();
                    pst.close();
            
            
                } catch (SQLException e) {
            
                mensaje = "No se pudo guardar correctamente \n "+ e.getMessage(); 
            
                }

            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar correctamente \n "+ e.getMessage());
            
        }
        
        
    
        return mensaje;
    }
    
    public String agregarVentaHProd(Connection con, VentaHasProductosObj ventaHProdObj){
        
        PreparedStatement pst = null;
        
        
            String sql = "INSERT INTO Ventas_has_Producto(id_venta,ID_Producto,Cantidad)" + " VALUES((SELECT id_venta FROM (select * from Ventas ORDER BY id_venta desc ) WHERE rownum = 1),?,"+Float.valueOf(ventaHProdObj.getCantidad())+")";  
             try {
            
                pst = con.prepareStatement(sql);
                pst.setInt(1,ventaHProdObj.getIdProductoV());
            
            
                mensaje = "Guardado Correctamente";
                pst.execute();
                pst.close();
                
                
                try{
                    
                    /*String sqlS = "SELECT id_Compra FROM (select * from Compra ORDER BY id_Compra desc ) WHERE rownum = 1";                 
        
                    Statement st = null;
                    ResultSet rs = null;
                    
                    st = con.createStatement();
                    rs = st.executeQuery(sqlS);
                    
                    String numCom = rs.getString(1);
            
                     */

                    FileOutputStream archivoPdfN;            
                    File file = new File("src/pdfss/compra.pdf");           
                    archivoPdfN = new FileOutputStream(file);
            
            
                    Document doc = new Document();
                    PdfWriter.getInstance(doc,archivoPdfN);
            
            
                    doc.open();
            
                    Image logo = Image.getInstance("src/Imagenes/logo.png");
            
                    Paragraph fecha = new Paragraph();
                    Font negrita = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLUE);
                    fecha.add(Chunk.NEWLINE);
            
                    java.util.Date date= new java.util.Date();
                    fecha.add("Numero de Compra: 1 \nFecha: "+ new SimpleDateFormat("dd-mm-yyyy").format(date)+"\n\n");
            
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
                    encabezado.addCell(nom + "\nTelefono: "+tel + "\nDireccion: "+dir);
                    encabezado.addCell(fecha);
            
                    doc.add(encabezado);
                    
                    //Termina encabezado
                    
                    //Empiezan Productos
                    
                    PdfPTable productos = new PdfPTable(4);            
                    encabezado.setWidthPercentage(100);
                    encabezado.getDefaultCell().setBorder(0);
                    
                    float[] columnaProductos = new float[]{20f,30f,70f,40f};
            
                    encabezado.setWidths(columnaEncabezado);
                    encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);        
                    
                    PdfPCell pro1 = new PdfPCell(new Phrase("Codigo"));
                    PdfPCell pro2 = new PdfPCell(new Phrase("Descripcion"));
                    PdfPCell pro3 = new PdfPCell(new Phrase("Cantidad"));
                    
                    pro1.setBorder(0);
                    pro2.setBorder(0);
                    pro3.setBorder(0);
                    
                    productos.addCell(pro1);
                    productos.addCell(pro2);
                    productos.addCell(pro3);
                    
                    
                    
                    //Terminan Productos
                    
            
                    doc.close();
            
                    archivoPdfN.close();
               
                }catch(Exception e){
        
                }

            
                } catch (SQLException e) {
            
                    mensaje = "No se pudo guardar correctamente \n "+ e.getMessage(); 
            
                }

        return mensaje;
    }
    
    
    public String listarProdBusq(Connection con, JList lista, String busqueda){

        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT DescripcionProd FROM Producto WHERE DescripcionProd LIKE '"+busqueda+"%' AND id_Estatus = 1";                 
        
        String [] filas = new String [1];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                filas[0] = rs.getString(1);
                model.addElement(filas[0]);
            }
            lista.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay Productos registrados actualmente");
            
        }

        return null;
    }
    
    
    
    public String listarProdPrecioB(Connection con, JList lista, String busq){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT Precio FROM Producto WHERE DescripcionProd LIKE '"+busq+"%' AND id_Estatus = 1";                 
        
        String [] filas = new String [1];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                filas[0] = rs.getString(1);
                model.addElement(filas[0]);
            }
            lista.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay Productos registrados actualmente");
            
        }
 
    
        return null;
    }
    
    public String listarProdID(Connection con, JList lista, String busq){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT ID_Producto FROM Producto WHERE DescripcionProd LIKE '"+busq+"%' AND id_Estatus = 1";                 
        
        String [] filas = new String [1];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                filas[0] = rs.getString(1);
                model.addElement(filas[0]);
            }
            lista.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay Productos registrados actualmente");
            
        }
 
    
        return null;
    }
    
    public String listarProdUnidadMed(Connection con, JList lista, String busq){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT id_UnidadMedida FROM Producto WHERE DescripcionProd LIKE '"+busq+"%' AND id_Estatus = 1";                 
        
        String [] filas = new String [1];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                filas[0] = rs.getString(1);
                model.addElement(filas[0]);
            }
            lista.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay Productos registrados actualmente");
            
        }

        return null;
    }
    
    
    public String listarProdUMDes(Connection con, JList lista,String busq){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT DescripcionUM FROM UnidadMedida M, Producto P WHERE M.id_UnidadMedida = P.id_UnidadMedida AND P.DescripcionProd LIKE '"+busq+"%' AND P.id_Estatus = 1";                 
        
        String [] filas = new String [1];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                filas[0] = rs.getString(1);
                model.addElement(filas[0]);
            }
            lista.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay Productos registrados actualmente");
            
        }

        return null;
    }
    
    
    
}
