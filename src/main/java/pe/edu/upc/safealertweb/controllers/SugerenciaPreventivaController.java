package pe.edu.upc.safealertweb.controllers;

import jakarta.persistence.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.SugerenciaPreventivaDTO;
import pe.edu.upc.safealertweb.entities.SugerenciaPreventiva;
import pe.edu.upc.safealertweb.servicesinterfaces.ISugerenciaPreventivaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("SugerenciaPreventiva")
public class SugerenciaPreventivaController {

    @Autowired
    private ISugerenciaPreventivaService suS;

    @GetMapping
    public List<SugerenciaPreventivaDTO> listarSugerenciaPreventiva(){
        return suS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, SugerenciaPreventivaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody SugerenciaPreventivaDTO suDTO){
        ModelMapper modelMapper = new ModelMapper();
        SugerenciaPreventiva su= modelMapper.map(suDTO, SugerenciaPreventiva.class);
        suS.insert(su);
    }

    @GetMapping("/{idSugerenciaPreventiva}")
    public SugerenciaPreventivaDTO listarId(@PathVariable("idSugerenciaPreventiva") int idSugerenciaPreventiva) {
        ModelMapper m = new ModelMapper();
        SugerenciaPreventivaDTO suDTO = m.map(suS.listarId(idSugerenciaPreventiva), SugerenciaPreventivaDTO.class);
        return suDTO;
    }
    @DeleteMapping("/{idSugerenciaPreventiva}")
    public void eliminar(@PathVariable("idSugerenciaPreventiva") int idSugerenciaPreventiva) {suS.delete(idSugerenciaPreventiva);
    }
    @PutMapping
    public void modificar(@RequestBody SugerenciaPreventiva suDTO) {
        ModelMapper m = new ModelMapper();
        SugerenciaPreventiva s = m.map(suDTO, SugerenciaPreventiva.class);
        suS.update(s);
    }
}
