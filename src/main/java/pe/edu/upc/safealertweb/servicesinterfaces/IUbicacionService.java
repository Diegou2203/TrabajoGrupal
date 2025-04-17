package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.Ubicacion;

import java.util.List;

public interface IUbicacionService {

    public List<Ubicacion> list();
    public void insert(Ubicacion u);
    public Ubicacion listarId(int idUbicacion);
    public void delete(int idUbicacion);
    public void update(Ubicacion u);

}
