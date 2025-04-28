package pe.edu.upc.safealertweb.dtos;

import jakarta.persistence.Column;

public class CantidadNotificacionxUserDTO {

    private String username;
    private String apellido;
    private int cantidad;

    public String getUsername() {
        return username;
    }

    public void setUsername(String nombre) {
        this.username = username;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
