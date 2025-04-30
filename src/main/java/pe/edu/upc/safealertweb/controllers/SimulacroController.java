package pe.edu.upc.safealertweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.SimulacroDTO;
import pe.edu.upc.safealertweb.entities.Simulacro;
import pe.edu.upc.safealertweb.servicesinterfaces.ISimulacroService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("simulacro")
public class SimulacroController {

    @Autowired
    private ISimulacroService sS;

    //GET TODA LA LISTA
    @GetMapping("/VerSimulacro")
    public List<SimulacroDTO> listarSimulacros(){
        return sS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, SimulacroDTO.class);
        }).collect(Collectors.toList());
    }

    //POST
    @PostMapping("/InsertarSimulacro")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody SimulacroDTO sDTO){
        ModelMapper modelMapper = new ModelMapper();
        Simulacro s= modelMapper.map(sDTO, Simulacro.class);
        sS.insert(s);
    }

    //GET POR ID
    @GetMapping("/{idSimulacro}")
    public SimulacroDTO listarId(@PathVariable("idSimulacro") int idSimulacro) {
        ModelMapper m = new ModelMapper();
        SimulacroDTO sDTO = m.map(sS.listarId(idSimulacro), SimulacroDTO.class);
        return sDTO;
    }

    //DELETE
    @DeleteMapping("/{idSimulacro}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("idSimulacro") int idSimulacro) {
        sS.delete(idSimulacro);
    }


    //PUT
    @PutMapping("/ModificarSimulacro")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody SimulacroDTO sDTO) {
        ModelMapper m = new ModelMapper();
        Simulacro s = m.map(sDTO, Simulacro.class);
        sS.update(s);
    }

}
