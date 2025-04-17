package repository;
import model.Turno;
import java.util.ArrayList;
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
    List<Turno> findAll();

    /**
     * Implementación concreta de TurnoRepository.
     */
    public class TurnoRepositoryImpl implements TurnoRepository {

        private final List<Turno> turnos = new ArrayList<>();

        @Override
        public void save(Turno turno) {
            turnos.add(turno);
            System.out.println("Turno guardado: " + turno);
        }

        @Override
        public List<Turno> findAll() {
            return new ArrayList<>(turnos);
        }
    }
}

