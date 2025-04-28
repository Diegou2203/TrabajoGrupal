package pe.edu.upc.safealertweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.CantidadNotificacionxUserDTO;
import pe.edu.upc.safealertweb.dtos.NotificacionAlertaDTO;
import pe.edu.upc.safealertweb.entities.NotificacionAlerta;
import pe.edu.upc.safealertweb.servicesinterfaces.INotificacionAlertaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("notificacionalerta")
public class NotificacionAlertaController {
    @Autowired
    private INotificacionAlertaService naS;

    @GetMapping
    public List<NotificacionAlertaDTO> listarSimulacros() {
        return naS.list().stream().map(x -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, NotificacionAlertaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody NotificacionAlertaDTO naDTO) {
        ModelMapper modelMapper = new ModelMapper();
        NotificacionAlerta na = modelMapper.map(naDTO, NotificacionAlerta.class);
        naS.insert(na);
    }

    @GetMapping("/{idNotificacionAlerta}")
    public NotificacionAlertaDTO listarPorId(@PathVariable("idNotificacionAlerta") int idNotificacionAlerta) {
        ModelMapper modelMapper = new ModelMapper();
        NotificacionAlertaDTO naDTO = modelMapper.map(naS.listarId(idNotificacionAlerta), NotificacionAlertaDTO.class);
        return naDTO;
    }

    @DeleteMapping("/{idNotificacionAlerta}")
    public void eliminar(@PathVariable("idNotificacionAlerta") int idNotificacionAlerta) {
        naS.delete(idNotificacionAlerta);
    }

    @PutMapping
    public void modificar(@RequestBody NotificacionAlertaDTO naDTO) {
        ModelMapper modelMapper = new ModelMapper();
        NotificacionAlerta na = modelMapper.map(naDTO, NotificacionAlerta.class);
        naS.update(na);
    }

    @GetMapping("/CantidadNotificacionesRevisadasPorUsuario")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CantidadNotificacionxUserDTO> cantidadNotificaciones(){
        List<CantidadNotificacionxUserDTO> dtoLista = new ArrayList<>();
        List<String[]> filaLista=naS.quantityNotificacionPorUser();
        for(String[] columna:filaLista){
            CantidadNotificacionxUserDTO dto = new CantidadNotificacionxUserDTO();
            dto.setUsername(columna[0]);
            dto.setApellido(columna[1]);
            dto.setCantidad(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}
