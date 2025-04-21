package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.safealertweb.entities.SugerenciaPreventiva;

public interface ISugerenciaPreventivaRepository  extends JpaRepository<SugerenciaPreventiva, Integer> {
}
