import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import model.Turno;
import org.junit.jupiter.api.Test;
import repository.TurnoRepository;
import service.TurnoService;

public class TurnoServiceTest {

    @Test
    public void testAsignarTurnoValido() {
        // Crear un mock de TurnoRepository
        TurnoRepository mockRepo = mock(TurnoRepository.class);
        TurnoService service = new TurnoService(mockRepo);
        Turno turno = new Turno();
        turno.setId(1);
        boolean resultado = service.asignarTurno(turno);
        assertTrue(resultado);

        // Validar que se haya llamado el método save con el turno
        verify(mockRepo, times(1)).save(turno);
    }

    @Test
    public void testAsignarTurnoInvalido() {
        // Crear un mock de TurnoRepository
        TurnoRepository mockRepo = mock(TurnoRepository.class);
        TurnoService service = new TurnoService(mockRepo);
        Turno turno = new Turno();
        turno.setId(0);
        boolean resultado = service.asignarTurno(turno);
        assertFalse(resultado);
    }
}
