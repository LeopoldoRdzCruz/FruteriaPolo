
package Clases;


public class TipoProdObj {
    
    private int idTipoProd;
    private String Descripcion;

    public TipoProdObj() {
    }

    public TipoProdObj(int idTipoProd, String Descripcion) {
        this.idTipoProd = idTipoProd;
        this.Descripcion = Descripcion;
    }

    public int getIdTipoProd() {
        return idTipoProd;
    }

    public void setIdTipoProd(int idTipoProd) {
        this.idTipoProd = idTipoProd;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
