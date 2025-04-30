package pe.edu.upc.safealertweb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Rol", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_user", "rol"})})
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idRol;

    @Column(name="rol", nullable=false, length=50)
    private String rol;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private Usuario usuario;

    public Rol() {}

    public Rol(int idUsuario, String rol, Usuario usuario) {
        this.idRol = idUsuario;
        this.rol = rol;
        this.usuario = usuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
