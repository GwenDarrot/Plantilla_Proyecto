package model;

/**
 * Representa a un empleado del hospital.
 * Permite gestionar turnos, solicitar permutas y vacaciones.
 */
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String rol; // "empleado" o "administrador"

    /**
     * Muestra los turnos asignados al empleado.
     */
    public void verTurnos() {
        // TODO: Implementar la lógica de visualización de turnos
    }

    /**
     * Envía una solicitud de permuta.
     */
    public void solicitarPermuta() {
        // TODO: Implementar solicitud de permuta
    }

    /**
     * Envía una solicitud de vacaciones.
     */
    public void solicitarVacaciones() {
        // TODO: Implementar solicitud de vacaciones
    }

    // Getters y Setters (opcional, o usar Lombok para evitar boilerplate)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}

