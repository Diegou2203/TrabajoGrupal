package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.NotificacionAlerta;

import java.util.List;

@Repository
public interface INotificacionAlertaRepository extends JpaRepository<NotificacionAlerta, Integer> {

    @Query(value="SELECT u.username, u.apellido, COUNT(id_notificacion_alerta)\n" +
            "FROM usuario u\n" +
            "INNER JOIN notificacion_alerta nt ON u.id_usuario=nt.id_usuario\n" +
            "WHERE nt.notificacion_revisada=true\n" +
            "GROUP BY u.username, u.apellido", nativeQuery = true)
    public List<String[]> quantityNotificacionesPorUsuario();
}
