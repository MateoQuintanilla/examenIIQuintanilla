package com.edu.espe.examen.quintanilla.examen.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class EmpleadosRQ {
    private Integer cedulaDeIdentidad;
    private String apellidos;
    private String nombres;
    private Integer numeroDeCuenta;
}
