package pe.edu.upc.safealertweb.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.safealertweb.dtos.ComentarioConsultaDTO;
import pe.edu.upc.safealertweb.dtos.ContarComentarioDTO;
import pe.edu.upc.safealertweb.entities.ComentarioConsulta;
import pe.edu.upc.safealertweb.servicesinterfaces.IComentarioConsultaService;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("comentario")
public class ComentarioConsultaController {

    @Autowired
    private IComentarioConsultaService coS;
    //GET TODA LA LISTA
    @GetMapping("/VerComentarios")
    public List<ComentarioConsultaDTO> listarcomentario(){
        return coS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, ComentarioConsultaDTO.class);
        }).collect(Collectors.toList());
    }

    //POST
    @PostMapping("/InsertarComentarios")
    public void insertar(@RequestBody ComentarioConsultaDTO coDto){
        ModelMapper modelMapper = new ModelMapper();
        ComentarioConsulta co= modelMapper.map(coDto, ComentarioConsulta.class);
        coS.insert(co);
    }

    //GET POR ID
    @GetMapping("/{idComentario}")
    public ComentarioConsultaDTO listarId(@PathVariable("idComentario") int idComentario) {
        ModelMapper m = new ModelMapper();
        ComentarioConsultaDTO coDTO = m.map(coS.listarId(idComentario), ComentarioConsultaDTO.class);
        return coDTO;
    }

    //DELETE
    @DeleteMapping("/{idComentario}")
    public void eliminar(@PathVariable("idComentario") int idComentario) {
        coS.delete(idComentario);
    }



    //PUT
    @PutMapping("/ModificarComentarios")
    public void modificar(@RequestBody ComentarioConsultaDTO coDTO) {
        ModelMapper m = new ModelMapper();
        ComentarioConsulta co = m.map(coDTO, ComentarioConsulta.class);
        coS.update(co);
    }

    @GetMapping("/CantidadesComentariosPorUsuario")
    public List<ContarComentarioDTO> cantidadPorcomentario() {
        List<ContarComentarioDTO> dtoLista = new ArrayList<>();
        List<String[]> filaLista = coS.contarcomentariousuario();
        for (String[] columna : filaLista) {
            ContarComentarioDTO dto = new ContarComentarioDTO();
            dto.setNombre(columna[0]);
            dto.setContarcomentario(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
