
package Clases;


public class UsuariosFrutObj {
    
    private int idUsuario;
    private int tipoUsuario;
    private int estatusUsuario;
    private String contrasena;
    private String nombreEmpleado;
    private String correoUsuario;

    public UsuariosFrutObj() {
    }

    public UsuariosFrutObj(int idUsuario, int tipoUsuario, int estatusUsuario, String contrasena, String nombreEmpleado, String correoUsuario) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.estatusUsuario = estatusUsuario;
        this.contrasena = contrasena;
        this.nombreEmpleado = nombreEmpleado;
        this.correoUsuario = correoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getEstatusUsuario() {
        return estatusUsuario;
    }

    public void setEstatusUsuario(int estatusUsuario) {
        this.estatusUsuario = estatusUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    

    
}
