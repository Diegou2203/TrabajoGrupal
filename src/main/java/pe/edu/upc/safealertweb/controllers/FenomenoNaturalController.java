package pe.edu.upc.safealertweb.controllers;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.CantidadUbicacionxFDTO;
import pe.edu.upc.safealertweb.dtos.FenomenoNaturalDTO;
import pe.edu.upc.safealertweb.dtos.HistoricoFenomenosDTO;
import pe.edu.upc.safealertweb.entities.FenomenoNatural;
import pe.edu.upc.safealertweb.servicesinterfaces.IFenomenoNaturalService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("fenomeno")
@Slf4j
public class FenomenoNaturalController {
    @Autowired
    private IFenomenoNaturalService fnS;
    //GET TODA LA LISTA
    @GetMapping
    public List<FenomenoNaturalDTO> listarUbicaciones(){
        log.info("Solicitud GET para obtener fenomenos naturales");
        return fnS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, FenomenoNaturalDTO.class);
        }).collect(Collectors.toList());
    }

    //POST
    @PostMapping
    public void insertar(@RequestBody FenomenoNaturalDTO fNDto){
        log.info("Solicitud POST para insertar fenomeno natural: "+fNDto.getNombre_fenomeno());
        ModelMapper modelMapper = new ModelMapper();
        FenomenoNatural fn= modelMapper.map(fNDto, FenomenoNatural.class);
        fnS.insert(fn);
    }

    //GET POR ID
    @GetMapping("/{idFenomenoNatural}")
    public FenomenoNaturalDTO listarId(@PathVariable("idFenomenoNatural") int idFenomenoNatural) {
        log.info("Solicitud GET para poder obtener el fenomeno natural: "+ idFenomenoNatural);
        ModelMapper m = new ModelMapper();
        FenomenoNaturalDTO fnDTO = m.map(fnS.listarId(idFenomenoNatural), FenomenoNaturalDTO.class);
        return fnDTO;
    }

    //DELETE
    @DeleteMapping("/{idFenomenoNatural}")
    public void eliminar(@PathVariable("idFenomenoNatural") int idFenomenoNatural) {
        log.warn("Solicitud DELETE del fenomeno natural: "+idFenomenoNatural);
        fnS.delete(idFenomenoNatural);
    }



    //PUT
    @PutMapping
    public void modificar(@RequestBody FenomenoNaturalDTO fnDTO) {
        log.info("Solicitud PUT del fenomeno natural: " + fnDTO.getIdFenomenoNatural());
        ModelMapper m = new ModelMapper();
        FenomenoNatural fn = m.map(fnDTO, FenomenoNatural.class);
        fnS.update(fn);
    }

    @GetMapping("/CantidadFenomenosNaturalesPorUbicacion")
    public List<CantidadUbicacionxFDTO> cantidadFenomeno(){
        log.info("Solicitud GET para obtener la cantidad de fenomenos por ubicacion");
        List<CantidadUbicacionxFDTO> dtoLista = new ArrayList<>();
        List<String[]> filaLista=fnS.quantityFenomenoPorUbicacion();
        for(String[] columna:filaLista){
            CantidadUbicacionxFDTO dto = new CantidadUbicacionxFDTO();
            dto.setCiudad(columna[0]);
            dto.setCantidad(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/HistoricoPorIntensidad")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<HistoricoFenomenosDTO> obtenerHistoricoPorIntensidad() {
        log.info("Solicitud GET para obtener el historial de fenomenos por intensidad");
        List<String[]> data = fnS.findHistoricoFenomenosPorIntensidad();
        List<HistoricoFenomenosDTO> dtos = new ArrayList<>();

        for (String[] row : data) {
            HistoricoFenomenosDTO dto = new HistoricoFenomenosDTO();
            dto.setIntensidad(row[0]);
            dto.setamio(Integer.parseInt(row[1]));
            dto.setCantidad(Integer.parseInt(row[2]));
            dtos.add(dto);
        }
        return dtos;
    }
}
