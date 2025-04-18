package pe.edu.upc.safealertweb.dtos;

import pe.edu.upc.safealertweb.entities.FenomenoNatural;

public class SugerenciaPreventivaDTO {

    private int idSugerenciaPreventiva;
    private String motivo;
    private String descripcion;
    private FenomenoNatural fenomenoNatural;

    public int getIdSugerenciaPreventiva() { return idSugerenciaPreventiva; }

    public void setIdSugerenciaPreventiva(int idSugerenciaPreventiva) { this.idSugerenciaPreventiva = idSugerenciaPreventiva; }

    public String getMotivo() { return motivo; }

    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public FenomenoNatural getFenomenoNatural() { return fenomenoNatural; }

    public  void setFenomenoNatural(FenomenoNatural fenomenoNatural) {this.fenomenoNatural = fenomenoNatural; }
}
