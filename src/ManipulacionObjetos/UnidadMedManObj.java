
package ManipulacionObjetos;

import Clases.UnidadMedObj;
import AccesoDatos.ConexionBase;
import AccesoDatos.UnidadMedData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

public class UnidadMedManObj {
    
    private String mensaje;
    private UnidadMedData unidadMedData = new UnidadMedData();
    
    public String agregarUnidadMed(UnidadMedObj unidadMedObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = unidadMedData.agregarUnidadMed(conn, unidadMedObj);
            
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
    
    public String eliminarUnidadMed(UnidadMedObj unidadMedObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = unidadMedData.eliminarUnidadMed(conn, unidadMedObj);
            
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
    
    public String actualizarUnidadMed(UnidadMedObj unidadMedObj, String nuevo){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = unidadMedData.actualizarUnidadMed(conn, unidadMedObj, nuevo);
            
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
    
    public void listarUnidadMedDesc(JList lista){
        Connection conn = ConexionBase.getConnection();
        unidadMedData.listarUnidadMedDesc(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }


    }
    
    public void listarUnidadMedNUmm(JList lista){
        Connection conn = ConexionBase.getConnection();
        unidadMedData.listarUnidadMedNum(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }


    }
    
    
}
