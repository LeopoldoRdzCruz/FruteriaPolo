
package Clases;


public class MermaHasProductoObj {
    
    int idMermaM;
    int idProductoM;
    float cantidad;
    String descripcionM;
    String DescripcionDetalle;

    public MermaHasProductoObj() {
    }

    public MermaHasProductoObj(int idMermaM, int idProductoM, float cantidad, String descripcionM, String DescripcionDetalle) {
        this.idMermaM = idMermaM;
        this.idProductoM = idProductoM;
        this.cantidad = cantidad;
        this.descripcionM = descripcionM;
        this.DescripcionDetalle = DescripcionDetalle;
    }

    public int getIdMermaM() {
        return idMermaM;
    }

    public void setIdMermaM(int idMermaM) {
        this.idMermaM = idMermaM;
    }

    public int getIdProductoM() {
        return idProductoM;
    }

    public void setIdProductoM(int idProductoM) {
        this.idProductoM = idProductoM;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcionM() {
        return descripcionM;
    }

    public void setDescripcionM(String descripcionM) {
        this.descripcionM = descripcionM;
    }

    public String getDescripcionDetalle() {
        return DescripcionDetalle;
    }

    public void setDescripcionDetalle(String DescripcionDetalle) {
        this.DescripcionDetalle = DescripcionDetalle;
    }

    @Override
    public String toString() {
        return "MermaHasProductoObj{" + "idMermaM=" + idMermaM + ", idProductoM=" + idProductoM + ", cantidad=" + cantidad + ", descripcionM=" + descripcionM + ", DescripcionDetalle=" + DescripcionDetalle + '}';
    }

    

}
