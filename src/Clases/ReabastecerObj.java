
package Clases;


public class ReabastecerObj {
    
    int idCompra;
    int idUsuario;
    String fechaCompra;
    float precioCompra;

    public ReabastecerObj() {
    }

    public ReabastecerObj(int idCompra, int idUsuario, String fechaCompra, float precioCompra) {
        this.idCompra = idCompra;
        this.idUsuario = idUsuario;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    
    
}
