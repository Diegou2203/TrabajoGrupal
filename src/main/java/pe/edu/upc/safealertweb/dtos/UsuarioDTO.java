package pe.edu.upc.safealertweb.dtos;

import pe.edu.upc.safealertweb.entities.Rol;
import pe.edu.upc.safealertweb.entities.Ubicacion;

import java.time.LocalDate;

public class UsuarioDTO {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private String telefono;
    private LocalDate fecha_Nacimiento;
    private LocalDate fecha_Registro;
    private boolean compartir_ubicacion_temporal;
    private Ubicacion ubicacion;
    private Rol rol;

    public int getIdUsuario() { return idUsuario; }

    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getContrasenia() { return contrasenia; }

    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public LocalDate getFecha_Nacimiento() { return fecha_Nacimiento; }

    public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {this.fecha_Nacimiento = fecha_Nacimiento; }

    public LocalDate getFecha_Registro() { return fecha_Registro; }

    public void setFecha_Registro(LocalDate fecha_Registro) { this.fecha_Registro = fecha_Registro; }

    public boolean getCompartir_ubicacion_temporal() { return compartir_ubicacion_temporal; }

    public void setCompartir_ubicacion_temporal(boolean compartir_ubicacion_temporal) {this.compartir_ubicacion_temporal = compartir_ubicacion_temporal; }

    public Ubicacion getUbicacion() { return ubicacion; }

    public void setUbicacion (Ubicacion ubicacion) { this.ubicacion = ubicacion; }

    public Rol getRol() { return rol; }

    public void setRol (Rol rol) { this.rol = rol; }
}
