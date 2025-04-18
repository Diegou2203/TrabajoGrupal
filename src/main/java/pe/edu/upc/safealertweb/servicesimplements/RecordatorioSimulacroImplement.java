package pe.edu.upc.safealertweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.safealertweb.repositories.IRecordatorioSimulacroRepository;
import pe.edu.upc.safealertweb.servicesinterfaces.IRecordatorioSimulacroService;
import pe.edu.upc.safealertweb.entities.RecordatorioSimulacro;

import java.util.List;

@Service
public class RecordatorioSimulacroImplement implements IRecordatorioSimulacroService {

    @Autowired
    private IRecordatorioSimulacroRepository rsR;

    @Override
    public List<RecordatorioSimulacro> list() {return rsR.findAll();}

    @Override
    public void insert(RecordatorioSimulacro rs) {rsR.save(rs);}

    @Override
    public RecordatorioSimulacro listarId(int idRecordatorioSimulacro) {return rsR.findById(idRecordatorioSimulacro).orElse(new RecordatorioSimulacro());}

    @Override
    public void delete(int idRecordatorioSimulacro) {rsR.deleteById(idRecordatorioSimulacro);}

    @Override
    public void update(RecordatorioSimulacro rs) {rsR.save(rs);}
}
