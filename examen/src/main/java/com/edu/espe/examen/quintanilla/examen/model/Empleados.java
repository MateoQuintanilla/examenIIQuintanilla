package com.edu.espe.examen.quintanilla.examen.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Empleados {

    private Integer cedulaDeIdentidad;
    private String apellidos;
    private String nombres;
    private Integer numeroDeCuenta;
}
