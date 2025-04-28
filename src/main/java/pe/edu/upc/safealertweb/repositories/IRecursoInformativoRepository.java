package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.RecursoInformativo;

import java.util.List;

@Repository
public interface IRecursoInformativoRepository extends JpaRepository<RecursoInformativo, Integer> {
    @Query(value = "SELECT u.apellido, u.nombre, COUNT(id_recurso_informativo) \n" +
            "FROM usuario u INNER JOIN recurso_informativo ri ON u.id_usuario=ri.id_usuario \n" +
            "WHERE ri.fecha_publicacion = CURRENT_DATE GROUP BY u.apellido, u.nombre", nativeQuery = true)
    public List<String[]> cantidadRecursosPorUsuario();
}
