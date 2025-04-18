package pe.edu.upc.safealertweb.dtos;

import pe.edu.upc.safealertweb.entities.RecordatorioSimulacro;
import pe.edu.upc.safealertweb.entities.Simulacro;
import pe.edu.upc.safealertweb.entities.Usuario;

import java.time.LocalDate;

public class RecordatorioSimulacroDTO {

    private int idRecordatorioSimulacro;
    private LocalDate fecha_recordatorio;
    private String metodo_envio;
    private String estado;
    private Simulacro simulaco;
    public Usuario usuario;

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
