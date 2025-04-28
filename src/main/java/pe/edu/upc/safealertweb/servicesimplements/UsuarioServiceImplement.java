package pe.edu.upc.safealertweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.safealertweb.entities.Usuario;
import pe.edu.upc.safealertweb.repositories.IUsuarioRepository;
import pe.edu.upc.safealertweb.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    public List<Usuario> list() {return uR.findAll();}

    @Override
    public void insert(Usuario u) {uR.save(u);}

    @Override
    public Usuario listarId(int idUsuario) {return uR.findById(idUsuario).orElse(new Usuario());}

    @Override
    public void delete(int idUsuario) {uR.deleteById(idUsuario);}

    @Override
    public void update(Usuario u) {uR.save(u);}

    @Override
    public List<String[]> findUsuariosEnZonasDeAltoRiesgo() {
        return uR.findUsuariosEnZonasDeAltoRiesgo();
    }
}
