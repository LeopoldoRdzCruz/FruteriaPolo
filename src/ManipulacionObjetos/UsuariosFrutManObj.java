
package ManipulacionObjetos;

import Clases.UsuariosFrutObj;
import AccesoDatos.ConexionBase;
import AccesoDatos.UsuariosFrutData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

public class UsuariosFrutManObj {
    
    private String mensaje;
    private UsuariosFrutData usuariosData = new UsuariosFrutData();
    
    public String agregarUsuarios(UsuariosFrutObj usuarioObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = usuariosData.agregarUsuario(conn, usuarioObj);
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        }finally{
            
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                mensaje = mensaje + "" + e.getMessage();
            }
            
        }
        
        return mensaje;
    }
    
    public String eliminarUsuarios(UsuariosFrutObj usuarioObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = usuariosData.eliminarUsuario(conn, usuarioObj);
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        }finally{
            
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                mensaje = mensaje + "" + e.getMessage();
            }
            
        }
        
        return mensaje;
    }
    
    public String cambiarContra(UsuariosFrutObj usuarioObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = usuariosData.cambiarContraseña(conn, usuarioObj);
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        }finally{
            
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                mensaje = mensaje + "" + e.getMessage();
            }
            
        }
        
        return mensaje;
    }
    
    public String cambiarUsuarioNombre(UsuariosFrutObj usuarioObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = usuariosData.actualizarUsuarioNombre(conn, usuarioObj);
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        }finally{
            
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                mensaje = mensaje + "" + e.getMessage();
            }
            
        }
        
        return mensaje;
    }
    
    public String cambiarCorreo(UsuariosFrutObj usuarioObj, String correo2){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = usuariosData.actualizarUsuarioCorreo(conn, usuarioObj, correo2);
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        }finally{
            
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                mensaje = mensaje + "" + e.getMessage();
            }
            
        }
        
        return mensaje;
    }
    
    public String cambiarTipoUs(UsuariosFrutObj usuarioObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = usuariosData.actualizarUsuarioTipoUs(conn, usuarioObj);
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        }finally{
            
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                mensaje = mensaje + "" + e.getMessage();
            }
            
        }
        
        return mensaje;
    }
    
    
    
    
    
    public void listarUsuariosNomm(JList lista){
        Connection conn = ConexionBase.getConnection();
        usuariosData.listarUsuarioNom(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }


    }
    
    public void listarUsuariosCorrreo(JList lista){
        Connection conn = ConexionBase.getConnection();
        usuariosData.listarUsuarioCorreo(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }


    }
    
    public void listarUsuariosTipoUser(JList lista){
        Connection conn = ConexionBase.getConnection();
        usuariosData.listarUsuariotipoUsuario(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }


    }
    public void listarUsuariosEstatuss(JList lista){
        Connection conn = ConexionBase.getConnection();
        usuariosData.listarUsuarioEst(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }


    }
    
}
