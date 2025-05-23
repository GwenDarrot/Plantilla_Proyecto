package service;
import model.Notificacion;
import model.Turno;
import repository.TurnoRepository;
import repository.TurnoRepositoryImpl;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Servicio para gestionar operaciones sobre turnos.
 */
public class TurnoService {

    private final TurnoRepository turnoRepository;

    public TurnoService(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    // Constructor sin argumentos que inicializa el repositorio por defecto.
    public TurnoService() {
        this.turnoRepository = new TurnoRepositoryImpl();
    }

    /**
     * Asigna un turno a un empleado.
     *
     * @return
     */
    public boolean asignarTurno(Turno turno) {
        // TODO: Integrar lógica de asignación de turno y comunicación con TurnoRepository
        if (turno.getId() <= 0) {
            return false;
        }

        // Usar el repositorio inyectado
        turnoRepository.save(turno);

        return true;
    }

    /**
     * Finaliza un turno y activa el período de descanso.
     */
    public static void finalizarTurno(Turno turno) {
        if ("trabajando".equals(turno.getEstado())) {
            turno.setEstado("descanso");
            turno.setHoraFin(LocalDateTime.now());
            // Simular notificación
            Notificacion notificacion = new Notificacion();
            notificacion.setMensaje("Turno finalizado. Descanso de 12 horas iniciado.");
            notificacion.enviarNotificacion();

            // Persistir cambios
            TurnoRepository repository = new TurnoRepositoryImpl();
            repository.save(turno);
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
