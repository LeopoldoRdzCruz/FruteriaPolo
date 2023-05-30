
package AccesoDatos;

import java.sql.*;
import javax.swing.*;
import Clases.UnidadMedObj;
import AccesoDatos.ConexionBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JList;


public class UnidadMedData {
    
    
    private String mensaje;
    
    public String agregarUnidadMed(Connection con, UnidadMedObj unidadMedida){
        
        
        
        
        String sqlS = "SELECT DescripcionUM FROM UnidadMedida WHERE DescripcionUM='"+unidadMedida.getDescripcion()+"'";                 
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sqlS);
            if (!rs.next()) {

                PreparedStatement pst = null;
                String sql = "INSERT INTO UnidadMedida(id_UnidadMedida,DescripcionUM,id_Estatus)" + " VALUES(seq_unidadmedida_idunidad.nextval,?,?)";  
                try {
            
                    pst = con.prepareStatement(sql);

                    pst.setString(1,unidadMedida.getDescripcion());
                    pst.setInt(2,1);
            
            
                    mensaje = "Guardado Correctamente";
                    pst.execute();
                    pst.close();
            
            
                } catch (SQLException e) {           
                    mensaje = "No se pudo guardar correctamente \n "+ e.getMessage();            
                }
                
            }else{
                mensaje = "Ese tipo de producto ya esta registrado";
            }

            
        } catch (Exception e) {
            mensaje = "No se pudo guardar correctamente \n "+ e.getMessage();
        }
        
    
        return mensaje;
    }
    
    
    public String eliminarUnidadMed(Connection con, UnidadMedObj unidadMedida){
        
        PreparedStatement pst = null;
        String sql = "UPDATE UnidadMedida SET id_Estatus = 2 WHERE DescripcionUM = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1,unidadMedida.getDescripcion());
              
            mensaje = "Eliminado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo eliminar el registro \n "+ e.getMessage(); 
            
        }
    
        return mensaje;
    }
    
    
    public String actualizarUnidadMed(Connection con, UnidadMedObj unidadMedida, String nuevo){
        
        PreparedStatement pst = null;
        String sql = "UPDATE UnidadMedida SET DescripcionUM = ? WHERE DescripcionUM = ?";  
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1,nuevo);
            pst.setString(2,unidadMedida.getDescripcion());
              
            mensaje = "Actualizado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo Actualizar el registro \n "+ e.getMessage(); 
            
        }
    
        return mensaje;
    }
    
       
    public String listarUnidadMedDesc(Connection con, JList lista){
        
        
        DefaultListModel model;
        String [] columnas = {"UNIDAD DE MEDIDA"};
        model = new DefaultListModel();
        
        String sql = "SELECT DESCRIPCIONUM FROM UnidadMedida WHERE id_UnidadMedida>0 AND id_Estatus = 1";                 
        
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
    
    public String listarUnidadMedNum(Connection con, JList lista){
        
        
        DefaultListModel model;
        String [] columnas = {"NUMERO"};
        model = new DefaultListModel();
        
        String sql = "SELECT id_UnidadMedida FROM UnidadMedida WHERE id_UnidadMedida>0 AND id_Estatus = 1";                 
        
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

    
    
    
}
