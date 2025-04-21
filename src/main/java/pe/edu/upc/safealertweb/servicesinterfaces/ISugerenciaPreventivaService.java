package pe.edu.upc.safealertweb.servicesinterfaces;


import pe.edu.upc.safealertweb.entities.SugerenciaPreventiva;

import java.util.List;

public interface ISugerenciaPreventivaService {
    public List<SugerenciaPreventiva> list();
    public void insert(SugerenciaPreventiva su);
    public SugerenciaPreventiva listarId(int idSugerencia);
    public void delete(int idSugerencia);
    public void update(SugerenciaPreventiva su);
}
