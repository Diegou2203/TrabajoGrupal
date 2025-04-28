package pe.edu.upc.safealertweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;
import pe.edu.upc.safealertweb.entities.Respuesta;

import java.util.List;

public interface IRespuestaRepository extends JpaRepository<Respuesta, Integer> {
    @Query("SELECT \n" +
            "    r\n" +
            "FROM \n" +
            "    Respuesta r\n" +
            "WHERE \n" +
            "    r.titulo LIKE %:titulo%")
    public List<Respuesta> buscartitulo(@Param("titulo") String titulo);

    @Query(value = "SELECT \n" +
            "    r.id_rol, \n" +
            "    COUNT(*) AS cantidad_respuestas\n" +
            "FROM \n" +
            "    Respuesta resp\n" +
            "INNER JOIN \n" +
            "    Rol r ON resp.id_rol = r.id_rol\n" +
            "GROUP BY \n" +
            "    r.id_rol",nativeQuery = true)
    public List<String[]> contarrespuesta();

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta, Integer> {
    @Query(value = "SELECT cc.contenido, cc.estado, COUNT(id_respuesta) \n" +
            "FROM comentario_consulta cc INNER JOIN respuesta r ON cc.id_comentario=r.id_comentario \n" +
            "WHERE r.fechacreacion = CURRENT_DATE GROUP BY cc.contenido, cc.estado", nativeQuery = true)
    public List<String[]> cantidadRespuestasPorComentario();

}
