
package AccesoDatos;


import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBase {
    
    private static Connection conn = null;
    private static String login = "FRUTERIAPOLO";
    private static String clave = "FRUTERIAPOLO";
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";   
    
    public static Connection getConnection(){
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,clave);
            conn.setAutoCommit(false);
            if(conn != null){
            
                System.out.print("Conexion Exitosa");               
            }else{
                
                System.out.print("Conexion es erronea");           
            }
            
            
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null," Conexion Erronea" + e.getMessage());
            
        }
        
        return conn;    
    
    }
    
    public void desconexion (){
    
        try {
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al desconectar" + e.getMessage());
        }
        
    }
    
    
    public static void main(String[] args){
        
        ConexionBase c = new ConexionBase();
        c.getConnection();
        
    }
    
}
