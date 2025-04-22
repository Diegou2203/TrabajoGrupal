package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.safealertweb.entities.Respuesta;

public interface IRespuestaRepository extends JpaRepository<Respuesta, Integer> {
}
