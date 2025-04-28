package pe.edu.upc.safealertweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="Simulacro")
public class Simulacro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSimulacro;

    @Column(name = "titulo",nullable = false, length = 20)
    private String titulo;

    @Column(name = "fecha_hora",nullable = false)
    private LocalDate fecha_hora;

    @Column(name = "duracion_minutos",nullable = false)
    private int duracion_minutos;

    @Column(name = "tipo",nullable = false, length = 50)
    private String tipo;

    @Column(name = "es_nacional",nullable = false)
    private boolean es_nacional;

    @ManyToOne
    @JoinColumn(name="idUbicacion")
    private Ubicacion ubicacion;

    public Simulacro() {
    }

    public Simulacro(int idSimulacro, String titulo, LocalDate fecha_hora, int duracion_minutos, String tipo, boolean es_nacional) {
        this.idSimulacro = idSimulacro;
        this.titulo = titulo;
        this.fecha_hora = fecha_hora;
        this.duracion_minutos = duracion_minutos;
        this.tipo = tipo;
        this.es_nacional = es_nacional;
    }

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

