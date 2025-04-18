package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.SugerenciaPreventiva;

import java.util.List;

public interface ISugerenciaPreventivaService {

    public List<SugerenciaPreventiva> list();
    public void insert(SugerenciaPreventiva sg);
    public SugerenciaPreventiva listarId(int idSugerenciaPreventiva);
    public void delete(int idSugerenciaPreventiva);
    public void update(SugerenciaPreventiva sg);
}
