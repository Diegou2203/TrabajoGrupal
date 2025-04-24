package pe.edu.upc.safealertweb.entities;

import ch.qos.logback.core.model.NamedModel;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "RecordatorioSimulacro")
public class RecordatorioSimulacro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecordatorioSimulacro;

    @Column(name = "fecha_recordatorio", nullable = false)
    private LocalDate fecha_recordatorio;

    @Column(name = "metodo_envio", nullable = false, length = 30)
    private String metodo_envio;

    @Column(name = "estado", nullable = false, length = 30)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idSimulacro")
    private Simulacro simulaco;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    public Usuario usuario;

    public RecordatorioSimulacro() { }

    public RecordatorioSimulacro(int idRecordatorioSimulacro, LocalDate fecha_recordatorio, String metodo_envio, String estado, Simulacro simulaco,  Usuario usuario) {
        this.idRecordatorioSimulacro = idRecordatorioSimulacro;
        this.fecha_recordatorio = fecha_recordatorio;
        this.metodo_envio = metodo_envio;
        this.estado = estado;
        this.simulaco = simulaco;
        this.usuario = usuario;
    }

    public int getIdRecordatorioSimulacro() { return idRecordatorioSimulacro; }

    public void setIdRecordatorioSimulacro(int idRecordatorioSimulacro) { this.idRecordatorioSimulacro = idRecordatorioSimulacro; }

    public LocalDate getFecha_recordatorio() { return fecha_recordatorio; }

    public void  setFecha_recordatorio(LocalDate fecha_recordatorio) { this.fecha_recordatorio = fecha_recordatorio; }

    public String getMetodo_envio() { return metodo_envio; }

    public void setMetodo_envio(String metodo_envio) {this.metodo_envio = metodo_envio;}

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    public Simulacro getSimulaco() { return simulaco; }

    public void setSimulaco(Simulacro simulaco) { this.simulaco = simulaco; }

    public Usuario getUsuario() { return usuario; }

    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}
