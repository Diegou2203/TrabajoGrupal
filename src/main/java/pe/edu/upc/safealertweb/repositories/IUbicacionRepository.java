package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.safealertweb.entities.Ubicacion;

public interface IUbicacionRepository extends JpaRepository<Ubicacion, Integer> {
}
