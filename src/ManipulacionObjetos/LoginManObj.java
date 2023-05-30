
package ManipulacionObjetos;

    import AccesoDatos.ConexionBase;
    import AccesoDatos.LoginDatos;
    import Clases.LoginObj;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import java.util.logging.Logger;

    public class LoginManObj {

        private String mensaje;
        private LoginDatos logindata = new LoginDatos();


        

        public boolean buscarUsuarioi(LoginObj loginman){
            Connection conn = ConexionBase.getConnection();

            if(logindata.buscarUsuarioi(conn,loginman) == 1){
                try {
                    conn.close();

                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }
                return true;
            }
            else{
                try {
                    conn.close();              
                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }         
            }
            return false;
        }
        
        public void logUsuarioUso(LoginObj loginman){
            Connection conn = ConexionBase.getConnection();

            if(logindata.buscarUsuarioi(conn,loginman) == 1){
                try {
                    
                    logindata.usuarioEnUso(conn, loginman);
                    conn.close();

                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }
            }
            else{
                try {
                    conn.close();              
                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }         
            }
        }
        
        public int buscartipoUser(LoginObj loginman){
            Connection conn = ConexionBase.getConnection();

            if(logindata.tipoUsuarioSesion(conn,loginman) == 1){
                try {
                    conn.close();

                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }
                return 1;
            }
            else{
                try {
                    conn.close();              
                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }         
            }
            return 2;
        }
        
        
        public int tipoUserPan(){
            
            int tipo = 0;           
            Connection conn = ConexionBase.getConnection();           
            try {                    
                tipo = logindata.usuarioTipo(conn);                    
                conn.close();

            } catch (SQLException ex) {
                System.out.print(ex.getMessage());
            }
            return tipo;        
        }


}
