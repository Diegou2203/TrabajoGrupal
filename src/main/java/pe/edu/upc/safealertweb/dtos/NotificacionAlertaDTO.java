package pe.edu.upc.safealertweb.dtos;

import pe.edu.upc.safealertweb.entities.FenomenoNatural;
import pe.edu.upc.safealertweb.entities.Ubicacion;

import java.time.LocalDate;

public class NotificacionAlertaDTO {
    private int idNotificacionAlerta;
    private String descripcion;
    private LocalDate fecha_emision;
    private LocalDate fecha_expiracion;
    private boolean notificacion_revisada;
    private Ubicacion ubicacion;
    private FenomenoNatural fenomenoNatural;

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
}
