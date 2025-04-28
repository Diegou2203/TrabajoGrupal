package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.Respuesta;

import java.util.List;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta, Integer> {
    @Query(value = "SELECT cc.contenido, cc.estado, COUNT(id_respuesta)\n" +
            "FROM comentario_consulta cc\n" +
            "INNER JOIN respuesta r ON cc.id_comentario = r.id_comentario\n" +
            "GROUP BY cc.contenido, cc.estado", nativeQuery = true)
    public List<String[]> cantidadRespuestasPorComentario();
}
