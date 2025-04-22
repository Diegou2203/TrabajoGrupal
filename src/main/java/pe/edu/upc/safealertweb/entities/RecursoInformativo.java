package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "RecursoInformativo")
public class RecursoInformativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecursoInformativo;
    @Column(name = "tipo", nullable = false, length = 20)
    private String tipo;
    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;
    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;
    @Column(name = "url_contenido", nullable = false, length = 70)
    private String urlContenido;
    @Column(name = "fecha_publicacion", nullable = false)
    private LocalDate fecha_publicacion;
    @Column(name = "fecha_actualizacion", nullable = false)
    private LocalDate fecha_actualizacion;
    /*@ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;*/

    public RecursoInformativo() {
    }

    public RecursoInformativo(int idRecursoInformativo, String tipo, String titulo, String descripcion, String urlContenido, LocalDate fecha_publicacion, LocalDate fecha_actualizacion) {
        this.idRecursoInformativo = idRecursoInformativo;
        this.tipo = tipo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlContenido = urlContenido;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

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
