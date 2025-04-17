package repository;

import model.Turno;
import java.util.ArrayList;
import java.util.List;

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
