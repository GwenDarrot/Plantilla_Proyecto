package repository;
import model.Turno;
import java.util.List;

/**
 * Repositorio para la persistencia de datos de turnos.
 */
public interface TurnoRepository {

    /**
     * Guarda un turno en la base de datos.
     */
    void save(Turno turno);

    /**
     * Retorna la lista de turnos de un empleado.
     */
    List<Turno> findByEmpleadoId(int empleadoId);
}

