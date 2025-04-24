package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "SugerenciaPreventiva")
public class SugerenciaPreventiva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSugerenciaPreventiva;

    @Column(name = "motivo", nullable = false, length = 60)
    private String motivo;

    @Column(name = "descripcion", nullable = false, length = 80)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idFenomenoNatural")
    private FenomenoNatural fenomenoNatural;

    public SugerenciaPreventiva() { }

    public SugerenciaPreventiva( int idSugerenciaPreventiva, String motivo, String descripcion, FenomenoNatural fenomenoNatural ) {
        this.idSugerenciaPreventiva = idSugerenciaPreventiva;
        this.motivo = motivo;
        this.descripcion = descripcion;
        this.fenomenoNatural = fenomenoNatural;
    }


    public int getIdSugerenciaPreventiva() { return idSugerenciaPreventiva; }

    public void setIdSugerenciaPreventiva(int idSugerenciaPreventiva) { this.idSugerenciaPreventiva = idSugerenciaPreventiva; }

    public String getMotivo() { return motivo; }

    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public FenomenoNatural getFenomenoNatural() { return fenomenoNatural; }

    public  void setFenomenoNatural(FenomenoNatural fenomenoNatural) {this.fenomenoNatural = fenomenoNatural; }

}
