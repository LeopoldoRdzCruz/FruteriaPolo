
package ManipulacionObjetos;

import Clases.ProductoObj;
import AccesoDatos.ConexionBase;
import AccesoDatos.ProductoData;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JList;
import javax.swing.JComboBox;

public class ProductoManObj {
    
    private String mensaje;
    private ProductoData prodData = new ProductoData();
    
    public String agregarProducto(ProductoObj prodObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = prodData.agregarProd(conn, prodObj);
            
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
    
    public String eliminarProducto(ProductoObj prodObj){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = prodData.eliminarProd(conn, prodObj);
            
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
    
    public String actuProducto(ProductoObj prodObj, String antes){
        Connection conn = ConexionBase.getConnection();
        
        try {
            mensaje = prodData.actualizarProd(conn, prodObj, antes);
            
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
    
    public void listarProductoNum(JList lista){
        Connection conn = ConexionBase.getConnection();
        prodData.listarProdNum(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarProductoDesc(JList lista){
        Connection conn = ConexionBase.getConnection();
        prodData.listarProdDesc(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarProductoTipoPro(JList lista){
        Connection conn = ConexionBase.getConnection();
        prodData.listarProdTipoProd(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarProductoPrecio(JList lista){
        Connection conn = ConexionBase.getConnection();
        prodData.listarProdPrecio(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarProductoUniMed(JList lista){
        Connection conn = ConexionBase.getConnection();
        prodData.listarProdUnidadMed(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarProductoExi(JList lista){
        Connection conn = ConexionBase.getConnection();
        prodData.listarProdExis(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listarProductoEst(JList lista){
        Connection conn = ConexionBase.getConnection();
        prodData.listarProdEst(conn, lista);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    
    
    public void listComboTiPro(JComboBox combo){
        Connection conn = ConexionBase.getConnection();
        prodData.listarjComboTipo(conn, combo);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void listComboUnidMe(JComboBox combo){
        Connection conn = ConexionBase.getConnection();
        prodData.listarjComboUniMed(conn, combo);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    
    public int buscarTipoProd(String busqueda){
        Connection conn = ConexionBase.getConnection();
        
        int resutado =0;
        
        resutado = prodData.seleccionComboTipoProd(conn, busqueda);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }        
        return resutado;
    }
  
}
