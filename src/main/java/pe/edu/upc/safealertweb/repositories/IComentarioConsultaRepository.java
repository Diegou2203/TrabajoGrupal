package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.safealertweb.entities.ComentarioConsulta;

import java.util.List;

public interface IComentarioConsultaRepository extends JpaRepository<ComentarioConsulta,Integer> {

}
