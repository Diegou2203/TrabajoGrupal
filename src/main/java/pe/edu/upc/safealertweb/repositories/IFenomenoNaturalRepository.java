package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.FenomenoNatural;

import java.util.List;

@Repository
public interface IFenomenoNaturalRepository extends JpaRepository<FenomenoNatural, Integer> {

    @Query(value="SELECT u.ciudad, COUNT(fn.id_fenomeno_natural) AS CantidadFemonemos\n" +
            "FROM ubicacion u\n" +
            "INNER JOIN fenomeno_natural fn ON u.id_ubicacion=fn.id_ubicacion\n" +
            "GROUP BY u.ciudad", nativeQuery = true)
    public List<String[]> quantityFenomenoPorUbicacion();

    @Query(value = "SELECT intensidad, " +
            "EXTRACT(YEAR FROM fecha_fenomeno) AS año, " +
            "COUNT(*) AS cantidad " +
            "FROM fenomeno_natural " +
            "GROUP BY intensidad, EXTRACT(YEAR FROM fecha_fenomeno) " +
            "ORDER BY año, cantidad DESC",
            nativeQuery = true)
    public List<String[]> findHistoricoFenomenosPorIntensidad();
}
