package service;
import model.Turno;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Servicio para gestionar operaciones sobre turnos.
 */
public class TurnoService {

    /**
     * Asigna un turno a un empleado.
     */
    public void asignarTurno(Turno turno) {
        // TODO: Integrar lógica de asignación de turno y comunicación con TurnoRepository
    }

    /**
     * Finaliza un turno y activa el período de descanso.
     */
    public void finalizarTurno(Turno turno) {
        if ("trabajando".equals(turno.getEstado())) {
            turno.setEstado("descanso");
            turno.setHoraFin(LocalDateTime.now());
            // Lógica de notificación...
        }
    }

    /**
     * Retorna la lista de turnos de un empleado.
     */
    public List<Turno> obtenerTurnosPorEmpleado(int empleadoId) {
        // TODO: Implementar consulta a repositorio para obtener turnos
        return null;
    }
}
