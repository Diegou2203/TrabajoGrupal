package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.RecursoInformativo;

import java.util.List;

public interface IRecursoInformativoService {
    public List<RecursoInformativo> list();

    public void insert(RecursoInformativo ri);

    public RecursoInformativo listarId(int idRecursoInformativo);

    public void delete(int idRecursoInformativo);

    public void update(RecursoInformativo ri);
}
