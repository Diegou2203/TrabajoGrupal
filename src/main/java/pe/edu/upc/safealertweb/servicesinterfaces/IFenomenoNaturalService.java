package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.FenomenoNatural;

import java.util.List;

public interface IFenomenoNaturalService {

    public List<FenomenoNatural> list();
    public void insert(FenomenoNatural fn);
    public FenomenoNatural listarId(int idFenomenoNatural);
    public void delete(int idFenomenoNatural);
    public void update(FenomenoNatural fn);
}
