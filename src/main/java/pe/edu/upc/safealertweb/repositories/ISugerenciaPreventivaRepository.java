package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.SugerenciaPreventiva;

@Repository
public interface ISugerenciaPreventivaRepository extends JpaRepository<SugerenciaPreventiva, Integer> {
}
