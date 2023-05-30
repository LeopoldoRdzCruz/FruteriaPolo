/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class MermaObj {
    
    int idMerma;
    int idUsuario;
    String descripcion;
    String fecha;

    public MermaObj() {
    }

    public MermaObj(int idMerma, int idUsuario, String descripcion, String fecha) {
        this.idMerma = idMerma;
        this.idUsuario = idUsuario;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getIdMerma() {
        return idMerma;
    }

    public void setIdMerma(int idMerma) {
        this.idMerma = idMerma;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "MermaObj{" + "idMerma=" + idMerma + ", idUsuario=" + idUsuario + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }
    
    
    
}
