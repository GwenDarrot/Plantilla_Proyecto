Feature: Asignar Turno

  Scenario: Asignar un turno válido
    Given un turno con ID de empleado 1
    When asigno el turno
    Then el resultado debe ser exitoso