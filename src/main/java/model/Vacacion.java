package model;

import java.time.LocalDate;

/**
 * Gestiona las solicitudes de vacaciones de los empleados.
 */
public class Vacacion {
    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado; // Ejemplo: "pendiente", "aprobada", "rechazada"

    /**
     * Solicita vacaciones para el empleado.
     */
    public void solicitar() {
        // TODO: Implementar solicitud de vacaciones
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}

