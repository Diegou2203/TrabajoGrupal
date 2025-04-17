package pe.edu.upc.safealertweb.dtos;

import pe.edu.upc.safealertweb.entities.Ubicacion;

public class FenomenoNaturalDTO {
    private int idFenomenoNatural;
    private String nombre_fenomeno;
    private String descripcion;
    private String categoria;
    private String nivel_peligrosidad;
    private boolean activo;
    private Ubicacion ubicacion;

    public int getIdFenomenoNatural() {
        return idFenomenoNatural;
    }

    public void setIdFenomenoNatural(int idFenomenoNatural) {
        this.idFenomenoNatural = idFenomenoNatural;
    }

    public String getNombre_fenomeno() {
        return nombre_fenomeno;
    }

    public void setNombre_fenomeno(String nombre_fenomeno) {
        this.nombre_fenomeno = nombre_fenomeno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel_peligrosidad() {
        return nivel_peligrosidad;
    }

    public void setNivel_peligrosidad(String nivel_peligrosidad) {
        this.nivel_peligrosidad = nivel_peligrosidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
