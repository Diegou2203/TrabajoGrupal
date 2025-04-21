package pe.edu.upc.safealertweb.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.safealertweb.entities.Simulacro;

import java.time.LocalDate;

public class SugerenciaPreventivaDTO {

    private int IdSugerenciaPreventiva;
    private String Area;
    private String SugerenciaAccion;
    private LocalDate FechaCreacion;
    private Simulacro simu;

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
