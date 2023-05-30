
package Clases;


public class UnidadMedObj {
    
    private int idUnidadMedida;
    private String descripcion;

    public UnidadMedObj() {
    }

    public UnidadMedObj(int idUnidadMedida, String descripcion) {
        this.idUnidadMedida = idUnidadMedida;
        this.descripcion = descripcion;
    }

    public int getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(int idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "UnidadedMedObj{" + "idUnidadMedida=" + idUnidadMedida + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
