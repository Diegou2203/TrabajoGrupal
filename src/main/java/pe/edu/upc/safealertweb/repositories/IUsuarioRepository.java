package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.safealertweb.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value = "SELECT u.username, u.telefono, u.correo, ub.ciudad\n" +
            "FROM usuario u \n" +
            "INNER JOIN ubicacion ub ON u.id_ubicacion = ub.id_ubicacion\n" +
            "INNER JOIN fenomeno_natural fn ON ub.id_ubicacion = fn.id_ubicacion\n" +
            "WHERE UPPER(fn.intensidad) = 'ALTA' AND fn.activo = true\n" +
            "GROUP BY u.username, u.telefono, u.correo, ub.ciudad",
            nativeQuery = true)
    public List<String[]> findUsuariosEnZonasDeAltoRiesgo();

    public Usuario findOneByUsername(String username);


}
