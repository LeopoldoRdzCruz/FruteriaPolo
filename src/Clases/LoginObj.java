
package Clases;

public class LoginObj {
    
    private int id_Usuario;
    private int id_tipoUsuario;
    private String contraseña;
    private String nombreEmpleado;
    private String Estatus;

    public LoginObj() {
    }

    public LoginObj(int id_Usuario, int id_tipoUsuario, String contraseña, String nombreEmpleado, String Estatus) {
        this.id_Usuario = id_Usuario;
        this.id_tipoUsuario = id_tipoUsuario;
        this.contraseña = contraseña;
        this.nombreEmpleado = nombreEmpleado;
        this.Estatus = Estatus;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getId_tipoUsuario() {
        return id_tipoUsuario;
    }

    public void setId_tipoUsuario(int id_tipoUsuario) {
        this.id_tipoUsuario = id_tipoUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    
    
    
}
