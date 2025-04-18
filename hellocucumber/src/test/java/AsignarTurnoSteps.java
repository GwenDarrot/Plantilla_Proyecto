import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.*;
import model.Turno;
import service.TurnoService;

public class AsignarTurnoSteps {

    private Turno turno;
    private boolean resultado;
    private TurnoService service = new TurnoService();

    @Given("un turno con ID de empleado {int}")
    public void un_turno_con_ID_de_empleado(Integer id) {
        turno = new Turno();
        turno.setId(id);
    }

    @When("asigno el turno")
    public void asigno_el_turno() {
        resultado = service.asignarTurno(turno);
    }

    @Then("el resultado debe ser exitoso")
    public void el_resultado_debe_ser_exitoso() {
        assertTrue(resultado);
    }
}
