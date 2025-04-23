package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.ComentarioConsulta;

import java.util.List;

@Repository
public interface IComentarioConsultaRepository extends JpaRepository<ComentarioConsulta,Integer> {

}
