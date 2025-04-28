package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value = "SELECT u.username, u.telefono, u.correo, ub.ciudad " +
            "FROM usuario u " +
            "INNER JOIN ubicacion ub ON u.id_ubicacion = ub.id_ubicacion " +
            "INNER JOIN fenomeno_natural fn ON ub.id_ubicacion = fn.id_ubicacion " +
            "WHERE UPPER(fn.intensidad) = 'ALTA' AND fn.activo = true",
            nativeQuery = true)
    public List<String[]> findUsuariosEnZonasDeAltoRiesgo();
}
