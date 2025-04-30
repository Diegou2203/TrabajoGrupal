package pe.edu.upc.safealertweb.dtos;

import jakarta.persistence.*;
import pe.edu.upc.safealertweb.entities.Rol;
import pe.edu.upc.safealertweb.entities.Ubicacion;

import java.time.LocalDate;
import java.util.List;

public class UsuarioDTO {
    private int idUsuario;
    private String username;
    private String apellido;
    private String correo;
    private String password;
    private boolean enabled;
    private String telefono;
    private LocalDate fecha_Nacimiento;
    private LocalDate fecha_Registro;
    private boolean compartir_ubicacion_temporal;
    private Ubicacion ubicacion;
    private List<Rol> roles;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public LocalDate getFecha_Registro() {
        return fecha_Registro;
    }

    public void setFecha_Registro(LocalDate fecha_Registro) {
        this.fecha_Registro = fecha_Registro;
    }

    public boolean isCompartir_ubicacion_temporal() {
        return compartir_ubicacion_temporal;
    }

    public void setCompartir_ubicacion_temporal(boolean compartir_ubicacion_temporal) {
        this.compartir_ubicacion_temporal = compartir_ubicacion_temporal;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
