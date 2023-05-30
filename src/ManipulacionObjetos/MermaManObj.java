
package ManipulacionObjetos;

import Clases.MermaObj;
import AccesoDatos.ConexionBase;
import AccesoDatos.MermaData;
import Clases.ProductoObj;
import Clases.MermaHasProductoObj;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JList;

public class MermaManObj {
    private String mensaje;
    private MermaData mermaData = new MermaData();
    
    public String agregarMerma(MermaObj mermaObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = mermaData.agregarMerma(conn,mermaObj);
            
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
    
    public String agregarMermaProductos(MermaHasProductoObj mermaHProdObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = mermaData.agregarMermaHProd(conn,mermaHProdObj);
            
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
    
    public String actuzalizarStock(MermaHasProductoObj mermaHProdObj, Float antExi){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = mermaData.actualizarStock(conn,mermaHProdObj, antExi);
            
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
    
    
    
    
    
    public void listarMermaBusqProd(JList lista,String busq){
        Connection conn = ConexionBase.getConnection();
        mermaData.listarProdBusq(conn, lista, busq);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarMermaBusqID(JList lista,String busq){
        Connection conn = ConexionBase.getConnection();
        mermaData.listarProdID(conn, lista, busq);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void productoBusqPrecio(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        mermaData.listarProdPrecioB(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqUM(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        mermaData.listarProdUnidadMed(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqIDTipo(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        mermaData.listarProdUnidadMed(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqUMDesc(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        mermaData.listarProdUMDes(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqExis(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        mermaData.listarProdExis(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public float productoBusqExisFl(String busqu){
        Connection conn = ConexionBase.getConnection();
        
        float exi= mermaData.listarExiFl(conn,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return exi;

    }
    
    
    
}
