package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.TipoFenomeno;

import java.util.List;

public interface ITipoFenomenoService {

    public List<TipoFenomeno> list();
    public void insert(TipoFenomeno tf);
    public TipoFenomeno listarId(int idTipoFenomeno);
    public void delete(int idTipoFenomeno);
    public void update(TipoFenomeno tf);


}

