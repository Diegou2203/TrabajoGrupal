package pe.edu.upc.safealertweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.safealertweb.entities.SugerenciaPreventiva;
import pe.edu.upc.safealertweb.repositories.ISugerenciaPreventivaRepository;
import pe.edu.upc.safealertweb.servicesinterfaces.ISugerenciaPreventivaService;

import java.util.List;

@Service
public class SugerenciaPreventivaServiceImplement implements ISugerenciaPreventivaService {

    @Autowired
    private ISugerenciaPreventivaRepository spR;

    @Override
    public List<SugerenciaPreventiva> list() {return spR.findAll();}

    @Override
    public void insert(SugerenciaPreventiva fn) {spR.save(fn);}

    @Override
    public SugerenciaPreventiva listarId(int idSugerenciaPreventiva) {return spR.findById(idSugerenciaPreventiva).orElse(new SugerenciaPreventiva());}

    @Override
    public void delete(int idSugerenciaPreventiva) {spR.deleteById(idSugerenciaPreventiva);}

    @Override
    public void update(SugerenciaPreventiva sp) {spR.save(sp);}
}
