package pe.edu.upc.safealertweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.safealertweb.entities.TipoFenomeno;
import pe.edu.upc.safealertweb.repositories.ITipoFenomenoRepository;
import pe.edu.upc.safealertweb.servicesinterfaces.ITipoFenomenoService;

import java.util.List;

@Service
public class TipoFenomenoServiceImplement implements ITipoFenomenoService {

    @Autowired
    private ITipoFenomenoRepository tR;

    @Override
    public List<TipoFenomeno> list() {
        return tR.findAll();
    }

    @Override
    public void insert(TipoFenomeno tf) {
        tR.save(tf);
    }

    @Override
    public TipoFenomeno listarId(int idTipoFenomeno) {
        return tR.findById(idTipoFenomeno).orElse(new TipoFenomeno());
    }

    @Override
    public void delete(int idTipoFenomeno) {
        tR.deleteById(idTipoFenomeno);
    }

    @Override
    public void update(TipoFenomeno tf) {
        tR.save(tf);
    }
}
