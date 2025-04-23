package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="TipoFenomeno")
public class TipoFenomeno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoFenomeno;

    @Column(name="nombre_tipo", nullable=false, length=50)
    private String nombre_tipo;

    @Column(name="descripcion",nullable = false, length = 200)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="idFenomenoNatural")
    private FenomenoNatural fenomenoNatural;

    public TipoFenomeno() {}

    public TipoFenomeno(int idTipoFenomeno, String descripcion, FenomenoNatural fenomenoNatural) {
        this.idTipoFenomeno = idTipoFenomeno;
        this.descripcion = descripcion;
        this.fenomenoNatural = fenomenoNatural;
    }

    public int getIdTipoFenomeno() {

        return idTipoFenomeno;
    }

    public void setIdTipoFenomeno(int idTipoFenomeno) {
        this.idTipoFenomeno = idTipoFenomeno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FenomenoNatural getFenomenoNatural() {
        return fenomenoNatural;
    }

    public void setFenomenoNatural(FenomenoNatural fenomenoNatural) {
        this.fenomenoNatural = fenomenoNatural;
    }
}

