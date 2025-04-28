package pe.edu.upc.safealertweb.dtos;

import pe.edu.upc.safealertweb.entities.Ubicacion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SimulacroDTO {
    private int idSimulacro;
    private String titulo;
    private LocalDate fecha_hora;
    private int duracion_minutos;
    private String tipo;
    private boolean es_nacional;
    private Ubicacion ubicacion;


    public int getIdSimulacro() {
        return idSimulacro;
    }

    public void setIdSimulacro(int idSimulacro) {
        this.idSimulacro = idSimulacro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public int getDuracion_minutos() {
        return duracion_minutos;
    }

    public void setDuracion_minutos(int duracion_minutos) {
        this.duracion_minutos = duracion_minutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEs_nacional() {
        return es_nacional;
    }

    public void setEs_nacional(boolean es_nacional) {
        this.es_nacional = es_nacional;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
