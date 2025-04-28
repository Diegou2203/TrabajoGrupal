package pe.edu.upc.safealertweb.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.safealertweb.entities.ComentarioConsulta;
import pe.edu.upc.safealertweb.entities.Rol;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RespuestaDTO {
    private int idRespuesta;
    private String titulo;
    private String contenido;
    private String icono;
    private LocalDate fechacreacion;
    private LocalDate fechaactualizacion;
    private ComentarioConsulta comentarioconsulta;
    private Rol rol;

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public LocalDate getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(LocalDate fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }

    public ComentarioConsulta getComentarioconsulta() {
        return comentarioconsulta;
    }

    public void setComentarioconsulta(ComentarioConsulta comentarioconsulta) {
        this.comentarioconsulta = comentarioconsulta;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
