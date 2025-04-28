package pe.edu.upc.safealertweb.dtos;

import pe.edu.upc.safealertweb.entities.FenomenoNatural;

public class TipoFenomenoDTO {

    private int idTipoFenomeno;
    private String descripcion;
    private FenomenoNatural fenomenoNatural;

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
