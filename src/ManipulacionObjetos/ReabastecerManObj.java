
package ManipulacionObjetos;

import Clases.ReabastecerObj;
import AccesoDatos.ConexionBase;
import AccesoDatos.ReabastecerData;
import Clases.ProductoObj;
import Clases.ReabastecerHasProductoObj;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JList;

public class ReabastecerManObj {
    private String mensaje;
    private ReabastecerData reabaData = new ReabastecerData();
    
    public String agregarCompra(ReabastecerObj reabaObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = reabaData.agregarCompra(conn,reabaObj);
            
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
    
    public String agregarCompraProductos(ReabastecerHasProductoObj reabaHProdObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = reabaData.agregarCompraHProd(conn,reabaHProdObj);
            
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
    
    public String actuzalizarStock(ReabastecerHasProductoObj reabaHProdObj, Float antExi){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = reabaData.actualizarStock(conn,reabaHProdObj, antExi);
            
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
    
    
    
    
    
    public void listarCompraBusqProd(JList lista,String busq){
        Connection conn = ConexionBase.getConnection();
        reabaData.listarProdBusq(conn, lista, busq);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarCompraBusqID(JList lista,String busq){
        Connection conn = ConexionBase.getConnection();
        reabaData.listarProdID(conn, lista, busq);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void productoBusqPrecio(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        reabaData.listarProdPrecioB(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqUM(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        reabaData.listarProdUnidadMed(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqIDTipo(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        reabaData.listarProdUnidadMed(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqUMDesc(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        reabaData.listarProdUMDes(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqExis(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        reabaData.listarProdExis(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public float productoBusqExisFl(String busqu){
        Connection conn = ConexionBase.getConnection();
        
        float exi= reabaData.listarExiFl(conn,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return exi;

    }
    
    
    
}
