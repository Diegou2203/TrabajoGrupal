package pe.edu.upc.safealertweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.ComentarioConsultaDTO;
import pe.edu.upc.safealertweb.dtos.RespuestaDTO;
import pe.edu.upc.safealertweb.entities.ComentarioConsulta;
import pe.edu.upc.safealertweb.entities.Respuesta;
import pe.edu.upc.safealertweb.servicesinterfaces.IComentarioConsultaService;
import pe.edu.upc.safealertweb.servicesinterfaces.IRespuestaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("respuesta")
public class RespuestaController {
    @Autowired
    private IRespuestaService reS;
    //GET TODA LA LISTA
    @GetMapping
    public List<RespuestaDTO> listarrespuesta(){
        return reS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, RespuestaDTO.class);
        }).collect(Collectors.toList());
    }

    //POST
    @PostMapping
    public void insertar(@RequestBody RespuestaDTO reDto){
        ModelMapper modelMapper = new ModelMapper();
        Respuesta re= modelMapper.map(reDto, Respuesta.class);
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
    public void eliminar(@PathVariable("idRespuesta") int idRespuesta) {
        reS.delete(idRespuesta);
    }



    //PUT
    @PutMapping
    public void modificar(@RequestBody Respuesta reDTO) {
        ModelMapper m = new ModelMapper();
        Respuesta re = m.map(reDTO, Respuesta.class);
        reS.update(re);
    }
}
