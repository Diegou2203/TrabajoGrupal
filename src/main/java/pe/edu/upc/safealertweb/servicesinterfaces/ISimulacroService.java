package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.Simulacro;

import java.util.List;

public interface ISimulacroService {
    public List<Simulacro> list();
    public void insert(Simulacro s);
    public Simulacro listarId(int idSimulacro);
    public void delete(int idSimulacro);
    public void update(Simulacro s);
}

