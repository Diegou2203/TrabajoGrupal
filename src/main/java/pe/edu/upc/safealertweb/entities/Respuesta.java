package pe.edu.upc.safealertweb.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Respuesta")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;

    @Column(name = "titulo",nullable = false, length = 20)
    private String titulo;
    @Column(name = "contenido",nullable = false, length = 50)
    private String contenido;
    @Column(name = "icono",nullable = false, length = 50)
    private String icono;
    @Column(name = "fechacreacion",nullable = false)
    private LocalDateTime fechacreacion;
    @Column(name = "fechaactualizacion",nullable = false)
    private LocalDateTime fechaactualizacion;

    @ManyToOne
    @JoinColumn(name="idComentario")
    private ComentarioConsulta comentarioconsulta;

    @ManyToOne
    @JoinColumn(name="idRol")
    private Rol rol;

    public Respuesta() {
    }

    public Respuesta(int idRespuesta, String titulo, String contenido, String icono, LocalDateTime fechacreacion, LocalDateTime fechaactualizacion, ComentarioConsulta comentarioconsulta, Rol rol) {
        this.idRespuesta = idRespuesta;
        this.titulo = titulo;
        this.contenido = contenido;
        this.icono = icono;
        this.fechacreacion = fechacreacion;
        this.fechaactualizacion = fechaactualizacion;
        this.comentarioconsulta = comentarioconsulta;
        this.rol = rol;
    }

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

    public LocalDateTime getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDateTime fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public LocalDateTime getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(LocalDateTime fechaactualizacion) {
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
