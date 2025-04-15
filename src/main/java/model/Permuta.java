package model;

/**
 * Gestiona las solicitudes de permuta de turno entre empleados.
 */
public class Permuta {
    private int id;
    private String estado; // Ejemplo: "pendiente", "aceptada", "rechazada"

    /**
     * Crea una solicitud de permuta.
     */
    public void solicitar() {
        // TODO: Implementar lógica de solicitud de permuta
    }

    /**
     * Acepta o rechaza una propuesta de permuta.
     */
    public void aceptar() {
        // TODO: Implementar lógica para aceptar o rechazar la permuta
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}

