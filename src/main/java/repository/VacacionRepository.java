package repository;
import model.Vacacion;

/**
 * Repositorio para la persistencia de datos de vacaciones.
 */
public interface VacacionRepository {

    /**
     * Guarda una solicitud de vacaciones.
     */
    void save(Vacacion vacacion);
}

