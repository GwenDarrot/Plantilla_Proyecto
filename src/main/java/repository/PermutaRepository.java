package repository;
import model.Permuta;

/**
 * Repositorio para la persistencia de datos de permutas.
 */
public interface PermutaRepository {

    /**
     * Guarda una solicitud de permuta.
     */
    void save(Permuta permuta);
}

