package pe.edu.upc.safealertweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.safealertweb.entities.RecursoInformativo;
import pe.edu.upc.safealertweb.repositories.IRecursoInformativoRepository;
import pe.edu.upc.safealertweb.servicesinterfaces.IRecursoInformativoService;

import java.util.List;

@Service
public class RecursoInformativoServiceImplement implements IRecursoInformativoService {
    @Autowired
    private IRecursoInformativoRepository riR;

    @Override
    public List<RecursoInformativo> list() {
        return riR.findAll();
    }

    @Override
    public void insert(RecursoInformativo ri) {
        riR.save(ri);
    }

    @Override
    public RecursoInformativo listarId(int idRecursoInformativo) {
        return riR.findById(idRecursoInformativo).orElse(new RecursoInformativo());
    }

    @Override
    public void delete(int idRecursoInformativo) {
        riR.deleteById(idRecursoInformativo);
    }

    @Override
    public void update(RecursoInformativo ri) {
        riR.save(ri);
    }
}
