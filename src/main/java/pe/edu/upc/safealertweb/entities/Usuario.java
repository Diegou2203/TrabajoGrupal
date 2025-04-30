package pe.edu.upc.safealertweb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "username", nullable = false, length = 40)
    private String username;

    @Column(name = "apellido", nullable = false, length = 40)
    private String apellido;

    @Column(name = "correo", nullable = false, length = 60)
    private String correo;

    @Column(name = "password", nullable = false, length = 200)
    private String password;
    private boolean enabled;

    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;

    @Column(name = "fecha_Nacimiento", nullable = false)
    private LocalDate fecha_Nacimiento;

    @Column(name = "fecha_Registro", nullable = false)
    private LocalDate fecha_Registro;

    private boolean compartir_ubicacion_temporal;

    @ManyToOne
    @JoinColumn(name="idUbicacion")
    private Ubicacion ubicacion;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Rol> roles;

    public Usuario() { }

    public Usuario(int idUsuario, String username, String apellido, String correo, String password, boolean enabled, String telefono, LocalDate fecha_Nacimiento, LocalDate fecha_Registro, boolean compartir_ubicacion_temporal, Ubicacion ubicacion, List<Rol> roles) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.enabled = enabled;
        this.telefono = telefono;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.fecha_Registro = fecha_Registro;
        this.compartir_ubicacion_temporal = compartir_ubicacion_temporal;
        this.ubicacion = ubicacion;
        this.roles = roles;
    }

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

    public boolean getCompartir_ubicacion_temporal() {
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

    @JsonIgnore
    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
