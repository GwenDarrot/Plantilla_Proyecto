import static org.junit.jupiter.api.Assertions.*;

import model.Turno;
import org.junit.jupiter.api.Test;
import service.TurnoService;

public class TurnoServiceTest {

    @Test
    public void testAsignarTurnoValido() {
        TurnoService service = new TurnoService();
        Turno turno = new Turno();
        turno.setId(1);
        boolean resultado = service.asignarTurno(turno);
        assertTrue(resultado);
    }

    @Test
    public void testAsignarTurnoInvalido() {
        TurnoService service = new TurnoService();
        Turno turno = new Turno();
        turno.setId(0);
        boolean resultado = service.asignarTurno(turno);
        assertFalse(resultado);
    }
}
