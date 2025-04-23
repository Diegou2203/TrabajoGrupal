package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 40)
    private String apellido;

    @Column(name = "correo", nullable = false, length = 60)
    private String correo;

    @Column(name = "contrasenia", nullable = false, length = 40)
    private String contrasenia;

    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;

    @Column(name = "fecha_Nacimiento", nullable = false)
    private LocalDate fecha_Nacimiento;

    @Column(name = "fecha_Registro", nullable = false)
    private LocalDate fecha_Registro;

    @Column(name = "compartir_ubicacion_temporal", nullable = false)
    private boolean compartir_ubicacion_temporal;

    @ManyToOne
    @JoinColumn(name="idUbicacion")
    private Ubicacion ubicacion;

    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol rol;

    public Usuario() { }

    public Usuario(int idUsuario, String nombre, String apellido, String correo, String contrasenia, String telefono, LocalDate fecha_Nacimiento, LocalDate fecha_Registro, boolean compartir_ubicacion_temporal, Ubicacion ubicacion, Rol rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.fecha_Registro = fecha_Registro;
        this.compartir_ubicacion_temporal = compartir_ubicacion_temporal;
        this.ubicacion = ubicacion;
        this.rol = rol;
    }
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
