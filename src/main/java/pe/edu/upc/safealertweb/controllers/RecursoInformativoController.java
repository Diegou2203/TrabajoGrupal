package pe.edu.upc.safealertweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.CantidadRecursoxUsuarioDTO;
import pe.edu.upc.safealertweb.dtos.RecursoInformativoDTO;
import pe.edu.upc.safealertweb.entities.RecursoInformativo;
import pe.edu.upc.safealertweb.servicesinterfaces.IRecursoInformativoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("recursoinformativo")
public class RecursoInformativoController {
    @Autowired
    private IRecursoInformativoService riS;

    @GetMapping
    public List<RecursoInformativoDTO> listarRecursosInformativos() {
        return riS.list().stream().map(x -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, RecursoInformativoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody RecursoInformativoDTO riDTO) {
        ModelMapper modelMapper = new ModelMapper();
        RecursoInformativo ri = modelMapper.map(riDTO, RecursoInformativo.class);
        riS.insert(ri);
    }

    @GetMapping("/{idRecursoInformativo}")
    public RecursoInformativoDTO listarPorId(@PathVariable("idRecursoInformativo") int idRecursoInformativo) {
        ModelMapper modelMapper = new ModelMapper();
        RecursoInformativoDTO riDTO = modelMapper.map(riS.listarId(idRecursoInformativo), RecursoInformativoDTO.class);
        return riDTO;
    }

    @DeleteMapping("/{idRecursoInformativo}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminarPorId(@PathVariable("idRecursoInformativo") int idRecursoInformativo) {
        riS.delete(idRecursoInformativo);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody RecursoInformativoDTO riDTO) {
        ModelMapper modelMapper = new ModelMapper();
        RecursoInformativo ri = modelMapper.map(riDTO, RecursoInformativo.class);
        riS.update(ri);
    }

    @GetMapping("/CantidadRecursosPorUsuario")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CantidadRecursoxUsuarioDTO> cantidadRecursos() {
        List<CantidadRecursoxUsuarioDTO> dtoLista = new ArrayList<>();
        List<String[]> filaLista = riS.cantidadRecursosPorUsuario();
        for (String[] columna : filaLista) {
            CantidadRecursoxUsuarioDTO dto = new CantidadRecursoxUsuarioDTO();
            dto.setApellido(columna[0]);
            dto.setUsername(columna[1]);
            dto.setCantidad(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
