package service;

import model.Empleado;

public class NotificacionService {
    public boolean enviarNotificacion(Empleado empleado, String mensaje) {
        // Lógica para enviar la notificación
        // Aquí se simula el envío de la notificación
        System.out.println("Notificación enviada a " + empleado.getId() + ": " + mensaje);
        return true; // Simulando que la notificación fue enviada con éxito
    }
}
