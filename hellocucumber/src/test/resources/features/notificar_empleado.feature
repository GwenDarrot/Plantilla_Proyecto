Feature: Notificar Empleado

  Scenario: Enviar notificación a un empleado
    Given un empleado con ID 1
    When envío una notificación con el mensaje "Turno asignado"
    Then el empleado debe recibir la notificación