package model;
import java.time.LocalDateTime;

/**
 * Representa un turno asignado a un empleado.
 * Un turno puede estar en estados: "trabajando", "descansando" o "en expectativa".
 */
public class Turno {
    private int id;
    private LocalDateTime fecha;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private String estado;

    /**
     * Asigna un turno al empleado.
     */
    public void asignarTurno() {
        // TODO: Implementar asignación de turno
    }

    /**
     * Finaliza un turno y actualiza su estado.
     */
    public void finalizarTurno() {
        // TODO: Implementar finalización del turno y lógica de periodo de descanso
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

    public LocalDateTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalDateTime horaInicio) { this.horaInicio = horaInicio; }

    public LocalDateTime getHoraFin() { return horaFin; }
    public void setHoraFin(LocalDateTime horaFin) { this.horaFin = horaFin; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public void asignarTurno(String date, String time, String time1) {
    }
}

