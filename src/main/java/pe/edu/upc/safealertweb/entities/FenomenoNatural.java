package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="FenomenoNatural")
public class FenomenoNatural {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFenomenoNatural;

    @Column(name = "nombre_fenomeno",nullable = false, length = 30)
    private String nombre_fenomeno;

    @Column(name = "descripcion",nullable = false, length = 200)
    private String descripcion;

    @Column(name = "categoria",nullable = false, length = 20)
    private String categoria;

    @Column(name = "nivel_peligrosidad",nullable = false, length = 10)
    private String nivel_peligrosidad;

    @Column(name = "activo",nullable = false)
    private boolean activo;

    @ManyToOne
    @JoinColumn(name="idUbicacion")
    private Ubicacion ubicacion;


    public FenomenoNatural() {
    }

    public FenomenoNatural(int idFenomenoNatural, String nombre, String descripcion, String categoria, String nivel_peligrosidad, boolean activo, Ubicacion ubicacion) {
        this.idFenomenoNatural = idFenomenoNatural;
        this.nombre_fenomeno = nombre_fenomeno;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.nivel_peligrosidad = nivel_peligrosidad;
        this.activo = activo;
        this.ubicacion = ubicacion;
    }

    public int getIdFenomenoNatural() {
        return idFenomenoNatural;
    }

    public void setIdFenomenoNatural(int idFenomenoNatural) {
        this.idFenomenoNatural = idFenomenoNatural;
    }

    public String getNombre_fenomeno() {
        return nombre_fenomeno;
    }

    public void setNombre_fenomeno(String nombre_fenomeno) {
        this.nombre_fenomeno = nombre_fenomeno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel_peligrosidad() {
        return nivel_peligrosidad;
    }

    public void setNivel_peligrosidad(String nivel_peligrosidad) {
        this.nivel_peligrosidad = nivel_peligrosidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
