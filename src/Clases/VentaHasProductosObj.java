
package Clases;


public class VentaHasProductosObj {
    
    int idVentaP;
    int idProductoV;
    float cantidad;
    String descripcion;
    

    public VentaHasProductosObj() {
    }

    public VentaHasProductosObj(int idVentaP, int idProductoV, float cantidad, String descripcion) {
        this.idVentaP = idVentaP;
        this.idProductoV = idProductoV;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public int getIdVentaP() {
        return idVentaP;
    }

    public void setIdVentaP(int idVentaP) {
        this.idVentaP = idVentaP;
    }

    public int getIdProductoV() {
        return idProductoV;
    }

    public void setIdProductoV(int idProductoV) {
        this.idProductoV = idProductoV;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
