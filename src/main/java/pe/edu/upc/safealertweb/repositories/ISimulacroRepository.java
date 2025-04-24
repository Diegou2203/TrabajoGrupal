package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.Simulacro;

@Repository
public interface ISimulacroRepository extends JpaRepository<Simulacro, Integer> {
}
