
package Clases;


public class ProductoObj {
    
    private int IdProducto;
    private int IdUnidadMedida;
    private int IdTipoProducto;
    private int idEstatus;
    private String descripcionProd;
    private float precio;
    private float existencia;

    public ProductoObj() {
    }

    public ProductoObj(int IdProducto, int IdUnidadMedida, int IdTipoProducto, int idEstatus, String descripcionProd, float precio, float existencia) {
        this.IdProducto = IdProducto;
        this.IdUnidadMedida = IdUnidadMedida;
        this.IdTipoProducto = IdTipoProducto;
        this.idEstatus = idEstatus;
        this.descripcionProd = descripcionProd;
        this.precio = precio;
        this.existencia = existencia;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getIdUnidadMedida() {
        return IdUnidadMedida;
    }

    public void setIdUnidadMedida(int IdUnidadMedida) {
        this.IdUnidadMedida = IdUnidadMedida;
    }

    public int getIdTipoProducto() {
        return IdTipoProducto;
    }

    public void setIdTipoProducto(int IdTipoProducto) {
        this.IdTipoProducto = IdTipoProducto;
    }

    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getExistencia() {
        return existencia;
    }

    public void setExistencia(float existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "ProductoObj{" + "IdProducto=" + IdProducto + ", IdUnidadMedida=" + IdUnidadMedida + ", IdTipoProducto=" + IdTipoProducto + ", idEstatus=" + idEstatus + ", descripcionProd=" + descripcionProd + ", precio=" + precio + ", existencia=" + existencia + '}';
    }
    
    

    
}
