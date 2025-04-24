package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.safealertweb.entities.FenomenoNatural;

import java.util.List;

@Repository
public interface IFenomenoNaturalRepository extends JpaRepository<FenomenoNatural, Integer> {

    @Query(value="SELECT u.ciudad, COUNT(fn.id_fenomeno_natural) AS CantidadFemonemos\n" +
            "FROM ubicacion u\n" +
            "INNER JOIN fenomeno_natural fn ON u.id_ubicacion=fn.id_ubicacion\n" +
            "GROUP BY u.ciudad", nativeQuery = true)
    public List<String[]> quantityFenomenoPorUbicacion();

}
