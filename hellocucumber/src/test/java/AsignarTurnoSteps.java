import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.*;
import model.Turno;
import service.TurnoService;


public class AsignarTurnoSteps {

    private Turno turno;
    private boolean resultado;
    private TurnoService service = new TurnoService();

    @Given("un turno con ID de empleado {int}")
    public void un_turno_con_ID_de_empleado(Integer int1) {
        turno = new Turno();
        turno.setId(int1);
        throw new io.cucumber.java.PendingException();
    }

    @When("asigno el turno")
    public void asigno_el_turno() {
        resultado = service.asignarTurno(turno);
        throw new io.cucumber.java.PendingException();
    }

    @Then("el resultado debe ser exitoso")
    public void el_resultado_debe_ser_exitoso() {
        assertTrue(resultado);
        throw new io.cucumber.java.PendingException();
    }
}
