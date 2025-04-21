package pe.edu.upc.safealertweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.safealertweb.entities.SugerenciaPreventiva;
import pe.edu.upc.safealertweb.repositories.ISugerenciaPreventivaRepository;
import pe.edu.upc.safealertweb.servicesinterfaces.ISugerenciaPreventivaService;


import java.util.List;
@Service
public class SugerenciaPreventivaServicelmplement implements ISugerenciaPreventivaService {

    @Autowired
    private ISugerenciaPreventivaRepository suR;


    @Override
    public List<SugerenciaPreventiva> list() {return suR.findAll();}

    @Override
    public void insert(SugerenciaPreventiva su) { suR.save(su);}

    @Override
    public SugerenciaPreventiva listarId(int idSugerencia) {return suR.findById(idSugerencia).orElse(new SugerenciaPreventiva());}

    @Override
    public void delete(int idSugerencia) {suR.deleteById(idSugerencia);}

    @Override
    public void update(SugerenciaPreventiva su) {suR.save(su);}
}
