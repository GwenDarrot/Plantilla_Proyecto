import model.Turno;
import service.TurnoService;

import java.time.LocalDateTime;

/**
 * Clase principal para iniciar la aplicación.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de Gestión de Turnos y Solicitudes del Personal Hospitalario");
        // Se puede invocar la lógica de servicios para pruebas o inicializaciones

        // Crear un turno con estado inicial "trabajando"
        Turno turno = new Turno();
        turno.setId(1);
        turno.setFecha(LocalDateTime.now().toLocalDate().atStartOfDay());
        turno.setHoraInicio(LocalDateTime.now());
        turno.setEstado("trabajando");

        // Crear una instancia del servicio
        TurnoService turnoService = new TurnoService();

        // Llamar al método finalizarTurno
        System.out.println("Finalizando el turno...");
        turnoService.finalizarTurno(turno);

        // Verificar el estado del turno después de finalizarlo
        System.out.println("Estado del turno después de finalizar: " + turno.getEstado());
    }

}