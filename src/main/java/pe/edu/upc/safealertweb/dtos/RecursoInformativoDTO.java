package pe.edu.upc.safealertweb.dtos;

//import pe.edu.upc.safealertweb.entities.Usuario;

import java.time.LocalDate;

public class RecursoInformativoDTO {
    private int idRecursoInformativo;
    private String tipo;
    private String titulo;
    private String descripcion;
    private String urlContenido;
    private LocalDate fecha_publicacion;
    private LocalDate fecha_actualizacion;
    //private Usuario usuario;

    public int getIdRecursoInformativo() {
        return idRecursoInformativo;
    }

    public void setIdRecursoInformativo(int idRecursoInformativo) {
        this.idRecursoInformativo = idRecursoInformativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlContenido() {
        return urlContenido;
    }

    public void setUrlContenido(String urlContenido) {
        this.urlContenido = urlContenido;
    }

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDate fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public LocalDate getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(LocalDate fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }
}
