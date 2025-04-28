package pe.edu.upc.safealertweb.servicesinterfaces;
import pe.edu.upc.safealertweb.entities.ComentarioConsulta;

import java.time.LocalDate;
import java.util.List;


public interface IComentarioConsultaService {
    public List<ComentarioConsulta> list();
    public void insert(ComentarioConsulta co);
    public ComentarioConsulta listarId(int idComentario);
    public void delete(int idComentario);
    public void update(ComentarioConsulta co);
    public List<String[]> contarcomentariousuario();
}
