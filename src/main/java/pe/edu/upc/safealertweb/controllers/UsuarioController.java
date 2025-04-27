package pe.edu.upc.safealertweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.UsuarioDTO;
import pe.edu.upc.safealertweb.dtos.UsuariosAltoRiesgoDTO;
import pe.edu.upc.safealertweb.entities.Usuario;
import pe.edu.upc.safealertweb.servicesinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService uS;

    @GetMapping
    public List<UsuarioDTO> listarUsuario(){
        return uS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertarUsuario(@RequestBody UsuarioDTO fNDto){
        ModelMapper modelMapper = new ModelMapper();
        Usuario fn= modelMapper.map(fNDto, Usuario.class);
        uS.insert(fn);
    }


    @GetMapping("/{idUsuario}")
    public UsuarioDTO listarId(@PathVariable("idUsuario") int idUsuario) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO uDTO = m.map(uS.listarId(idUsuario), UsuarioDTO.class);
        return uDTO;
    }


    @DeleteMapping("/{idUsuario}")
    public void eliminarUsuario(@PathVariable("idUsuario") int idFenomenoNatural) {
        uS.delete(idFenomenoNatural);
    }


    //PUT
    @PutMapping
    public void modificarUsuario(@RequestBody Usuario fnDTO) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(fnDTO, Usuario.class);
        uS.update(u);
    }

    @GetMapping("/altoriesgo")
    public List<UsuariosAltoRiesgoDTO> ListarUsuariosEnZonasDeAltoRiesgo() {
        List<String[]> data = uS.findUsuariosEnZonasDeAltoRiesgo();
        List<UsuariosAltoRiesgoDTO> dtos = new ArrayList<>();

        for (String[] row : data) {
            UsuariosAltoRiesgoDTO dto = new UsuariosAltoRiesgoDTO();
            dto.setNombre(row[0]);
            dto.setTelefono(row[1]);
            dto.setCorreo(row[2]);
            dto.setCiudad(row[3]);
            dtos.add(dto);
        }
        return dtos;
    }
}
