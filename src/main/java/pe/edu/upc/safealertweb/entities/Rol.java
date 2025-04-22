package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idRol;

    @Column(name="es_admin", nullable=false)
    private boolean es_admin;
    public Rol() {}

    public Rol(int idRol, boolean es_admin) {
        this.idRol = idRol;
        this.es_admin = es_admin;
    }

    public int getIdRol() { return idRol; }

    public void setIdRol(int idRol) { this.idRol = idRol; }

    public boolean isEsAdmin() { return es_admin; }

    public void setEsAdmin(boolean es_admin) { this.es_admin = es_admin; }
}
