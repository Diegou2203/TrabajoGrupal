package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="SugerenciaPreventiva")
public class SugerenciaPreventiva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdSugerenciaPreventiva;

    @Column(name = "Area", nullable = false, length = 100)
    private String Area;

    @Column(name = "SugerenciaAccion", nullable = false, length = 100)
    private String SugerenciaAccion;

    @Column(name = "FechaCreacion", nullable = false)
    private LocalDate FechaCreacion;


    @ManyToOne
    @JoinColumn(name="idSimulacro")
    private Simulacro simu;

    public SugerenciaPreventiva() {
    }

    public SugerenciaPreventiva(int idSugerenciaPreventiva, String area, String sugerenciaAccion, LocalDate fechaCreacion, Simulacro simu) {
        IdSugerenciaPreventiva = idSugerenciaPreventiva;
        Area = area;
        SugerenciaAccion = sugerenciaAccion;
        FechaCreacion = fechaCreacion;
        this.simu = simu;
    }

    public int getIdSugerenciaPreventiva() {
        return IdSugerenciaPreventiva;
    }

    public void setIdSugerenciaPreventiva(int idSugerenciaPreventiva) {
        IdSugerenciaPreventiva = idSugerenciaPreventiva;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getSugerenciaAccion() {
        return SugerenciaAccion;
    }

    public void setSugerenciaAccion(String sugerenciaAccion) {
        SugerenciaAccion = sugerenciaAccion;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public Simulacro getSimu() {
        return simu;
    }

    public void setSimu(Simulacro simu) {
        this.simu = simu;
    }
}
