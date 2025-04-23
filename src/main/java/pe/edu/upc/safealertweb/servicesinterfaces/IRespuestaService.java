package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.ComentarioConsulta;
import pe.edu.upc.safealertweb.entities.Respuesta;

import java.util.List;

public interface IRespuestaService {
    public List<Respuesta> list();
    public void insert(Respuesta re);
    public Respuesta listarId(int idRespuesta);
    public void delete(int idRespuesta);
    public void update(Respuesta re);
}
