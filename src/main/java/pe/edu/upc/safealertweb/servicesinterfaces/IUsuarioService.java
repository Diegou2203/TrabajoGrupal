package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> list();
    public void insert(Usuario u);
    public Usuario listarId(int idUsuario);
    public void delete(int idUsuario);
    public void update(Usuario fn);

    public List<String[]> findUsuariosEnZonasDeAltoRiesgo();
}
