
package AccesoDatos;

import java.sql.*;
import javax.swing.*;
import Clases.TipoProdObj;
import AccesoDatos.ConexionBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JList;

public class TipoProdData {
    
    private String mensaje;
    
    public String agregarTipoProd(Connection con, TipoProdObj tipoProd){
        
        String sqlS = "SELECT DescripcionTipo FROM tipoproducto WHERE DescripcionTipo='"+tipoProd.getDescripcion()+"'";                 
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sqlS);
            if (!rs.next()) {
                
                PreparedStatement pst = null;
                String sql = "INSERT INTO TipoProducto(id_TipoProducto,id_Estatus,DescripcionTipo)" + " VALUES(seq_TipoProd_idTipoProd.nextval,?,?)";  
                try {
            
                    pst = con.prepareStatement(sql);
                    pst.setInt(1,1);
                    pst.setString(2,tipoProd.getDescripcion());
            
            
                    mensaje = "Guardado Correctamente";
                    pst.execute();
                    pst.close();
            
            
                } catch (SQLException e) {
            
                mensaje = "No se pudo guardar correctamente \n "+ e.getMessage(); 
            
                }

            }else{
                mensaje = "Esta Unidad de Medida ya esta registrada";
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay unidades de Medida registrados actualmente");
            
        }
        
        
    
        return mensaje;
    }
    
    
    public String eliminarTipoProd(Connection con, TipoProdObj tipoProd){
        
        PreparedStatement pst = null;
        String sql = "UPDATE TipoProducto SET id_Estatus = 2 WHERE DescripcionTipo = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1,tipoProd.getDescripcion());
              
            mensaje = "Eliminado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo eliminar el registro \n "+ e.getMessage(); 
            
        }
    
        return mensaje;
    }
    
    public String actualizarTipoProd(Connection con, TipoProdObj tipoProd,String nuevo){
        
        PreparedStatement pst = null;
        String sql = "UPDATE TipoProducto SET DescripcionTipo = ? WHERE DescripcionTipo = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1,nuevo);
            pst.setString(2,tipoProd.getDescripcion());
              
            mensaje = "Actualizado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo Actualizar el registro \n "+ e.getMessage(); 
            
        }
    
        return mensaje;
    }
    
       
    public String listarTipoProddDesc(Connection con, JList lista){
        
        
        DefaultListModel model;
        String [] columnas = {"TIPO DE PRODUCTO"};
        model = new DefaultListModel();
        
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
            lista.setModel(model);
            
        } catch (Exception e) {
            
        }
 
    
        return null;
    }
    
    public String listarTipoProdNum(Connection con, JList lista){
        
        
        DefaultListModel model;
        String [] columnas = {"NUM"};
        model = new DefaultListModel();
        
        String sql = "SELECT id_TipoProducto FROM TipoProducto WHERE id_TipoProducto>0AND id_Estatus = 1";                 
        
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
            
        }
    
        return null;
    }
    
    
}
