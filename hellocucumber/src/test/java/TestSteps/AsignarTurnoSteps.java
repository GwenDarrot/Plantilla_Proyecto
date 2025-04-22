package TestSteps;

import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AsignarTurnoSteps {

    private int idEmpleado;
    private boolean asignacionExitosa;

    @Given("un turno con ID de empleado {int}")
    public void un_turno_con_ID_de_empleado(Integer id) {
        // Simulamos que recibimos un ID válido
        this.idEmpleado = id;
        System.out.println("ID del empleado recibido: " + idEmpleado);
    }

    @When("asigno el turno")
    public void asigno_el_turno() {
        // Simulación simple de asignación exitosa
        if (idEmpleado > 0) {
            asignacionExitosa = true;
        } else {
            asignacionExitosa = false;
        }
    }

    @Then("el resultado debe ser exitoso")
    public void el_resultado_debe_ser_exitoso() {
        // Validamos que la asignación fue exitosa
        assertTrue(asignacionExitosa, "La asignación no fue exitosa");
    }
}
