
package AccesoDatos;

import java.sql.*;
import javax.swing.*;
import AccesoDatos.ConexionBase;
import Clases.ProductoObj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JList;
import javax.swing.JComboBox;


public class ProductoData {
    
    private String mensaje;
    
    public String agregarProd(Connection con, ProductoObj producto){
        
        String sqlS = "SELECT DescripcionProd FROM Producto WHERE DescripcionProd='"+producto.getDescripcionProd()+"'";                 
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sqlS);
            if (!rs.next()) {
        
                PreparedStatement pst = null;
                String sql = "INSERT INTO Producto(ID_Producto,id_UnidadMedida,id_TipoProducto,id_estatus,DescripcionProd,Precio,Existencia)" + " VALUES(seq_Prod_idProd.nextval,?,?,?,?,?,?)";  
                try {
            
                    pst = con.prepareStatement(sql);
                    pst.setInt(1,producto.getIdUnidadMedida());
                    pst.setInt(2,producto.getIdTipoProducto());
                    pst.setInt(3,1);
                    pst.setString(4,producto.getDescripcionProd());
                    pst.setFloat(5,producto.getPrecio());
                    pst.setFloat(6,0);
            
            
                    mensaje = "Guardado Correctamente";
                    pst.execute();
                    pst.close();
            
            
                } catch (SQLException e) {           
                    mensaje = "No se pudo guardar correctamente \n "+ e.getMessage();            
                }
            }else{
                mensaje = "Ese Producto ya esta registrado";
            }
            }catch(SQLException e){                
                mensaje = "No se pudo guardar correctamente \n "+ e.getMessage();             
        }
    
        return mensaje;
    }
    
    
    public String eliminarProd(Connection con, ProductoObj producto){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Producto SET id_Estatus = 2 WHERE DescripcionProd = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1,producto.getDescripcionProd());
              
            mensaje = "Eliminado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo eliminar el registro \n "+ e.getMessage(); 
            
        }
    
        return mensaje;
    }
    
    public String actualizarProd(Connection con, ProductoObj producto, String antes){

        try {
            
            actualizarProdTipoP(con, producto);
            actualizarProdUniM(con, producto);
            actualizarProdPrecio(con, producto);
            actualizarProdDesc(con, producto,antes);
                  
        } catch (Exception e) {
            
            mensaje = "No se pudo actualizar el registro \n "+ e.getMessage(); 
            
        }
    
        return mensaje;
    }
    
    
    
       
    public String listarProdNum(Connection con, JList lista){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT ID_Producto FROM Producto WHERE ID_Producto>0 AND id_Estatus=1";                 
        
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
    
    public String listarProdDesc(Connection con, JList lista){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT DescripcionProd FROM Producto WHERE ID_Producto>0 AND id_Estatus = 1";                 
        
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
    
    
    public String listarProdTipoProd(Connection con, JList lista){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT DescripcionTipo FROM TipoProducto T, Producto P WHERE T.id_TipoProducto = P.id_TipoProducto AND P.id_Producto>0 AND P.id_Estatus = 1";                 
        
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
            JOptionPane.showMessageDialog(null, "NO hay Tipos de Producto registrados actualmente");
            
        }
 
    
        return null;
    }
    
    
    public String listarProdUnidadMed(Connection con, JList lista){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT DescripcionUM FROM UnidadMedida M, Producto P WHERE M.id_UnidadMedida = P.id_UnidadMedida AND P.ID_Producto>0 AND P.id_Estatus = 1";                 
        
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
    
    
    public String listarProdPrecio(Connection con, JList lista){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT Precio FROM Producto WHERE ID_Producto>0 AND id_Estatus = 1";                 
        
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
    
    public String listarProdExis(Connection con, JList lista){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT Existencia FROM Producto WHERE ID_Producto>0 AND id_Estatus =1";                 
        
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
            JOptionPane.showMessageDialog(null, "NO hay unidades de Medida registrados actualmente");
            
        }
        
        return null;
    }
    
    public String listarProdEst(Connection con, JList lista){
        
        
        DefaultListModel model;
        model = new DefaultListModel();
        
        String sql = "SELECT DescripcionEst FROM Estatus E, Producto P  WHERE P.id_Estatus = E.id_Estatus AND P.ID_Producto>0 AND P.id_Estatus =1";                 
        
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
            JOptionPane.showMessageDialog(null, "NO hay unidades de Medida registrados actualmente");
            
        }  
        return null;
    }
    
    
    
    public String listarjComboTipo(Connection con, JComboBox combo){
        
        
        DefaultComboBoxModel model;
        model = new DefaultComboBoxModel();
        
        String sql = "SELECT DescripcionTipo FROM TipoProducto WHERE id_TipoProducto>0 AND id_Estatus = 1";                 
        
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
            combo.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay unidades de Medida registrados actualmente");          
        }
        return null;
    }
    
    public String listarjComboUniMed(Connection con, JComboBox combo){
        
        
        DefaultComboBoxModel model;
        model = new DefaultComboBoxModel();
        
        String sql = "SELECT DescripcionUM FROM UnidadMedida WHERE id_UnidadMedida>0 AND id_Estatus = 1";                 
        
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
            combo.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay unidades de Medida registrados actualmente");
            
        }
 
    
        return null;
    }
    
    //Temrinan los metodos de listar
    
    
    //METODO PARA SELECCION DE COMBOBOX
    
    
    public int seleccionComboTipoProd(Connection con, String busca){
    
        int resultado = 0;
        try {       
        String sql = "SELECT id_TipoProducto FROM TipoProducto  WHERE DescripcionTipo ='"+ busca +"'";                           
        Statement st = null;
        ResultSet rs = null;
        
        
        st = con.createStatement();
        rs = st.executeQuery(sql);
        
        if(rs.next()){        
            resultado = rs.getInt(1);       
        }else{       
            resultado = -1;           
        }
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el tipo de producto" + e.getMessage());            
            return resultado;
        }
        
        return resultado;
    }
    
 
    //Empiezan los subMetodos de Actualizar
    
    public String actualizarProdTipoP(Connection con, ProductoObj producto){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Producto SET id_TipoProducto = ? WHERE DescripcionProd = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setInt(1,producto.getIdTipoProducto());
            pst.setString(2,producto.getDescripcionProd());
              
            mensaje = "Actualizado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo actualizar el registro \n "+ e.getMessage(); 
            
        }

        return mensaje;
    }
    
    public String actualizarProdUniM(Connection con, ProductoObj producto){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Producto SET id_UnidadMedida = ? WHERE DescripcionProd = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setInt(1,producto.getIdUnidadMedida());
            pst.setString(2,producto.getDescripcionProd());
              
            mensaje = "Actualizado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo actualizar el registro \n "+ e.getMessage(); 
            
        }

        return mensaje;
    }
   
    public String actualizarProdDesc(Connection con, ProductoObj producto, String antes){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Producto SET DescripcionProd = ? WHERE DescripcionProd = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1,producto.getDescripcionProd());
            pst.setString(2,antes);
              
            mensaje = "Actualizado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo actualizar el registro \n "+ e.getMessage(); 
            
        }

        return mensaje;
    }
    
    public String actualizarProdPrecio(Connection con, ProductoObj producto){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Producto SET precio = ? WHERE DescripcionProd = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setFloat(1,producto.getPrecio());
            pst.setString(2,producto.getDescripcionProd());
              
            mensaje = "Actualizado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo actualizar el registro \n "+ e.getMessage(); 
            
        }

        return mensaje;
    }
    
    
}
