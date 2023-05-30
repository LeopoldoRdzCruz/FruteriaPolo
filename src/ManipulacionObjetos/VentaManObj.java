
package ManipulacionObjetos;

import Clases.VentaObj;
import AccesoDatos.ConexionBase;
import AccesoDatos.VentaDatos;
import Clases.VentaHasProductosObj;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JList;

public class VentaManObj {
    
    private String mensaje;
    private VentaDatos ventaData = new VentaDatos();
    
    public String agregarVenta(VentaObj ventaObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = ventaData.agregarVenta(conn,ventaObj);
            
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
    
    public String agregarVentaProductos(VentaHasProductosObj ventaHProdObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = ventaData.agregarVentaHProd(conn,ventaHProdObj);
            
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
    
    
    
    public void listarVentaBusqProd(JList lista,String busq){
        Connection conn = ConexionBase.getConnection();
        ventaData.listarProdBusq(conn, lista, busq);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarVentaBusqID(JList lista,String busq){
        Connection conn = ConexionBase.getConnection();
        ventaData.listarProdID(conn, lista, busq);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void productoBusqPrecio(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        ventaData.listarProdPrecioB(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqUM(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        ventaData.listarProdUnidadMed(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public void productoBusqUMDesc(JList lista,String busqu){
        Connection conn = ConexionBase.getConnection();
        ventaData.listarProdUMDes(conn, lista,busqu);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
}
