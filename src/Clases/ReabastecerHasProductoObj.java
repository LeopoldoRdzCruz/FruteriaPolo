
package Clases;

public class ReabastecerHasProductoObj {
    
    int idCompra;
    int idProducto;
    float cantidad;
    String Descripcion;

    public ReabastecerHasProductoObj() {
    }

    public ReabastecerHasProductoObj(int idCompra, int idProducto, float cantidad, String Descripcion) {
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.Descripcion = Descripcion;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    
}
