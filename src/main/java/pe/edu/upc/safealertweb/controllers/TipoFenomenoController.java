package pe.edu.upc.safealertweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.TipoFenomenoDTO;
import pe.edu.upc.safealertweb.entities.TipoFenomeno;
import pe.edu.upc.safealertweb.servicesimplements.TipoFenomenoServiceImplement;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("tipofenomeno")
public class TipoFenomenoController {

    private TipoFenomenoServiceImplement tS;

    @GetMapping
    public List<TipoFenomenoDTO> listartipofenomeno() {
        return tS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, TipoFenomenoDTO.class);
        }).collect(Collectors.toList());
    }

    //POST
    @PostMapping
    public void insertar(@RequestBody TipoFenomenoDTO tfDTO){
        ModelMapper modelMapper = new ModelMapper();
        TipoFenomeno tf= modelMapper.map(tfDTO, TipoFenomeno.class);
        tS.insert(tf);
    }

    //GET POR ID
    @GetMapping("/{idTipoFenomeno}")
    public TipoFenomenoDTO listarId(@PathVariable("idTipoFenomeno") int idTipoFenomeno) {
        ModelMapper m = new ModelMapper();
        TipoFenomenoDTO tfDTO = m.map(tS.listarId(idTipoFenomeno), TipoFenomenoDTO.class);
        return tfDTO;
    }

    //DELETE
    @DeleteMapping("/{idTipoFenomeno}")
    public void eliminar(@PathVariable("idTipoFenomeno") int idTipoFenomeno) {
        tS.delete(idTipoFenomeno);
    }

    //PUT
    @PutMapping
    public void modificar(@RequestBody TipoFenomenoDTO tfDTO) {
        ModelMapper m = new ModelMapper();
        TipoFenomeno tf = m.map(tfDTO, TipoFenomeno.class);
        tS.update(tf);
    }

}