package pe.edu.upc.safealertweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.ContarRespuestaDTO;
import pe.edu.upc.safealertweb.dtos.CantidadRespuestaxComentarioDTO;
import pe.edu.upc.safealertweb.dtos.ComentarioConsultaDTO;
import pe.edu.upc.safealertweb.dtos.RespuestaDTO;
import pe.edu.upc.safealertweb.entities.ComentarioConsulta;
import pe.edu.upc.safealertweb.entities.Respuesta;
import pe.edu.upc.safealertweb.servicesinterfaces.IComentarioConsultaService;
import pe.edu.upc.safealertweb.servicesinterfaces.IRespuestaService;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("respuesta")
public class RespuestaController {
    @Autowired
    private IRespuestaService reS;

    //GET TODA LA LISTA
    @GetMapping("/VerRespuesta")
    public List<RespuestaDTO> listarrespuesta() {
        return reS.list().stream().map(x -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, RespuestaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/BusquedasPorTitulo")
    public List<RespuestaDTO> buscar(@RequestParam String t) {
        return reS.buscarportitulo(t).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RespuestaDTO.class);
        }).collect(Collectors.toList());
    }
    //POST
    @PostMapping("/InsertarRespuesta")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody RespuestaDTO reDto) {
        ModelMapper modelMapper = new ModelMapper();
        Respuesta re = modelMapper.map(reDto, Respuesta.class);
        reS.insert(re);
    }

    //GET POR ID
    @GetMapping("/{idRespuesta}")
    public RespuestaDTO listarId(@PathVariable("idRespuesta") int idRespuesta) {
        ModelMapper m = new ModelMapper();
        RespuestaDTO reDTO = m.map(reS.listarId(idRespuesta), RespuestaDTO.class);
        return reDTO;
    }

    //DELETE
    @DeleteMapping("/{idRespuesta}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("idRespuesta") int idRespuesta) {
        reS.delete(idRespuesta);
    }


    //PUT
    @PutMapping("/ModificiarRespuesta")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody RespuestaDTO reDTO) {
        ModelMapper m = new ModelMapper();
        Respuesta re = m.map(reDTO, Respuesta.class);
        reS.update(re);
    }

    @GetMapping("/CantidadRespuestasPorAdmin")
    public List<ContarRespuestaDTO> cantidadPorrespuesta() {
        List<ContarRespuestaDTO> dtoLista = new ArrayList<>();
        List<String[]> filaLista = reS.contarrespuesta();
        for (String[] columna : filaLista) {
            ContarRespuestaDTO dto = new ContarRespuestaDTO();
            dto.setIdRol(Integer.parseInt(columna[0]));
            dto.setContarrespuesta(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/CantidadRespuestasPorComentario")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CantidadRespuestaxComentarioDTO> cantidadRespuestas() {
        List<CantidadRespuestaxComentarioDTO> dtoLista = new ArrayList<>();
        List<String[]> filaLista = reS.cantidadRespuestasPorComentario();
        for (String[] columna : filaLista) {
            CantidadRespuestaxComentarioDTO dto = new CantidadRespuestaxComentarioDTO();
            dto.setContenido(columna[0]);
            dto.setEstado(columna[1]);
            dto.setCantidad(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
