package pe.edu.upc.safealertweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.safealertweb.entities.Simulacro;
import pe.edu.upc.safealertweb.repositories.ISimulacroRepository;
import pe.edu.upc.safealertweb.servicesinterfaces.ISimulacroService;

import java.util.List;

@Service
public class SimulacroServiceImplement implements ISimulacroService {

    @Autowired
    private ISimulacroRepository sR;

    @Override
    public List<Simulacro> list() {return sR.findAll();}

    @Override
    public void insert(Simulacro s) {sR.save(s);}

    @Override
    public Simulacro listarId(int idSimulacro) {return sR.findById(idSimulacro).orElse(new Simulacro());}

    @Override
    public void delete(int idSimulacro) {sR.deleteById(idSimulacro);}

    @Override
    public void update(Simulacro s) {sR.save(s);}
}

