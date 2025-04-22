package TestSteps;

import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.*;
import model.Empleado;
import service.NotificacionService;

public class NotificarEmpleadoSteps {

    private Empleado empleado;
    private String mensaje;
    private boolean notificado;
    private NotificacionService service = new NotificacionService();

    @Given("un empleado con ID {int}")
    public void un_empleado_con_ID(Integer id) {
        empleado = new Empleado();
        empleado.setId(id);
    }

    @When("envío una notificación con el mensaje {string}")
    public void envio_una_notificacion_con_el_mensaje(String msg) {
        mensaje = msg;
        notificado = service.enviarNotificacion(empleado, mensaje);
    }

    @Then("el empleado debe recibir la notificación")
    public void el_empleado_debe_recibir_la_notificacion() {
        assertTrue(notificado);
    }
}

