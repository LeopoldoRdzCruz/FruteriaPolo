
package AccesoDatos;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import Clases.LoginObj;
import java.awt.HeadlessException;

public class LoginDatos {
    
    private String mensaje;  
    
      
    public int tipoUsuarioSesion(Connection con, LoginObj loginobj){
    
        int tipo = -1;
        
        try {    
            
            String sql = "SELECT id_TipoUsuario FROM USUARIOS WHERE NombreEmpleado='"+ loginobj.getNombreEmpleado() + "' AND Contrasena ='" + loginobj.getContraseña()+"' AND id_Estatus =1";                 
            
            Statement st = null;
            ResultSet rs = null;
        
        
            st = con.createStatement();
            rs = st.executeQuery(sql);
        
            if(rs.next()){
                tipo = rs.getInt(1);       
            }else{
            
            }      
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "tipo" + e.getMessage());            
           
        }

        return tipo;
    }
     
     public int buscarUsuarioi(Connection con,LoginObj loginobj){
        
        
        int resultado=0;
        try {  
               
            
        String sql = "SELECT id_Usuario FROM USUARIOS WHERE NombreEmpleado='"+ loginobj.getNombreEmpleado() + "' AND Contrasena ='" + loginobj.getContraseña()+"' AND id_Estatus = 1";                 
            
        Statement st = null;
        ResultSet rs = null;
        
        
        st = con.createStatement();
        rs = st.executeQuery(sql);
            
        if(rs.next()){                                                     
            resultado = 1 ; 
            
        }            
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INVALIDOS" + e.getMessage());            
            return resultado;
        }
    
        return resultado;
    }
     
     
     
     
     public void usuarioEnUso(Connection con, LoginObj loginobj){
         
        PreparedStatement pst = null;            
        String sqlTemporal = "UPDATE UsuarioUso SET id_Usuario =(SELECT id_Usuario FROM USUARIOS WHERE NombreEmpleado ='"+loginobj.getNombreEmpleado()+"')";

        try {
            
            pst = con.prepareStatement(sqlTemporal);
            pst.execute();
            pst.close();           
            } catch (SQLException e) {            
            mensaje = "No se pudo guardar correctamente \n "+ e.getMessage(); 
            
            }     
    }
     
     
     
     public int usuarioTipo(Connection con){         
         int tipoU = 0;         
        try {                
            
            String sql = "SELECT id_TipoUsuario FROM Usuarios WHERE id_Usuario = (SELECT id_Usuario FROM usuarioUso WHERE id_uso =1)";                 
            
            Statement st = null;
            ResultSet rs = null;
               
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            if(rs.next()){                                                                    
                tipoU = rs.getInt(1);
            }                  
        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INVALIDOS" + e.getMessage());            
                return tipoU;
            }    
        
            return tipoU;
    }
    
     
  
}
