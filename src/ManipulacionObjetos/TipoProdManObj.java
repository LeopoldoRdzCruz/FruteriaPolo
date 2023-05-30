
package ManipulacionObjetos;

import Clases.TipoProdObj;
import AccesoDatos.ConexionBase;
import AccesoDatos.TipoProdData;
import Clases.UnidadMedObj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

public class TipoProdManObj {
    
    private String mensaje;
    private TipoProdData tipoProdData = new TipoProdData();
    
    public String agregarUnidadMed(TipoProdObj tipoProdObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = tipoProdData.agregarTipoProd(conn, tipoProdObj);
            
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
    
    public String eliminarTipoProd(TipoProdObj tipoProdObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = tipoProdData.eliminarTipoProd(conn, tipoProdObj);
            
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
    
    public String actualizarTipoProd(TipoProdObj tipoProdObj, String nuevo){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = tipoProdData.actualizarTipoProd(conn, tipoProdObj, nuevo);
            
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
    
    public void listarTipoProdDesc(JList lista){
        Connection conn = ConexionBase.getConnection();
        tipoProdData.listarTipoProddDesc(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }


    }
    
    public void listarTipoProdNumm(JList lista){
        Connection conn = ConexionBase.getConnection();
        tipoProdData.listarTipoProdNum(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }


    }
    
}
