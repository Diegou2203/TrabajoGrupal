package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "NotificacionAlerta")
public class NotificacionAlerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacionAlerta;
    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;
    @Column(name = "fecha_emision", nullable = false)
    private LocalDate fecha_emision;
    @Column(name = "fecha_expiracion", nullable = false)
    private LocalDate fecha_expiracion;
    @Column(name = "notificacion_revisada", nullable = false)
    private boolean notificacion_revisada;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idUbicacion")
    private Ubicacion ubicacion;
    @ManyToOne
    @JoinColumn(name = "idFenomenoNatural")
    private FenomenoNatural fenomenoNatural;

    public NotificacionAlerta() {
    }

    public NotificacionAlerta(int idNotificacionAlerta, String descripcion, LocalDate fecha_emision, LocalDate fecha_expiracion, boolean notificacion_revisada, Ubicacion ubicacion, FenomenoNatural fenomenoNatural) {
        this.idNotificacionAlerta = idNotificacionAlerta;
        this.descripcion = descripcion;
        this.fecha_emision = fecha_emision;
        this.fecha_expiracion = fecha_expiracion;
        this.notificacion_revisada = notificacion_revisada;
        this.ubicacion = ubicacion;
        this.fenomenoNatural = fenomenoNatural;
    }

    public int getIdNotificacionAlerta() {
        return idNotificacionAlerta;
    }

    public void setIdNotificacionAlerta(int idNotificacionAlerta) {
        this.idNotificacionAlerta = idNotificacionAlerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(LocalDate fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public LocalDate getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(LocalDate fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public boolean isNotificacion_revisada() {
        return notificacion_revisada;
    }

    public void setNotificacion_revisada(boolean notificacion_revisada) {
        this.notificacion_revisada = notificacion_revisada;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public FenomenoNatural getFenomenoNatural() {
        return fenomenoNatural;
    }

    public void setFenomenoNatural(FenomenoNatural fenomenoNatural) {
        this.fenomenoNatural = fenomenoNatural;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
