
package AccesoDatos;

import java.sql.*;
import javax.swing.*;
import Clases.UsuariosFrutObj;
import javax.swing.table.DefaultTableModel;
import AccesoDatos.ConexionBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JList;


public class UsuariosFrutData {
    
    
    private String mensaje;
    
    
    
    public String agregarUsuario(Connection con, UsuariosFrutObj usuario){
        
        String sqlS = "SELECT correoUsuario FROM Usuarios WHERE correoUsuario='"+usuario.getCorreoUsuario()+"'";                 
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sqlS);
            if (!rs.next()) {
                PreparedStatement pst = null;
                String sql = "INSERT INTO Usuarios(id_Usuario,id_TipoUsuario,id_estatus,Contrasena,correoUsuario,NombreEmpleado)" + " VALUES(seq_usuarios_idusuario.nextval,?,?,?,?,?)";  
                try {
            
                    pst = con.prepareStatement(sql);
                    pst.setInt(1,usuario.getTipoUsuario());
                    pst.setInt(2,1);
                    pst.setString(3,usuario.getContrasena());
                    pst.setString(4,usuario.getCorreoUsuario());
                    pst.setString(5,usuario.getNombreEmpleado());
                    
            
                    mensaje = "Guardado Correctamente";
                    pst.execute();
                    pst.close();
            
            
                } catch (SQLException e) {
            
                    mensaje = "No se pudo guardar correctamente \n "+ e.getMessage(); 
            
                }
            }else{
                mensaje = "Ese usuario ya esta registrado";
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo hacer el registro");
            
        }    
    
        return mensaje;
    }
    
    
    public String eliminarUsuario(Connection con, UsuariosFrutObj usuario){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Usuarios SET id_estatus = 1 WHERE correoUsuario = ?";  
        try {
            
            
            pst = con.prepareStatement(sql);
            pst.setString(1,usuario.getCorreoUsuario());
              
            mensaje = "Eliminado de forma exitosa";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo eliminar el registro \n "+ e.getMessage(); 
            
        }
    
        return mensaje;
    }
    
    public String cambiarContraseña(Connection con, UsuariosFrutObj usuario){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Usuarios SET contrasena = ? WHERE correoUsuario = ?";  
        try {

            
            pst = con.prepareStatement(sql);
            pst.setString(1,usuario.getContrasena());
            pst.setString(2,usuario.getCorreoUsuario());
              
            mensaje = " Usuario Actualizado correctamente";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se actualizo la contraseña correctamente \n "+ e.getMessage(); 
            
        }
    
        return mensaje;
    }
    
    public String actualizarUsuarioNombre(Connection con, UsuariosFrutObj usuario){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Usuarios SET NombreEmpleado = ? WHERE correoUsuario = ?";  
        try {

            
            pst = con.prepareStatement(sql);
            pst.setString(1,usuario.getNombreEmpleado());
            pst.setString(2,usuario.getCorreoUsuario());
              
            mensaje = "Usuario Actualizado correctamente";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se actualizo correctamente \n "+ e.getMessage(); 
            
        }
        
    
        return mensaje;
    }
    
    public String actualizarUsuarioCorreo(Connection con, UsuariosFrutObj usuario, String correoAntes){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Usuarios SET correoUsuario = ? WHERE correoUsuario = ?";  
        try {

            
            pst = con.prepareStatement(sql);
            pst.setString(1,usuario.getCorreoUsuario());
            pst.setString(2,correoAntes);
              
            mensaje = "Usuario Actualizado correctamente";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se actualizo correctamente \n "+ e.getMessage(); 
            
        }
        
    
        return mensaje;
    }
    
    
    public String actualizarUsuarioTipoUs(Connection con, UsuariosFrutObj usuario){
        
        PreparedStatement pst = null;
        String sql = "UPDATE Usuarios SET id_TipoUsuario = ? WHERE correoUsuario = ?";  
        try {

            
            pst = con.prepareStatement(sql);
            pst.setInt(1,usuario.getTipoUsuario());
            pst.setString(2,usuario.getCorreoUsuario());
              
            mensaje = "Usuario Actualizado correctamente";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se actualizo correctamente \n "+ e.getMessage(); 
            
        }
        
    
        return mensaje;
    }
    
       
    public String listarUsuarioNom(Connection con, JList lista){
        
        
        DefaultListModel model;
        String [] columnas = {"NOMBRE"};
        model = new DefaultListModel();
        
        String sql = "SELECT NombreEmpleado FROM Usuarios WHERE id_Usuario>0 AND id_Estatus = 1";                 
        
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
            JOptionPane.showMessageDialog(null, "NO hay Usuarios registrados actualmente");
            
        }
 
    
        return null;
    }
    
    public String listarUsuarioCorreo(Connection con, JList lista){
        
        
        DefaultListModel model;
        String [] columnas = {"CORREO"};
        model = new DefaultListModel();
        
        String sql = "SELECT correoUsuario FROM Usuarios WHERE id_Usuario>0 AND id_Estatus = 1";                 
        
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
            JOptionPane.showMessageDialog(null, "NO hay Usuarios registrados actualmente");
            
        }
 
    
        return null;
    }
    
    
    public String listarUsuariotipoUsuario(Connection con, JList lista){
        
        
        DefaultListModel model;
        String [] columnas = {"TIPO USUARIO"};
        model = new DefaultListModel();
        
        String sql = "SELECT DESCRIPCIONTU FROM TIPOUSUARIO T, USUARIOS U, ESTATUS E WHERE  U.ID_ESTATUS = E.ID_ESTATUS AND U.ID_TIPOUSUARIO = T.ID_TIPOUSUARIO AND U.ID_USUARIO>0 AND U.ID_ESTATUS=1";                 
        
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
            JOptionPane.showMessageDialog(null, "NO hay Usuarios registrados actualmente");
            
        }
 
    
        return null;
    }
    
    public String listarUsuarioEst(Connection con, JList lista){
        
        
        DefaultListModel model;
        String [] columnas = {"ESTATUS"};
        model = new DefaultListModel();
        
        String sql = "SELECT DESCRIPCIONEST FROM TIPOUSUARIO T, USUARIOS U, ESTATUS E WHERE  U.ID_ESTATUS = E.ID_ESTATUS AND U.ID_TIPOUSUARIO = T.ID_TIPOUSUARIO AND U.ID_USUARIO>0 AND U.ID_ESTATUS>0";                 
        
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
            JOptionPane.showMessageDialog(null, "NO hay Usuarios registrados actualmente");
            
        }
 
    
        return null;
    }
    
    
    
    
}
