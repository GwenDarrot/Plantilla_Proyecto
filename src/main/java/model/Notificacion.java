package model;

import java.time.LocalDate;

/**
 * Se encarga del envío de notificaciones a los empleados y administradores.
 * Se integra con el sistema interno de correos del hospital.
 */
public class Notificacion {
    private int id;
    private String mensaje;
    private LocalDate fecha;

    /**
     * Envía una notificación.
     */
    public void enviarNotificacion() {
        // TODO: Integrar el mecanismo de envío de notificaciones (correo, SMS, etc.)
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}

