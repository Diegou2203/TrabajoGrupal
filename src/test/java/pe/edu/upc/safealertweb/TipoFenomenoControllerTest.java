package pe.edu.upc.safealertweb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import pe.edu.upc.safealertweb.controllers.TipoFenomenoController;
import pe.edu.upc.safealertweb.dtos.TipoFenomenoDTO;
import pe.edu.upc.safealertweb.entities.FenomenoNatural;
import pe.edu.upc.safealertweb.entities.TipoFenomeno;
import pe.edu.upc.safealertweb.servicesimplements.TipoFenomenoServiceImplement;

import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TipoFenomenoControllerTest  {
    @Mock
    private TipoFenomenoServiceImplement tS;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private TipoFenomenoController tipoFenomenoController;

    private TipoFenomeno tipoFenomeno;
    private TipoFenomenoDTO tipoFenomenoDTO;
    private FenomenoNatural fenomenoNatural;

    @BeforeEach
    void setUp() {
        // Configuración de FenomenoNatural (FK)
        fenomenoNatural = new FenomenoNatural();
        fenomenoNatural.setIdFenomenoNatural(1);
        fenomenoNatural.setNombre_fenomeno("Inundación");

        // Configuración de TipoFenomeno (Entidad)
        tipoFenomeno = new TipoFenomeno();
        tipoFenomeno.setIdTipoFenomeno(1);
        tipoFenomeno.setDescripcion("Agua que invade zonas costeras");
        tipoFenomeno.setFenomenoNatural(fenomenoNatural);

        // Configuración de TipoFenomenoDTO (DTO)
        tipoFenomenoDTO = new TipoFenomenoDTO();
        tipoFenomenoDTO.setIdTipoFenomeno(1);
        tipoFenomenoDTO.setDescripcion("Agua que invade zonas costeras");
        tipoFenomenoDTO.setFenomenoNatural(fenomenoNatural);
    }

    @Test
    void testListarTipoFenomeno() {
        when(tS.list()).thenReturn(Arrays.asList(tipoFenomeno));

        List<TipoFenomenoDTO> result = tipoFenomenoController.listartipofenomeno();

        assertEquals(1, result.size());
        assertEquals(tipoFenomeno.getDescripcion(), result.get(0).getDescripcion());
    }

    @Test
    void testInsertarTipoFenomeno() {
        TipoFenomenoDTO dto = new TipoFenomenoDTO();
        dto.setIdTipoFenomeno(2);
        dto.setDescripcion("Deslizamiento");
        dto.setFenomenoNatural(fenomenoNatural);

        // Ejecutar
        tipoFenomenoController.insertar(dto);

        // Verificar
        verify(tS).insert(any(TipoFenomeno.class));
    }

    @Test
    void testListarIdTipoFenomeno() {

        int id = 1;
        TipoFenomeno tipoFenomeno = new TipoFenomeno();
        tipoFenomeno.setIdTipoFenomeno(id);
        tipoFenomeno.setDescripcion("Inundación");
        tipoFenomeno.setFenomenoNatural(fenomenoNatural);

        when(tS.listarId(id)).thenReturn(tipoFenomeno);

        // Act
        TipoFenomenoDTO result = tipoFenomenoController.listarId(id);

        // Assert
        assertNotNull(result);
        assertEquals(id, result.getIdTipoFenomeno());
        assertEquals("Inundación", result.getDescripcion());
    }


    @Test
    void testEliminar() {
        tipoFenomenoController.eliminar(1);

        verify(tS).delete(1);
    }

    @Test
    void testModificarTipoFenomeno() {
        TipoFenomenoDTO dto = new TipoFenomenoDTO();
        dto.setIdTipoFenomeno(2);
        dto.setDescripcion("Deslizamiento Modificado");
        dto.setFenomenoNatural(fenomenoNatural);

        // Ejecuta
        tipoFenomenoController.modificar(dto);

        // Verifica
        verify(tS).update(any(TipoFenomeno.class));
    }

}
