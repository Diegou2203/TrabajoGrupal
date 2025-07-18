package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.TipoFenomeno;

@Repository
public interface ITipoFenomenoRepository extends JpaRepository<TipoFenomeno, Integer> {
}
