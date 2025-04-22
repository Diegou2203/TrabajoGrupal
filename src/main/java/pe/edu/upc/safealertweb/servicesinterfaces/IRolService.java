package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.Rol;

import java.util.List;

public interface IRolService {

    public List<Rol> list();
    public void insert(Rol r);
    public Rol listarId(int idRol);
    public void delete(int idRol);
    public void update(Rol r);
}
