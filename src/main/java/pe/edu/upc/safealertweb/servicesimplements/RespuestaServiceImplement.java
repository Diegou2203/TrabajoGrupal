package pe.edu.upc.safealertweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.safealertweb.entities.ComentarioConsulta;
import pe.edu.upc.safealertweb.entities.Respuesta;
import pe.edu.upc.safealertweb.repositories.IComentarioConsultaRepository;
import pe.edu.upc.safealertweb.repositories.IRespuestaRepository;
import pe.edu.upc.safealertweb.servicesinterfaces.IRespuestaService;

import java.util.List;

@Service
public class RespuestaServiceImplement implements IRespuestaService {
    @Autowired
    private IRespuestaRepository reR;

    @Override
    public List<Respuesta> list() {
        return reR.findAll();
    }

    @Override
    public void insert(Respuesta re) {
        reR.save(re);
    }

    @Override
    public Respuesta listarId(int idRespuesta) {
        return reR.findById(idRespuesta).orElse(new Respuesta());
    }

    @Override
    public void delete(int idRespuesta) {
        reR.deleteById(idRespuesta);
    }

    @Override
    public void update(Respuesta re) {
        reR.save(re);
    }

    @Override
    public List<String[]> cantidadRespuestasPorComentario() {
        return reR.cantidadRespuestasPorComentario();
    }
}
